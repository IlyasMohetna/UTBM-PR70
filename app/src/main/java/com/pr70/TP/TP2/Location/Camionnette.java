package com.pr70.TP.TP2.Location;

public class Camionnette extends Vehicule{
    private double volume_chargement;

    public Camionnette(String marque, String nom, String couleur, int nombre_places, double prix_km, double volume_chargement){
        super(marque, nom, couleur, nombre_places, prix_km);
        this.volume_chargement = volume_chargement;
    }

    public double getVolume_chargement() {
        return this.volume_chargement;
    }

    public void setVolume_chargement(double volume_chargement) {
        this.volume_chargement = volume_chargement;
    }

    public String toString()
    {
        return super.toString() + ", Volume de chargement : "+this.getVolume_chargement();
    }
}
