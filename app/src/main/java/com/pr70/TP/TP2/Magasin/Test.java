package com.pr70.TP.TP2.Magasin;

import java.util.ArrayList;

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
    }
}
