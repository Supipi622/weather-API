package com.company.DTO;

import com.company.DTO.City;
import com.fasterxml.jackson.annotation.JsonProperty;

public class CityMapInput {
    private City[] List;

    public City[] getList() {
        return List;
    }

    @JsonProperty("List")
    public void setList(City[] list) {
        List = list;
    }
}
