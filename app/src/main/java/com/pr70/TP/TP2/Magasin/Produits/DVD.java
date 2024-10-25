package com.pr70.TP.TP2.Magasin.Produits;

import com.pr70.TP.TP2.Magasin.Media;

public class DVD extends Media{
    private String realisateur;
    private double duree;
    private double prix_location_semaine;
    private final String prixPar = "semaine";

    public DVD(String titre, double prix, String realisateur, double duree, double prix_location_semaine){
        super(titre, prix);
        this.realisateur = realisateur;
        this.duree = duree;
        this.prix_location_semaine = prix_location_semaine;
    }


    public String getRealisateur() {
        return this.realisateur;
    }

    public void setRealisateur(String realisateur) {
        this.realisateur = realisateur;
    }

    public double getDuree() {
        return this.duree;
    }

    public void setDuree(double duree) {
        this.duree = duree;
    }

    public double getPrix_location_semaine() {
        return this.prix_location_semaine;
    }

    public void setPrix_location_semaine(double prix_location_semaine) {
        this.prix_location_semaine = prix_location_semaine;
    }

    public double calculerLocation(int n){
        return this.prix_location_semaine * n;
    }

    public double getPriceParUnite(){
        return this.prix_location_semaine;
    }

    public String getPrixPar(){
        return this.prixPar;
    }
}
