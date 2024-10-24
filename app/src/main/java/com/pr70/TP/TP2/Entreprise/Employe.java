package com.pr70.TP.TP2.Entreprise;

public abstract class Employe{
    protected String nom_poste;
    private String prenom;
    private String nom;
    private String age;

    public Employe(String prenom, String nom, String age, String nom_poste){
        this.prenom = prenom;
        this.nom = nom;
        this.age = age;
        this.nom_poste = nom_poste;
    }

    public String getPrenom() {
        return this.prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return this.nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAge() {
        return this.age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public abstract double calculer_salaire();
}
