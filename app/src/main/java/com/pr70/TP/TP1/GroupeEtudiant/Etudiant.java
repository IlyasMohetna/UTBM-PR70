package com.pr70.TP.TP1.GroupeEtudiant;

public class Etudiant {
    private String Nom;
    private String Prenom;
    private int Age;

    public Etudiant(String Prenom, String Nom , int Age) {
        this.Nom = Nom;
        this.Prenom = Prenom;
        this.Age = Age;
    }

    public String getNom() {
        return this.Nom;
    }

    public void setNom(String Nom) {
        this.Nom = Nom;
    }

    public String getPrenom() {
        return this.Prenom;
    }

    public void setPrenom(String Prenom) {
        this.Prenom = Prenom;
    }

    public int getAge() {
        return this.Age;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

    @Override
    public String toString() {
        return "Etudiant{" +
                "prenom='" + this.Prenom + '\'' +
                ", nom='" + this.Nom + '\'' +
                ", age=" + this.Age +
                '}';
    }
}
