package com.pr70.TP.TP2.Magasin;

import java.util.ArrayList;

import com.pr70.TP.TP2.Magasin.Produits.BD;
import com.pr70.TP.TP2.Magasin.Produits.CD;
import com.pr70.TP.TP2.Magasin.Produits.DVD;
import com.pr70.TP.TP2.Magasin.Produits.Livre;

public class Test {
    public static void main(String[] args) {
        CD cd = new CD("Blues Vol 1 Jazz", 10.0, "Jazz International", 10.0, 10.0, 10.0);
        DVD dvd = new DVD("Beat It Vol 2", 10.0, "Maicheal Jackson", 10.0, 10.0);
        Livre livre = new Livre("The Martian", 10.0, 10, 10.0);
        ArrayList<String> auteurs = new ArrayList<String>();
        auteurs.add("Auteur 1");
        auteurs.add("Auteur 2");
        auteurs.add("Auteur 3");
        BD bd = new BD("Tintin et Milou", auteurs, 10.0);

        // public Client(String nom, String prenom, String adresse, String telephone, String email){
        Client UnLoueur1 = new Client("Jean", "Dupont", "1 rue de la paix", "0123456789", "jean.dupont@gmail.com");
        Client UnLoueur2 = new Client("Jarid", "Werklow", "1 rue de la paix", "0123456789", "jarid.wirklow@gmail.com");

        cd.setLoueur(UnLoueur1);
        dvd.setLoueur(UnLoueur2);

        System.out.println("DVD: " + dvd.getTitre() + " - coute : "+ dvd.calculerPrixLocation(5) + "$ "+"pour 5 "+dvd.getPrixPar());
        
        System.out.println("Ce dvd est actuellement loué par :"+ dvd.getLoueur().getNom() + " " + dvd.getLoueur().getPrenom());

        System.out.println("CD: " + cd.getTitre() + " - coute : "+ cd.calculerPrixLocation(5) + "$ "+"pour 5 "+cd.getPrixPar());

        System.out.println("Ce cd est actuellement loué par :"+ cd.getLoueur().getNom() + " " + cd.getLoueur().getPrenom());
    }
}
