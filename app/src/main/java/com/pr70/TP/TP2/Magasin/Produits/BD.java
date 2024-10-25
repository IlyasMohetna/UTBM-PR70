package com.pr70.TP.TP2.Magasin.Produits;

import java.util.ArrayList;

import com.pr70.TP.TP2.Magasin.Media;

public class BD extends Media{
    private ArrayList<String> auteurs;
    private double prix_location_semaine;
    private final String prixPar = "semaine";

    public BD(String titre, ArrayList<String> auteurs, double prix_location_semaine){
        super(titre, prix_location_semaine);
        this.auteurs = auteurs;
        this.prix_location_semaine = prix_location_semaine;
    }


    public ArrayList<String> getAuteurs() {
        return this.auteurs;
    }

    public void setAuteurs(ArrayList<String> auteurs) {
        this.auteurs = auteurs;
    }

    public double getPrix_location_semaine() {
        return this.prix_location_semaine;
    }

    public void setPrix_location_semaine(double prix_location_semaine) {
        this.prix_location_semaine = prix_location_semaine;
    }

    public double getPriceParUnite(){
        return this.prix_location_semaine;
    }

    public String getPrixPar(){
        return this.prixPar;
    }

}