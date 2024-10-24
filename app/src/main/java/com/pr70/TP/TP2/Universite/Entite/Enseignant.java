package com.pr70.TP.TP2.Universite.Entite;

import com.pr70.TP.TP2.Universite.Interface.EstCoursIntervenant;

public class Enseignant extends Personne implements EstCoursIntervenant{
    public final String categorie;

    public Enseignant(String prenom, String nom, int age){
        super(prenom, nom, age);
        this.categorie = "Enseignant";
    }

    public String getCategorie() {
        return this.categorie;
    }
}
