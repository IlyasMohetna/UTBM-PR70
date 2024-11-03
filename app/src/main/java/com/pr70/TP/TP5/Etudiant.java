package com.pr70.TP.TP5;

import java.util.ArrayList;

public class Etudiant {
    private String nom;
    private String prenom;
    private ArrayList<Double> notes;

    public Etudiant(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
        this.notes = new ArrayList<Double>();
    }

    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public String getPrenom() {
        return prenom;
    }
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    public ArrayList<Double> getNotes() {
        return notes;
    }

    public void ajouterNote(double note) {
        notes.add(note);
    }

    public double calculerMoyenne() {
        if (notes.size() == 0) return 0.0;
        double somme = 0;
        for (Double note : notes) {
            somme += note;
        }
        return somme / notes.size();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Étudiant : ").append(nom).append(" ").append(prenom).append("\n");
        sb.append("Notes : ");
        for (Double note : notes) {
            sb.append(note).append(" ");
        }
        sb.append("\nMoyenne : ").append(calculerMoyenne());
        return sb.toString();
    }
}
