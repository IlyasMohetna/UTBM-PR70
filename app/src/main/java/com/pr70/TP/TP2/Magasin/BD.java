package com.pr70.TP.TP2.Magasin;

import java.util.ArrayList;

public class BD extends Media implements Louer{
    private ArrayList<String> auteurs;
    private double prix_location;

    public BD(String titre, ArrayList<String> auteurs, double prix_location){
        super(titre, prix_location);
        this.auteurs = auteurs;
        this.prix_location = prix_location;
    }
}