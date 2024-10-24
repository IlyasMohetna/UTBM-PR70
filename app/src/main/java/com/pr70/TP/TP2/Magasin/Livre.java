package com.pr70.TP.TP2.Magasin;

public class Livre extends Media{
    private int nb_pages;
    private double prix_location_semaine;

    public Livre(String titre, double prix, int nb_pages, double prix_location_semaine){
        super(titre, prix);
        this.nb_pages = nb_pages;
        this.prix_location_semaine = prix_location_semaine;
    }

    public int getNb_pages() {
        return this.nb_pages;
    }

    public void setNb_pages(int nb_pages) {
        this.nb_pages = nb_pages;
    }

    public double getPrix_location() {
        return this.prix_location_semaine;
    }

    public void setPrix_location(double prix_location_semaine) {
        this.prix_location_semaine = prix_location_semaine;
    }
}
