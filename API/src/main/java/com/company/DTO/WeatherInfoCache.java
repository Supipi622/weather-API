package com.company.DTO;

import java.time.LocalDateTime;

public class WeatherInfoCache {
    private WeatherInfo info;
    private LocalDateTime lastUpdated;

    public WeatherInfoCache(WeatherInfo info, LocalDateTime lastUpdated) {
        this.info = info;
        this.lastUpdated = lastUpdated;
    }

    public WeatherInfoCache() {
    }

    public WeatherInfo getInfo() {
        return info;
    }

    public void setInfo(WeatherInfo info) {
        this.info = info;
    }

    public LocalDateTime getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(LocalDateTime lastUpdated) {
        this.lastUpdated = lastUpdated;
    }
}
