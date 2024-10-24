package com.pr70.TP.TP2.Magasin;

public class Media {
    private String titre;
    private double prix;
    private Client loueur;

    public Media(String titre, double prix){
        this.titre = titre;
        this.prix = prix;
    }


    public String getTitre() {
        return this.titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public double getPrix() {
        return this.prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public Client getLoueur() {
        return this.loueur;
    }

    public void setLoueur(Client Client){
        this.loueur = Client;
    }
    
}
