package com.pr70.TP.TP2.Universite.Entite;

import com.pr70.TP.TP2.Universite.Interface.EstCoursParticipant;

public class Etudiant extends Personne implements EstCoursParticipant{
    public final String categorie;

    public Etudiant(String prenom, String nom, int age){
        super(prenom, nom, age);
        this.categorie = "Etudiant";
    }

    public String getCategorie() {
        return this.categorie;
    }

}
