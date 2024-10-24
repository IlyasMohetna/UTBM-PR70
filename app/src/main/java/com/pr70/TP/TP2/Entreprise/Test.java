package com.pr70.TP.TP2.Entreprise;

public class Test {
    public static void main(String[] args) {
        Vendeur UnVendeur = new Vendeur("Kevin", "James", 23, "Vendeur commercial", 3000, 35000);
        System.out.println("Le salaire du vendeur : "+UnVendeur.getPrenom()+" "+UnVendeur.getNom()+" est "+UnVendeur.calculer_salaire()+"$");

        Technicien UnTechnicien = new Technicien("James", "Mqueen", 25, "Technicien réseau", 500, 13, 40);
        System.out.println("Le salaire du vendeur : "+UnTechnicien.getPrenom()+" "+UnTechnicien.getNom()+" est "+UnTechnicien.calculer_salaire()+"$");

        Secretaire UneSecretaire = new Secretaire("Celine", "Dione", 54, "Secrétaire", 1400);
        System.out.println("Le salaire du vendeur : "+UneSecretaire.getPrenom()+" "+UneSecretaire.getNom()+" est "+UneSecretaire.calculer_salaire()+"$");

        GestionnaireDeProjet UnGestionnaire = new GestionnaireDeProjet("Mark", "Zuckerburg", 38, "Gestionnaire de projet", 4000);
        System.out.println("Le salaire du vendeur : "+UnGestionnaire.getPrenom()+" "+UnGestionnaire.getNom()+" est "+UnGestionnaire.calculer_salaire()+"$");
    }
}
