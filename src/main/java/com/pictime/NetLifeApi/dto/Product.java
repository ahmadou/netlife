package com.pictime.NetLifeApi.dto;

/**
 * Created by pictime on 20/05/17.
 */
public class Product {
    private String nom;
    private String composant;

    public Product(String nom, String composant) {
        this.nom = nom;
        this.composant = composant;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getComposant() {
        return composant;
    }

    public void setComposant(String composant) {
        this.composant = composant;
    }
}
