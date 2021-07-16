
package com.company.DTO.WeathermapResp;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "type",
    "id",
    "message",
    "country",
    "sunrise",
    "sunset"
})
public class Sys {

    @JsonProperty("type")
    private int type;
    @JsonProperty("id")
    private int id;
    @JsonProperty("message")
    private float message;
    @JsonProperty("country")
    private String country;

    @JsonProperty("timezone")
    private int timezone;
    @JsonProperty("sunrise")
    private int sunrise;
    @JsonProperty("sunset")
    private int sunset;

    @JsonProperty("type")
    public int getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(int type) {
        this.type = type;
    }

    @JsonProperty("id")
    public int getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(int id) {
        this.id = id;
    }

    @JsonProperty("message")
    public float getMessage() {
        return message;
    }

    @JsonProperty("message")
    public void setMessage(float message) {
        this.message = message;
    }

    @JsonProperty("country")
    public String getCountry() {
        return country;
    }

    @JsonProperty("country")
    public void setCountry(String country) {
        this.country = country;
    }

    @JsonProperty("timezone")
    public int getTimezone() {
        return timezone;
    }

    @JsonProperty("timezone")
    public void setTimezone(int timezone) {
        this.timezone = timezone;
    }

    @JsonProperty("sunrise")
    public int getSunrise() {
        return sunrise;
    }

    @JsonProperty("sunrise")
    public void setSunrise(int sunrise) {
        this.sunrise = sunrise;
    }

    @JsonProperty("sunset")
    public int getSunset() {
        return sunset;
    }

    @JsonProperty("sunset")
    public void setSunset(int sunset) {
        this.sunset = sunset;
    }

}
