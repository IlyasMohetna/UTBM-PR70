package com.pr70.TP.TP2.Location;

import java.util.ArrayList;

public class ParcVehicules {
    private ArrayList<Vehicule> parcVehicules = new ArrayList<>();

    public void ajouterVehicule(Vehicule vehicule) {
        parcVehicules.add(vehicule);
    }

    public ArrayList<Vehicule> rechercherVehicules(String couleur, int nombreMinDePlaces, double tarifMaxKm, double volumeMinChargement) {
        ArrayList<Vehicule> resultats = new ArrayList<>();

        for (Vehicule v : parcVehicules) {
            if (v.getCouleur().equalsIgnoreCase(couleur) &&
                v.getNombre_places() >= nombreMinDePlaces &&
                v.getPrix_km() <= tarifMaxKm) {


                if (v instanceof Utilitaire || v instanceof Camionnette) {
                    double volumeDeChargement;
                    if(v instanceof Utilitaire){
                        volumeDeChargement = ((Utilitaire) v).getVolume_chargement();
                    }else{
                        volumeDeChargement = ((Camionnette) v).getVolume_chargement();
                    }

                    if (volumeDeChargement >= volumeMinChargement) {
                        resultats.add(v);
                    }
                } else {
                    resultats.add(v);
                }
            }
        }

        return resultats;
    }

    /*Recherche des véhicules sur les critères suivants : couleur, nombre minimum deplaces, tarif minimum au km, volume utile minimum */

    public ArrayList<Vehicule> rechercherVehiculeParCouleur(String couleur) {
        ArrayList<Vehicule> resultats = new ArrayList<>();

        for (Vehicule v : parcVehicules) {
            if (v.getCouleur().equalsIgnoreCase(couleur)) {
                resultats.add(v);
            }
        }

        return resultats;
    }

    public ArrayList<Vehicule> rechercherVehiculeParNombreDePlaces(int nombreMinDePlaces) {
        ArrayList<Vehicule> resultats = new ArrayList<>();

        for (Vehicule v : parcVehicules) {
            if (v.getNombre_places() == nombreMinDePlaces) {
                resultats.add(v);
            }
        }

        return resultats;
    }

    public ArrayList<Vehicule> rechercherVehiculeParTarifMaxKm(double tarifMaxKm) {
        ArrayList<Vehicule> resultats = new ArrayList<>();

        for (Vehicule v : parcVehicules) {
            if (v.getPrix_km() <= tarifMaxKm) {
                resultats.add(v);
            }
        }

        return resultats;
    }

    public ArrayList<Vehicule> rechercherVehiculeParVolumeMinChargement(double volumeMinChargement) {
        ArrayList<Vehicule> resultats = new ArrayList<>();

        for (Vehicule v : parcVehicules) {
            if (v instanceof Utilitaire || v instanceof Camionnette) {
                double volumeDeChargement;
                if(v instanceof Utilitaire){
                    volumeDeChargement = ((Utilitaire) v).getVolume_chargement();
                }else{
                    volumeDeChargement = ((Camionnette) v).getVolume_chargement();
                }

                if (volumeDeChargement >= volumeMinChargement) {
                    resultats.add(v);
                }
            }
        }

        return resultats;
    }
}
