package com.pr70.TP.TP2.Universite.Entite;

import com.pr70.TP.TP2.Universite.Interface.EstRechercheParticipant;

public class Chercheur extends Personne implements EstRechercheParticipant {
    public Chercheur(String prenom, String nom, String age){
        super(prenom, nom, age);
    }
}
