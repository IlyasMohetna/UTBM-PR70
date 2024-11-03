package com.pr70.TP.TP5;

import javax.swing.SwingUtilities;

public class TestGestionFichierEtudiant {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                Etudiant etudiant = new Etudiant("MOHETNA", "Ilyas");
                etudiant.ajouterNote(15.0);
                etudiant.ajouterNote(17.5);
                etudiant.ajouterNote(14.0);

                SelecteurFichier selecteurFichier = new SelecteurFichier();
                String nomFichier = selecteurFichier.selectionnerFichierAEcrire();
                if (nomFichier == null) {
                    System.out.println("Aucun fichier sélectionné pour l'écriture.");
                    return;
                }

                GestionnaireFichierEtudiant gestionnaire = new GestionnaireFichierEtudiant();
                gestionnaire.ecrireEtudiantDansFichier(etudiant, nomFichier);

                nomFichier = selecteurFichier.selectionnerFichierALire();
                if (nomFichier == null) {
                    System.out.println("Aucun fichier sélectionné pour la lecture.");
                    return;
                }

                Etudiant etudiantLu = gestionnaire.lireEtudiantDepuisFichier(nomFichier);

                System.out.println(etudiantLu);
            }
        });
    }
}




