package com.pictime.NetLifeApi.dto;

/**
 * Created by pictime on 20/05/17.
 */
public class Address {
    private String parentSurname;
    private String mainLocation;
    private String phoneNumber;

    public Address(String parentSurname, String mainLocation, String phoneNumber) {
        this.parentSurname = parentSurname;
        this.mainLocation = mainLocation;
        this.phoneNumber = phoneNumber;
    }

    public String getParentSurname() {
        return parentSurname;
    }

    public void setParentSurname(String parentSurname) {
        this.parentSurname = parentSurname;
    }

    public String getMainLocation() {
        return mainLocation;
    }

    public void setMainLocation(String mainLocation) {
        this.mainLocation = mainLocation;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
