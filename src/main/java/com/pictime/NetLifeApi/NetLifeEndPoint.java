package com.pictime.NetLifeApi;

import com.pictime.NetLifeApi.dto.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.*;

/**
 * Created by pictime on 20/05/17.
 */

@Controller
public class NetLifeEndPoint {

    private DeviceInformationsDto properties;

    private List<DeviceInformationsDto> persons = initPersons();

    private DeviceInformationsDto currentPerson = null;

    private List<Product> products = initProducts();

    private static List<Product> initProducts(){
        List<Product> products = new ArrayList<Product>();

        products.add(new Product("pain", "gluten", 12.5));
        products.add(new Product("fromage", "lait", 30.0));
        products.add(new Product("petit beurre", "gluten", 15.0));
        products.add(new Product("biscuit apero", "arachide", 98.99));
        products.add(new Product("beurre", "lait", 41.99));
        products.add(new Product("couche", "coton", 87.0));
        return products;
    }

    private static List<DeviceInformationsDto> initPersons(){
        List<DeviceInformationsDto> deviceInformationsDtos = new ArrayList<DeviceInformationsDto>();
        Address address = new Address("Sophie", "Nice", "01.11.11.11.11");
        PersonnalInformations personnalInformation = new PersonnalInformations("barbry", "benjamin", "01/01/2016", "10", "80", address);
        List<String> foodAllergies = new ArrayList<String>();
        foodAllergies.add("gluten");
        List<String> healthAllergies = new ArrayList<String>();
        Nutrition  nutrition = new Nutrition(foodAllergies);
        Health health = new Health("rougeole", "couchBase", healthAllergies);
        DeviceInformationsDto  barbry = new DeviceInformationsDto(personnalInformation,address,health,nutrition);
        // fabien
        Address address2 = new Address("Balthazar", "Bordeaux", "03.11.55.33.77");
        PersonnalInformations personnalInformation2 = new PersonnalInformations("François", "Fabien", "01/01/2010", "40", "120", address);
        List<String> foodAllergies2 = new ArrayList<String>();
        List<String> healthAllergies2 = new ArrayList<String>();
        healthAllergies2.add("paracetamol");
        Nutrition  nutrition2 = new Nutrition(foodAllergies);
        Health health2 = new Health("tuberculose", "h1n1", healthAllergies2);
        DeviceInformationsDto  fabien = new DeviceInformationsDto(personnalInformation2,address2,health2,nutrition2);

        deviceInformationsDtos.add(fabien);
        deviceInformationsDtos.add(barbry);

        return deviceInformationsDtos;
    }


    @RequestMapping(value = "/api/register", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<String> process(@RequestParam int id) {
        if (id < persons.size()) {
            currentPerson = persons.get(id);
        }

        return new ResponseEntity("OK", HttpStatus.CREATED);
    }

    @RequestMapping(value = "/api/products", method = RequestMethod.GET)
    @ResponseBody
    List<Product> listProducts() {
        return products;
    }

    @RequestMapping(value = "/api/child", method = RequestMethod.GET)
    @ResponseBody
    DeviceInformationsDto getInformationAboutChild() {
        return currentPerson;
    }

    @RequestMapping(value = "/api/medicaments", method = RequestMethod.GET)
    @ResponseBody
    ResponseEntity<Medicament> listMedicamentsAllowed() {
        return new ResponseEntity(currentPerson, HttpStatus.OK);
    }
}
