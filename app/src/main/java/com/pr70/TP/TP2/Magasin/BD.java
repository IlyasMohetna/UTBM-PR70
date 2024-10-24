package com.pr70.TP.TP2.Magasin;

public class BD extends Media implements Louer{
    
    public BD(String titre, double prix, double prix_location){
        super(titre, prix);
        this.nb_pages = nb_pages;
        this.prix_location = prix_location;
    }
}