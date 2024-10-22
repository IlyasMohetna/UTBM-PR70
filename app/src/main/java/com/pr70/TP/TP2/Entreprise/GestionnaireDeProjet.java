package com.pr70.TP.TP2.Entreprise;

public class GestionnaireDeProjet extends Employe {
    private double salaire_fixe;

    public GestionnaireDeProjet(String prenom, String nom, String age, String nom_poste, double salaire_fixe) {
        super(prenom, nom, age, nom_poste);
        this.salaire_fixe = salaire_fixe;
    }

    public double calculer_salaire() {
        return this.salaire_fixe;
    }
}
