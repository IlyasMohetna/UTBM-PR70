package com.pr70.TP.TP2.Magasin;

import java.util.ArrayList;

public class BD extends Media implements Louer{
    private ArrayList<String> auteurs;
    private double prix_location_semaine;

    public BD(String titre, ArrayList<String> auteurs, double prix_location_semaine){
        super(titre, prix_location_semaine);
        this.auteurs = auteurs;
        this.prix_location_semaine = prix_location_semaine;
    }
}