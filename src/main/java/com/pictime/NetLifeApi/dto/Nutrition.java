package com.pictime.NetLifeApi.dto;

import java.util.List;

/**
 * Created by pictime on 20/05/17.
 */
public class Nutrition {
    private List<String> allergies;

    public Nutrition(List<String> allergies) {
        this.allergies = allergies;
    }

    public List<String> getAllergies() {
        return allergies;
    }

    public void setAllergies(List<String> allergies) {
        this.allergies = allergies;
    }
}
