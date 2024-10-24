package com.pr70.TP.TP2.Magasin;

public class CD extends Media{
    private String groupe;
    private double duree;
    private double nombre_morceaux;
    private double prix_location_jour;

    public CD(String titre, double prix, String groupe, double duree, double nombre_morceaux, double prix_location_jour){
        super(titre, prix);
        this.groupe = groupe;
        this.duree = duree;
        this.nombre_morceaux = nombre_morceaux;
        this.prix_location_jour = prix_location_jour;
    }
}
