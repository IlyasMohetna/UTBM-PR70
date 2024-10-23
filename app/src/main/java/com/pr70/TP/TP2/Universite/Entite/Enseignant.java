package com.pr70.TP.TP2.Universite.Entite;

import com.pr70.TP.TP2.Universite.Interface.EstCoursIntervenant;

public class Enseignant extends Personne implements EstCoursIntervenant{
    public Enseignant(String prenom, String nom, String age){
        super(prenom, nom, age);
    }
}
