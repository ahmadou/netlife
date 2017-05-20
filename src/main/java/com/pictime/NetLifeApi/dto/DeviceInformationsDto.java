package com.pictime.NetLifeApi.dto;

/**
 * Created by pictime on 20/05/17.
 */
public class DeviceInformationsDto {

    private PersonnalInformations personnalInformations;
    private Address address;
    private Health health;
    private Nutrition nutrition;

    public DeviceInformationsDto(PersonnalInformations personnalInformations, Address address, Health health, Nutrition nutrition) {
        this.personnalInformations = personnalInformations;
        this.address = address;
        this.health = health;
        this.nutrition = nutrition;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public PersonnalInformations getPersonnalInformations() {
        return personnalInformations;
    }

    public void setPersonnalInformations(PersonnalInformations personnalInformations) {
        this.personnalInformations = personnalInformations;
    }

    public Health getHealth() {
        return health;
    }

    public void setHealth(Health health) {
        this.health = health;
    }

    public Nutrition getNutrition() {
        return nutrition;
    }

    public void setNutrition(Nutrition nutrition) {
        this.nutrition = nutrition;
    }
}
