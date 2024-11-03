package com.pr70.TP.TP5;

import java.io.*;
import java.util.*;

public class GestionnaireFichierEtudiant {

    public void ecrireEtudiantDansFichier(Etudiant etudiant, String nomFichier) {
        try {
            FileWriter ecrivain = new FileWriter(nomFichier);
            ecrivain.write(etudiant.getNom() + " " + etudiant.getPrenom() + "\n");
            for (Double note : etudiant.getNotes()) {
                ecrivain.write(note + " ");
            }
            ecrivain.write("\n");
            ecrivain.close();
            System.out.println("Étudiant enregistré avec succès.");
        } catch (IOException e) {
            System.out.println("Erreur lors de l'écriture de l'étudiant dans le fichier.");
            e.printStackTrace();
        }
    }

    public Etudiant lireEtudiantDepuisFichier(String nomFichier) {
        Etudiant etudiant = null;
        try {
            File fichier = new File(nomFichier);
            Scanner scanner = new Scanner(fichier);
            if (scanner.hasNextLine()) {
                String ligneNom = scanner.nextLine();
                String[] noms = ligneNom.split(" ");
                String nom = noms[0];
                String prenom = noms[1];
                etudiant = new Etudiant(nom, prenom);
            }
            if (scanner.hasNextLine()) {
                String ligneNotes = scanner.nextLine();
                String[] notesStr = ligneNotes.trim().split(" ");
                for (String noteStr : notesStr) {
                    double note = Double.parseDouble(noteStr);
                    etudiant.ajouterNote(note);
                }
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Erreur lors de la lecture de l'étudiant depuis le fichier.");
            e.printStackTrace();
        }
        return etudiant;
    }
}
