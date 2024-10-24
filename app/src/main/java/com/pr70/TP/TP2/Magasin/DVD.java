package com.pr70.TP.TP2.Magasin;

public class DVD extends Media{
    private String realisateur;
    private double duree;
    private double prix_location_semaine;

    public DVD(String titre, double prix, String realisateur, double duree, double prix_location_semaine){
        super(titre, prix);
        this.realisateur = realisateur;
        this.duree = duree;
        this.prix_location_semaine = prix_location_semaine;
    }
}
