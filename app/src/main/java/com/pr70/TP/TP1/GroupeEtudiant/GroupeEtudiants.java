package com.pr70.TP.TP1.GroupeEtudiant;

import java.util.ArrayList;

public class GroupeEtudiants {
    private ArrayList<Etudiant> etudiants;

    public GroupeEtudiants(){
        this.etudiants = new ArrayList<>();
    }

    public void ajouterEtudiant(Etudiant etudiant)
    {
        this.etudiants.add(etudiant);
    }

    public Etudiant rechercheEtudiantParNom(String nom)
    {
        for(Etudiant etudiant: etudiants){
            if(etudiant.getNom().equalsIgnoreCase(nom))
                return etudiant;
        }
        return null;
    }

    public double calculerAgeMoyen() {
        if (etudiants.isEmpty()) {
            return 0;
        }
        int totalAge = 0;
        for (Etudiant etudiant : etudiants) {
            totalAge += etudiant.getAge();
        }
        return (double) totalAge / etudiants.size();
    }
    
    public ArrayList<Etudiant> getEtudiantsParAge(int age)
    {
        ArrayList<Etudiant> result = new ArrayList<>();
        for (Etudiant etudiant : etudiants) {
            if(etudiant.getAge() == age) {
                result.add(etudiant);
            }
        }
        return result;
    }

    public void afficherEtudiants() {
        for (Etudiant etudiant : etudiants) {
            System.out.println(etudiant);
        }
    }

    public static void main(String[] args) {
        GroupeEtudiants groupe = new GroupeEtudiants();

        groupe.ajouterEtudiant(new Etudiant("Lionel", "Messi", 37));
        groupe.ajouterEtudiant(new Etudiant("Cristiano", "Ronaldo", 39));
        groupe.ajouterEtudiant(new Etudiant("Achraf", "Hakimi", 25));
        groupe.ajouterEtudiant(new Etudiant("Brahim", "Diaz", 25));

        System.out.println("Le groupe d'étudiants :");
        groupe.afficherEtudiants();

        Etudiant etudiantRecherche = groupe.rechercheEtudiantParNom("Hakimi");
        System.out.println("\nEtudiant trouvé : " + etudiantRecherche);

        System.out.println("\nAge moyen des étudiants : " + groupe.calculerAgeMoyen());

        System.out.println("\nÉtudiants ayant 25 ans :");
        ArrayList<Etudiant> etudiantsAge25 = groupe.getEtudiantsParAge(25);
        for (Etudiant etudiant : etudiantsAge25) {
            System.out.println(etudiant);
        }
    }

}
