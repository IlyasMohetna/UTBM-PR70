package com.pr70.TP.TP2.Magasin.Produits;

import com.pr70.TP.TP2.Magasin.Media;

public class CD extends Media{
    private String groupe;
    private double duree;
    private double nombre_morceaux;
    private double prix_location_jour;
    private final String prixPar = "jour";

    public CD(String titre, double prix, String groupe, double duree, double nombre_morceaux, double prix_location_jour){
        super(titre, prix);
        this.groupe = groupe;
        this.duree = duree;
        this.nombre_morceaux = nombre_morceaux;
        this.prix_location_jour = prix_location_jour;
    }


    public String getGroupe() {
        return this.groupe;
    }

    public void setGroupe(String groupe) {
        this.groupe = groupe;
    }

    public double getDuree() {
        return this.duree;
    }

    public void setDuree(double duree) {
        this.duree = duree;
    }

    public double getNombre_morceaux() {
        return this.nombre_morceaux;
    }

    public void setNombre_morceaux(double nombre_morceaux) {
        this.nombre_morceaux = nombre_morceaux;
    }

    public double getPrix_location_jour() {
        return this.prix_location_jour;
    }

    public void setPrix_location_jour(double prix_location_jour) {
        this.prix_location_jour = prix_location_jour;
    }

    public double getPriceParUnite(){
        return this.prix_location_jour;
    }

    public String getPrixPar(){
        return this.prixPar;
    }
}
