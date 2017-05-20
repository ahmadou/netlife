package com.pictime.NetLifeApi;

/**
 * Created by pictime on 20/05/17.
 */
public class Person {
    private String parentNumber;
    private String parentName;
    private String parentSurname;
    private String name;
    private String surname;
    private String location;

    public Person(String parentNumber, String parentName, String parentSurname, String name, String surname, String location) {
        this.parentNumber = parentNumber;
        this.parentName = parentName;
        this.parentSurname = parentSurname;
        this.name = name;
        this.surname = surname;
        this.location = location;
    }


    public String getParentNumber() {
        return parentNumber;
    }

    public void setParentNumber(String parentNumber) {
        this.parentNumber = parentNumber;
    }

    public String getParentName() {
        return parentName;
    }

    public void setParentName(String parentName) {
        this.parentName = parentName;
    }

    public String getParentSurname() {
        return parentSurname;
    }

    public void setParentSurname(String parentSurname) {
        this.parentSurname = parentSurname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
