
package com.company.DTO.WeathermapResp;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "cnt",
    "list"
})
public class WeatherResponse {

    @JsonProperty("cnt")
    private int cnt;
    @JsonProperty("list")
    private List<Entry> list = null;

    @JsonProperty("cnt")
    public int getCnt() {
        return cnt;
    }

    @JsonProperty("cnt")
    public void setCnt(int cnt) {
        this.cnt = cnt;
    }

    @JsonProperty("list")
    public List<Entry> getList() {
        return list;
    }

    @JsonProperty("list")
    public void setList(List<Entry> list) {
        this.list = list;
    }

}
