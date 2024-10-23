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
}