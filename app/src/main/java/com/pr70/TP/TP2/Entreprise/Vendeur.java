package com.pr70.TP.TP2.Entreprise;

public class Vendeur extends Employe {
    private double salaire_fixe;
    private double volume_production;

    public Vendeur(String prenom, String nom, String age, String nom_poste, double salaire_fixe, double volume_production) {
        super(prenom, nom, age, nom_poste);
        this.salaire_fixe = salaire_fixe;
        this.volume_production = volume_production;
    }

    public double calculer_salaire() {
        return salaire_fixe + (0.01 * volume_production);
    }
}
