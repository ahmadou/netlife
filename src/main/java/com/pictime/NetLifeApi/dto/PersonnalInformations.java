package com.pictime.NetLifeApi.dto;

/**
 * Created by pictime on 20/05/17.
 */
public class PersonnalInformations {
    private String name;
    private String surname;
    private String birthdate;
    private String weight;
    private String height;
    private Address address;

    public PersonnalInformations(String name, String surname, String birthdate, String weight, String height, Address address) {
        this.name = name;
        this.surname = surname;
        this.birthdate = birthdate;
        this.weight = weight;
        this.height = height;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
