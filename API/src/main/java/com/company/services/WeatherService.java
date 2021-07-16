package com.company.services;

import com.company.DTO.City;
import com.company.DTO.CityMapInput;
import com.company.DTO.WeatherInfo;
import com.company.DTO.WeatherInfoCache;
import com.company.DTO.WeathermapResp.Entry;
import com.company.DTO.WeathermapResp.WeatherResponse;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

public class WeatherService {
    private static final int cacheMaxLife = 5;
    private static final String OpenWeatherMapUrl = " http://api.openweathermap.org/data/2.5/group?id=%s&units=metric&appid=b0ce7c710f2238938268ed6c46c85d08";
    private static WeatherService onjInstance;
    private City[] cities;
    private Map<String, WeatherInfoCache> weatherInfoCacheMap;
    
    private WeatherService(){
        String inputString = null;
        try {
            inputString = new String ( Files.readAllBytes( Paths.get("./cities.json") ) );
            CityMapInput cityMapInput = new ObjectMapper().readValue(inputString, CityMapInput.class);
            cities = cityMapInput.getList();
        } catch (IOException e) {
            e.printStackTrace();
        }
        weatherInfoCacheMap = new HashMap<>();
    }

    public static WeatherService getWeatherService(){
        if(onjInstance == null){
            onjInstance = new WeatherService();
        }
        return onjInstance;
    }

    public WeatherInfo GetWeatherInfo(String city){
        String cityCode = getCityCode(city);
        if(cityCode == null){
            return null;
        }

        if(weatherInfoCacheMap.containsKey(cityCode) && Duration.between(weatherInfoCacheMap.get(cityCode).getLastUpdated(), LocalDateTime.now()).toMinutes() < cacheMaxLife){
            return weatherInfoCacheMap.get(cityCode).getInfo();
        }

        try {
            WeatherInfo weatherInfo = FetchWeatherInfo(cityCode);

            weatherInfoCacheMap.put(cityCode, new WeatherInfoCache(weatherInfo, LocalDateTime.now()));
            return weatherInfo;

        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }

    }

    private WeatherInfo FetchWeatherInfo(String cityCode) throws IOException {

            URL url = new URL(String.format(OpenWeatherMapUrl,cityCode));

// Open a connection(?) on the URL(??) and cast the response(???)
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

// Now it's "open", we can set the request method, headers etc.
            connection.setRequestProperty("accept", "application/json");

// This line makes the request
            InputStream responseStream = connection.getInputStream();

// Manually converting the response body InputStream to APOD using Jackson
            ObjectMapper mapper = new ObjectMapper();
            //APOD apod = mapper.readValue(responseStream, APOD.class);
            WeatherResponse response = new ObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false).readValue(responseStream, WeatherResponse.class);

// Finally we have the response
            System.out.println("hello");
            return mapWeatherResponseToWeatherInfo(response);
    }

    private WeatherInfo mapWeatherResponseToWeatherInfo(WeatherResponse response) {
        Entry entry = response.getList().get(0);

        WeatherInfo outPut = new WeatherInfo();
        outPut.setId(entry.getId());
        outPut.setName(entry.getName());
        outPut.setDt(entry.getDt());
        outPut.setCountry(entry.getSys().getCountry());
        outPut.setSunrise(entry.getSys().getSunrise());
        outPut.setSunset(entry.getSys().getSunset());
        outPut.setWeatherMain(entry.getWeather().get(0).getMain());
        outPut.setWeatherDescription(entry.getWeather().get(0).getDescription());
        outPut.setMainTemp(entry.getMain().getTemp());
        outPut.setMainPressure(entry.getMain().getPressure());
        outPut.setMainHumidity(entry.getMain().getHumidity());
        outPut.setMainTempMin(entry.getMain().getTempMin());
        outPut.setMainTempMax(entry.getMain().getTempMax());
        outPut.setVisibility(entry.getVisibility());
        outPut.setWindSpreed(entry.getWind().getSpeed());
        outPut.setWindDeg(entry.getWind().getDeg());
        outPut.setCloudsAll(entry.getClouds().getAll());

        return outPut;
    }

    private String getCityCode(String city) {
        for (City item: cities
             ) {

            if(item.getCityName().equals(city)){
                return item.getCityCode();
            }
        }
        return null;
    }
}
