
package com.company.DTO.WeathermapResp;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "all"
})

public class Clouds {

    @JsonProperty("all")
    private int all;

    @JsonProperty("all")
    public int getAll() {
        return all;
    }

    @JsonProperty("all")
    public void setAll(int all) {
        this.all = all;
    }

}
