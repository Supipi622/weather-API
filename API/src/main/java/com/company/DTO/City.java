package com.company.DTO;

import com.fasterxml.jackson.annotation.JsonProperty;

public class City {
    private String CityCode;
    private String CityName;
    private String Temp;
    private String Status;

    public String getCityCode() {
        return CityCode;
    }

    @JsonProperty("CityCode")
    public void setCityCode(String cityCode) {
        CityCode = cityCode;
    }

    public String getCityName() {
        return CityName;
    }

    @JsonProperty("CityName")
    public void setCityName(String cityName) {
        CityName = cityName;
    }

    public String getTemp() {
        return Temp;
    }

    @JsonProperty("Temp")
    public void setTemp(String temp) {
        Temp = temp;
    }

    public String getStatus() {
        return Status;
    }

    @JsonProperty("Status")
    public void setStatus(String status) {
        Status = status;
    }
}
