package com.pr70.TP.TP2.Entreprise;

public class Secretaire extends Employe  {
    private double salaire_fixe;
    private final double taux_horaire_en_plus;

    public Secretaire(String prenom, String nom, String age, String nom_poste, double salaire_fixe) {
        super(prenom, nom, age, nom_poste);
        this.salaire_fixe = salaire_fixe;
        this.taux_horaire_en_plus = 0.3;
    }

    public double calculer_salaire() {
        return this.salaire_fixe + (taux_horaire_en_plus * this.salaire_fixe);
    }
}
