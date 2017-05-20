package com.pictime.NetLifeApi.dto;

/**
 * Created by pictime on 20/05/17.
 */
public class Product {
    private String nom;
    private String composant;
    private double prix;

    public Product(String nom, String composant, double prix) {
        this.nom = nom;
        this.composant = composant;
        this.prix = prix;
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

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }
}
