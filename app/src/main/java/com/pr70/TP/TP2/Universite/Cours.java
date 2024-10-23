package com.pr70.TP.TP2.Universite;

import java.util.ArrayList;

import com.pr70.TP.TP1.GroupeEtudiant.Etudiant;
import com.pr70.TP.TP2.Universite.Entite.Administratif;
import com.pr70.TP.TP2.Universite.Entite.Chercheur;
import com.pr70.TP.TP2.Universite.Entite.Doctorant;
import com.pr70.TP.TP2.Universite.Entite.Enseignant;
import com.pr70.TP.TP2.Universite.Entite.EnseignantChercheur;
import com.pr70.TP.TP2.Universite.Interface.EstCoursParticipant;

public class Cours {
    private String nom_cours;
    private int annee_cours;
    private ArrayList<EstCoursParticipant> LesParticipants = new ArrayList<>();

    public Cours(String nom_cours, int annee_cours){
        this.nom_cours = nom_cours;
        this.annee_cours = annee_cours;
    }

    public void inscrireParticipant(EstCoursParticipant Participant)
    {
        LesParticipants.add(Participant);
    }

    // public EstCoursParticipant rechercherParticipant(String prenom, String nom){
    //     for(EstCoursParticipant Participant : this.LesParticipants){
    //         if(Participant.getNom())
    //     }
    // }

    public EstCoursParticipant rechercherParticipantParNom(String nomRecherche) {
        for (EstCoursParticipant participant : participants) {
            if (participant.getNom().equals(nomRecherche)) {
                return participant;
            }
        }
        return null;
    }

    private String getCategorieParticipant(EstCoursParticipant Participant) {
        if (Participant instanceof Doctorant) {
            return "Doctorant";
        } else if (Participant instanceof Etudiant) {
            return "Étudiant";
        } else if (Participant instanceof EnseignantChercheur) {
            return "Enseignant-Chercheur";
        } else if (Participant instanceof Enseignant) {
            return "Enseignant";
        } else if (Participant instanceof Chercheur) {
            return "Chercheur";
        } else if (Participant instanceof Administratif) {
            return "Administratif";
        } else {
            return "Autre";
        }
    }

}
