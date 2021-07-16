package com.company;

import com.company.DTO.City;
import com.company.DTO.CityMapInput;
import com.company.DTO.WeatherInfo;
import com.company.services.WeatherService;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;


public class Main{


    public static void main(String[] args)
    {


        WeatherService weatherService = WeatherService.getWeatherService();
        WeatherInfo resultColombo =  weatherService.GetWeatherInfo("Colombo");
        WeatherInfo resultTokyo =  weatherService.GetWeatherInfo("Tokyo");
        WeatherInfo resultLiverpool =  weatherService.GetWeatherInfo("Liverpool");
        WeatherInfo resultParis =  weatherService.GetWeatherInfo("Paris");

        WeatherInfo resultParis2 =  weatherService.GetWeatherInfo("Paris");
        try {
            Thread.sleep(1000*60*6);
            WeatherInfo resultParis3 =  weatherService.GetWeatherInfo("Paris");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
