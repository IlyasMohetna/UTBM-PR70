package com.pr70.TP.TP2.Universite.Entite;

import com.pr70.TP.TP2.Universite.Interface.EstRechercheParticipant;

public class Chercheur extends Personne implements EstRechercheParticipant {
    public final String categorie;

    public Chercheur(String prenom, String nom, int age){
        super(prenom, nom, age);
        this.categorie = "Chercheur";
    }

    public String getCategorie() {
        return this.categorie;
    }
}
