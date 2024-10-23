package com.pr70.TP.TP2.Universite.Entite;

import com.pr70.TP.TP2.Universite.Interface.EstCoursParticipant;

public class Etudiant extends Personne implements EstCoursParticipant{
    public Etudiant(String prenom, String nom, String age){
        super(prenom, nom, age);
    }
}
