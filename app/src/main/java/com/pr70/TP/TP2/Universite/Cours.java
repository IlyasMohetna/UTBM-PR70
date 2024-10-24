package com.pr70.TP.TP2.Universite;

import java.util.ArrayList;

import com.pr70.TP.TP2.Universite.Entite.Etudiant;
import com.pr70.TP.TP2.Universite.Entite.Administratif;
import com.pr70.TP.TP2.Universite.Entite.Chercheur;
import com.pr70.TP.TP2.Universite.Entite.Doctorant;
import com.pr70.TP.TP2.Universite.Entite.Enseignant;
import com.pr70.TP.TP2.Universite.Entite.EnseignantChercheur;
import com.pr70.TP.TP2.Universite.Interface.EstCoursIntervenant;
import com.pr70.TP.TP2.Universite.Interface.EstCoursParticipant;
import com.pr70.TP.TP2.Universite.Entite.Personne;

public class Cours {
    private String nom_cours;
    private int annee_cours;
    private ArrayList<EstCoursParticipant> LesParticipants = new ArrayList<>();
    private ArrayList<EstCoursIntervenant> LesIntervenants = new ArrayList<>();

    public Cours(String nom_cours, int annee_cours){
        this.nom_cours = nom_cours;
        this.annee_cours = annee_cours;
    }


    public String getNom_cours() {
        return this.nom_cours;
    }

    public void setNom_cours(String nom_cours) {
        this.nom_cours = nom_cours;
    }

    public int getAnnee_cours() {
        return this.annee_cours;
    }

    public void setAnnee_cours(int annee_cours) {
        this.annee_cours = annee_cours;
    }

    public ArrayList<EstCoursParticipant> getLesParticipants() {
        return this.LesParticipants;
    }

    public void setLesParticipants(ArrayList<EstCoursParticipant> LesParticipants) {
        this.LesParticipants = LesParticipants;
    }

    public ArrayList<EstCoursIntervenant> getLesIntervenants() {
        return this.LesIntervenants;
    }

    public void setLesIntervenants(ArrayList<EstCoursIntervenant> LesIntervenants) {
        this.LesIntervenants = LesIntervenants;
    }

    /* Mes methodes */


    public void inscrireParticipant(EstCoursParticipant Participant)
    {
        LesParticipants.add(Participant);
    }

    public void inscrireIntervenant(EstCoursIntervenant Intervenant)
    {
        LesIntervenants.add(Intervenant);
    }

}
