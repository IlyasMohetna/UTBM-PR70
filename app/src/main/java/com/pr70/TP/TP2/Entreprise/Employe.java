package com.pr70.TP.TP2.Entreprise;

public abstract class Employe extends Personne{
    protected String nom_poste;

    public Employe(String prenom, String nom, String age, String nom_poste){
        super(prenom, nom, age);
        this.nom_poste = nom_poste;
    }

    public abstract double calculer_salaire();
}
