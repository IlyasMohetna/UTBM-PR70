package com.pr70.TP.TP2.Universite.Entite;

import com.pr70.TP.TP2.Universite.Interface.EstCoursIntervenant;
import com.pr70.TP.TP2.Universite.Interface.EstCoursParticipant;
import com.pr70.TP.TP2.Universite.Interface.EstRechercheParticipant;

public class Doctorant extends Personne implements EstRechercheParticipant, EstCoursParticipant, EstCoursIntervenant{
    public final String categorie;

    public Doctorant(String prenom, String nom, int age){
        super(prenom, nom, age);
        this.categorie = "Doctorant";
    }

    public String getCategorie() {
        return this.categorie;
    }
}
