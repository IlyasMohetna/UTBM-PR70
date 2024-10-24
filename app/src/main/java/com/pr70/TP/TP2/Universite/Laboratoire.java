package com.pr70.TP.TP2.Universite;

import java.util.ArrayList;

import com.pr70.TP.TP2.Universite.Interface.EstRechercheParticipant;

public class Laboratoire {
    private String nom;
    private ArrayList<EstRechercheParticipant> LesRecherchants = new ArrayList<>();

    public Laboratoire(String nom){
        this.nom = nom;
    }


    public String getNom() {
        return this.nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public ArrayList<EstRechercheParticipant> getLesRecherchants() {
        return this.LesRecherchants;
    }

    public void setLesRecherchants(ArrayList<EstRechercheParticipant> LesRecherchants) {
        this.LesRecherchants = LesRecherchants;
    }

    /* Mes methodes */


    public void inscrireIntervenant(EstRechercheParticipant Recherchant)
    {
        LesRecherchants.add(Recherchant);
    }

}
