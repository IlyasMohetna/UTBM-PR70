package com.pr70.TP.TP2.Universite.Entite;

import com.pr70.TP.TP2.Universite.Interface.EstCoursIntervenant;
import com.pr70.TP.TP2.Universite.Interface.EstRechercheParticipant;

public class EnseignantChercheur extends Personne implements EstCoursIntervenant, EstRechercheParticipant{
    public EnseignantChercheur(String prenom, String nom, String age){
        super(prenom, nom, age);
    }
}
