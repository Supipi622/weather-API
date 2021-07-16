package com.company.DTO;

public class WeatherInfo {
    private int id;
    private String name;
    private int dt;
    private String country;
    private long sunrise;
    private long sunset;
    private String weatherMain;
    private String weatherDescription;
    private float mainTemp;
    private int mainPressure;
    private int mainHumidity;
    private int mainTempMin;
    private int mainTempMax;
    private int Visibility;
    private float windSpreed;
    private int windDeg;
    private int cloudsAll;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDt() {
        return dt;
    }

    public void setDt(int dt) {
        this.dt = dt;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public long getSunrise() {
        return sunrise;
    }

    public void setSunrise(long sunrise) {
        this.sunrise = sunrise;
    }

    public long getSunset() {
        return sunset;
    }

    public void setSunset(long sunset) {
        this.sunset = sunset;
    }

    public String getWeatherMain() {
        return weatherMain;
    }

    public void setWeatherMain(String weatherMain) {
        this.weatherMain = weatherMain;
    }

    public String getWeatherDescription() {
        return weatherDescription;
    }

    public void setWeatherDescription(String weatherDescription) {
        this.weatherDescription = weatherDescription;
    }

    public float getMainTemp() {
        return mainTemp;
    }

    public void setMainTemp(float mainTemp) {
        this.mainTemp = mainTemp;
    }

    public int getMainPressure() {
        return mainPressure;
    }

    public void setMainPressure(int mainPressure) {
        this.mainPressure = mainPressure;
    }

    public int getMainHumidity() {
        return mainHumidity;
    }

    public void setMainHumidity(int mainHumidity) {
        this.mainHumidity = mainHumidity;
    }

    public int getMainTempMin() {
        return mainTempMin;
    }

    public void setMainTempMin(int mainTempMin) {
        this.mainTempMin = mainTempMin;
    }

    public int getMainTempMax() {
        return mainTempMax;
    }

    public void setMainTempMax(int mainTempMax) {
        this.mainTempMax = mainTempMax;
    }

    public int getVisibility() {
        return Visibility;
    }

    public void setVisibility(int visibility) {
        Visibility = visibility;
    }

    public float getWindSpreed() {
        return windSpreed;
    }

    public void setWindSpreed(float windSpreed) {
        this.windSpreed = windSpreed;
    }

    public int getWindDeg() {
        return windDeg;
    }

    public void setWindDeg(int windDeg) {
        this.windDeg = windDeg;
    }

    public int getCloudsAll() {
        return cloudsAll;
    }

    public void setCloudsAll(int cloudsAll) {
        this.cloudsAll = cloudsAll;
    }
}
