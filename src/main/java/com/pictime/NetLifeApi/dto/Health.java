package com.pictime.NetLifeApi.dto;

import java.util.List;

/**
 * Created by pictime on 20/05/17.
 */
public class Health {
    private String lastVaccine;
    private String nextVaccine;
    private List<String> allergies;

    public Health(String lastVaccine, String nextVaccine, List<String> allergies) {
        this.lastVaccine = lastVaccine;
        this.nextVaccine = nextVaccine;
        this.allergies = allergies;
    }

    public String getLastVaccine() {
        return lastVaccine;
    }

    public void setLastVaccine(String lastVaccine) {
        this.lastVaccine = lastVaccine;
    }

    public String getNextVaccine() {
        return nextVaccine;
    }

    public void setNextVaccine(String nextVaccine) {
        this.nextVaccine = nextVaccine;
    }

    public List<String> getAllergies() {
        return allergies;
    }

    public void setAllergies(List<String> allergies) {
        this.allergies = allergies;
    }
}
