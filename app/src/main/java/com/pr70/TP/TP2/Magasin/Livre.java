package com.pr70.TP.TP2.Magasin;

public class Livre extends Media{
    private int nb_pages;
    private double prix_location;

    public Livre(String titre, double prix, int nb_pages, double prix_location){
        super(titre, prix);
        this.nb_pages = nb_pages;
        this.prix_location = prix_location;
    }

    public int getNb_pages() {
        return this.nb_pages;
    }

    public void setNb_pages(int nb_pages) {
        this.nb_pages = nb_pages;
    }

    public double getPrix_location() {
        return this.prix_location;
    }

    public void setPrix_location(double prix_location) {
        this.prix_location = prix_location;
    }
}
