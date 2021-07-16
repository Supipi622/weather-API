
package com.company.DTO.WeathermapResp;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "temp",
    "pressure",
    "humidity",
    "temp_min",
    "temp_max"
})

public class Main {

    @JsonProperty("temp")
    private int temp;

    @JsonProperty("feels_like")
    private int feelsLike;

    @JsonProperty("pressure")
    private int pressure;
    @JsonProperty("humidity")
    private int humidity;
    @JsonProperty("temp_min")
    private int tempMin;
    @JsonProperty("temp_max")
    private int tempMax;

    @JsonProperty("temp")
    public int getTemp() {
        return temp;
    }

    @JsonProperty("temp")
    public void setTemp(int temp) {
        this.temp = temp;
    }

    @JsonProperty("feels_like")
    public int getFeelsLike() {
        return feelsLike;
    }

    @JsonProperty("feels_like")
    public void setFeelsLike(int feelsLike) {
        this.feelsLike = feelsLike;
    }

    @JsonProperty("pressure")
    public int getPressure() {
        return pressure;
    }

    @JsonProperty("pressure")
    public void setPressure(int pressure) {
        this.pressure = pressure;
    }

    @JsonProperty("humidity")
    public int getHumidity() {
        return humidity;
    }

    @JsonProperty("humidity")
    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    @JsonProperty("temp_min")
    public int getTempMin() {
        return tempMin;
    }

    @JsonProperty("temp_min")
    public void setTempMin(int tempMin) {
        this.tempMin = tempMin;
    }

    @JsonProperty("temp_max")
    public int getTempMax() {
        return tempMax;
    }

    @JsonProperty("temp_max")
    public void setTempMax(int tempMax) {
        this.tempMax = tempMax;
    }

}
