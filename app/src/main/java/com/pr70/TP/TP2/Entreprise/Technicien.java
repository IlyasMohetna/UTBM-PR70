package com.pr70.TP.TP2.Entreprise;

public class Technicien extends Employe  {
    private double taux_horaire;
    private double heures_travailler;
    private double heures_supplementaire;
    private final double taux_horaire_supplementaire;

    public Technicien(String prenom, String nom, int age, String nom_poste, double taux_horaire, double heures_travailler, double heures_supplementaire) {
        super(prenom, nom, age, nom_poste);
        this.taux_horaire = taux_horaire;
        this.heures_travailler = heures_travailler;
        this.heures_supplementaire = heures_supplementaire;
        this.taux_horaire_supplementaire = 0.3;
    }

    public double calculer_salaire() {
        return (taux_horaire * heures_travailler) + ((this.taux_horaire_supplementaire * 0.3) * heures_supplementaire);
    }
}
