package com.pr70.TP.TP2.Location;

public abstract class Vehicule {
    private String marque;
    private String nom;
    private String couleur;
    private int nombre_places;
    private double prix_km;


    public Vehicule(String marque, String nom, String couleur, int nombre_places, double prix_km) {
        this.marque = marque;
        this.nom = nom;
        this.couleur = couleur;
        this.nombre_places = nombre_places;
        this.prix_km = prix_km;
    }


    public String getMarque() {
        return this.marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getNom() {
        return this.nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCouleur() {
        return this.couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public int getNombre_places() {
        return this.nombre_places;
    }

    public void setNombre_places(int nombre_places) {
        this.nombre_places = nombre_places;
    }

    public double getPrix_km() {
        return this.prix_km;
    }

    public void setPrix_km(double prix_km) {
        this.prix_km = prix_km;
    }

    public String toString()
    {
        return "Nom : "+this.getNom()+" , Marque : "+this.getMarque()+ ", Couleur : "+this.getCouleur()+", Nombre de places : "+this.getNombre_places()+ ", Prix par KM"+this.getPrix_km();
    }

}
