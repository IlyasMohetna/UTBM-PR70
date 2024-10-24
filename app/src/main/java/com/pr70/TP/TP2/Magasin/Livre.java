package com.pr70.TP.TP2.Magasin;

public class Livre extends Media implements Louer{
    private int nb_pages;
    private double prix_location;

    public Livre(String titre, double prix, int nb_pages, double prix_location){
        super(titre, prix);
        this.nb_pages = nb_pages;
        this.prix_location = prix_location;
    }
}
