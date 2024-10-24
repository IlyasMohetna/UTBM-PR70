package com.pr70.TP.TP2.Universite;

import com.pr70.TP.TP2.Universite.Entite.Etudiant;
import com.pr70.TP.TP2.Universite.Entite.Chercheur;
import com.pr70.TP.TP2.Universite.Entite.Doctorant;
import com.pr70.TP.TP2.Universite.Entite.Enseignant;
import com.pr70.TP.TP2.Universite.Entite.EnseignantChercheur;
import com.pr70.TP.TP2.Universite.Interface.EstCoursIntervenant;
import com.pr70.TP.TP2.Universite.Interface.EstCoursParticipant;
import com.pr70.TP.TP2.Universite.Interface.EstRechercheParticipant;

public class Test {
    public static void main(String[] args) {
        Cours PR70 = new Cours("PR70 - Programmation JAVA", 2024);
        Etudiant Etudiant1 = new Etudiant("Ilyas", "Mohetna", 25);
        Etudiant Etudiant2 = new Etudiant("Lionel", "Messi", 25);
        Doctorant Doctorant1 = new Doctorant("Jeremy", "Gamy", 28);

        Enseignant Enseignant1 = new Enseignant("Marie", "Dupont", 35);
        EnseignantChercheur EnseignantChercheur1 = new EnseignantChercheur("Jean", "Martin", 40);

        PR70.inscrireParticipant((EstCoursParticipant) Etudiant1);
        PR70.inscrireParticipant((EstCoursParticipant) Etudiant2);
        PR70.inscrireParticipant((EstCoursParticipant) Doctorant1);

        PR70.inscrireIntervenant((EstCoursIntervenant) Enseignant1);
        PR70.inscrireIntervenant((EstCoursIntervenant) EnseignantChercheur1);
        PR70.inscrireIntervenant((EstCoursIntervenant) Doctorant1);

        System.out.println("\n");

        System.out.println("---- La liste des personnes inscrits sur le cours "+PR70.getNom_cours()+"\n");
        for(EstCoursParticipant Participant: PR70.getLesParticipants()){
            System.out.println(Participant.getPrenom()+" "+Participant.getNom()+" ("+Participant.getCategorie()+")");
        }

        System.out.println("\n");

        System.out.println("---- La liste des personnes intervenants sur le cours "+PR70.getNom_cours()+"\n");
        for(EstCoursIntervenant Intervenant: PR70.getLesIntervenants()){
            System.out.println(Intervenant.getPrenom()+" "+Intervenant.getNom()+" ("+Intervenant.getCategorie()+")");
        }

        /* Gestion des laboratoires */
        Laboratoire UnLaboratoire = new Laboratoire("Laboratoire de la renaissance");
        Chercheur Chercheur1 = new Chercheur("Cristiano", "Ronaldo", 39);

        UnLaboratoire.inscrireIntervenant((EstRechercheParticipant) Chercheur1);
        UnLaboratoire.inscrireIntervenant((EstRechercheParticipant) Doctorant1);
        UnLaboratoire.inscrireIntervenant((EstRechercheParticipant) EnseignantChercheur1);

        System.out.println("\n");

        System.out.println("---- La liste des personnes ayant une activité de recherche dans le laboratoire "+UnLaboratoire.getNom()+"\n");
        for(EstRechercheParticipant Recherchant: UnLaboratoire.getLesRecherchants()){
            System.out.println(Recherchant.getPrenom()+" "+Recherchant.getNom()+" ("+Recherchant.getCategorie()+")");
        }
    }
}
