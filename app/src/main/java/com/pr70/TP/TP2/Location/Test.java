package com.pr70.TP.TP2.Location;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        PetiteVoiture Scirocco = new PetiteVoiture("Volkswagen", "Scirocco", "Blanc", 4, 0.4);
        Routiere La308 = new Routiere("Peugeot", "308", "Noir", 6, 0.3);
        Utilitaire LeBerlingo = new Utilitaire("Citroen", "Berlingo", "Blanc", 3, 0.6, 3.5);
        Camionnette LeMaster = new Camionnette("Renault", "Master", "Blanc", 3, 0.7, 10.5);

        ParcVehicules MonAgence = new ParcVehicules();
        MonAgence.ajouterVehicule(Scirocco);
        MonAgence.ajouterVehicule(La308);
        MonAgence.ajouterVehicule(LeBerlingo);
        MonAgence.ajouterVehicule(LeMaster);

        ArrayList<Vehicule> resultats;

        System.out.println("---- Recherche de vehicules par couleur :");
        System.out.println("\n");
        resultats = MonAgence.rechercherVehiculeParCouleur("Noir");
        for (Vehicule v : resultats) {
            System.out.println(v);
        }

        System.out.println("\n");
        System.out.println("---- Recherche de vehicules par nombre de places :");
        resultats = MonAgence.rechercherVehiculeParNombreDePlaces(3);
        for (Vehicule v : resultats) {
            System.out.println(v);
        }


        System.out.println("\n");
        System.out.println("---- Recherche de vehicules par tarif max au KM :");
        resultats = MonAgence.rechercherVehiculeParTarifMaxKm(0.5);
        for (Vehicule v : resultats) {
            System.out.println(v);
        }

        System.out.println("\n");
        System.out.println("---- Recherche de vehicules par volume de chargement :");
        resultats = MonAgence.rechercherVehiculeParVolumeMinChargement(5);
        for (Vehicule v : resultats) {
            System.out.println(v);
        }
        
    }
}
