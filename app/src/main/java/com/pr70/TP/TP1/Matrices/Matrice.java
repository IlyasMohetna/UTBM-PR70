package com.pr70.TP.TP1.Matrices;

import java.util.Scanner;

public class Matrice {
    private int lignes;
    private int colonnes;
    private int[][] matrice;

    // Constructeur
    public Matrice(int lignes, int colonnes) {
        this.lignes = lignes;
        this.colonnes = colonnes;
        this.matrice = new int[lignes][colonnes];
    }

    // Getters et Setters
    public int getLignes() {
        return this.lignes;
    }

    public int getColonnes() {
        return this.colonnes;
    }

    public int[][] getMatrice() {
        return this.matrice;
    }

    // Méthode pour remplir la matrice
    public void remplirMatrice() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez les éléments de la matrice :");

        for (int i = 0; i < this.lignes; i++) {
            for (int j = 0; j < this.colonnes; j++) {
                System.out.print("Élément [" + i + "][" + j + "] : ");
                this.matrice[i][j] = scanner.nextInt();
            }
        }

        scanner.close();
    }

    public void afficherMatrice() {
        System.out.println("Matrice :");
        for (int i = 0; i < this.lignes; i++) {
            for (int j = 0; j < this.colonnes; j++) {
                System.out.print(this.matrice[i][j] + " ");
            }
            System.out.println();
        }
    }

    public Matrice sommeMatrice(Matrice matrice2) {
        if (this.lignes != matrice2.getLignes() || this.colonnes != matrice2.getColonnes()) {
            System.err.println("Les deux matrices n'ont pas les mêmes dimensions.");
            return null;
        }

        Matrice result = new Matrice(this.lignes, this.colonnes);
        for (int i = 0; i < this.lignes; i++) {
            for (int j = 0; j < this.colonnes; j++) {
                result.matrice[i][j] = this.matrice[i][j] + matrice2.matrice[i][j];
            }
        }
        return result;
    }

    public Matrice multiplierMatrice(Matrice matrice2) {
        if (this.colonnes != matrice2.getLignes()) {
            System.err.println("Multiplication impossible : le nombre de colonnes de la première matrice doit correspondre au nombre de lignes de la deuxième.");
            return null;
        }

        Matrice result = new Matrice(this.lignes, matrice2.getColonnes());
        for (int i = 0; i < this.lignes; i++) {
            for (int j = 0; j < matrice2.getColonnes(); j++) {
                for (int k = 0; k < this.colonnes; k++) {
                    result.matrice[i][j] += this.matrice[i][k] * matrice2.matrice[k][j];
                }
            }
        }
        return result;
    }

    public boolean estEgale(Matrice matrice2) {
        if (this.lignes != matrice2.getLignes() || this.colonnes != matrice2.getColonnes()) {
            return false;
        }

        for (int i = 0; i < this.lignes; i++) {
            for (int j = 0; j < this.colonnes; j++) {
                if (this.matrice[i][j] != matrice2.matrice[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // Création de deux matrices 3x3
        Matrice matrice1 = new Matrice(3, 3);
        Matrice matrice2 = new Matrice(3, 3);

        // Remplissage des matrices
        matrice1.remplirMatrice();
        matrice2.remplirMatrice();

        // Affichage des matrices
        System.out.println("Matrice 1 :");
        matrice1.afficherMatrice();
        
        System.out.println("Matrice 2 :");
        matrice2.afficherMatrice();

        // Addition des matrices
        Matrice sommeMatrice = matrice1.sommeMatrice(matrice2);
        if (sommeMatrice != null) {
            System.out.println("Somme des matrices :");
            sommeMatrice.afficherMatrice();
        }

        // Multiplication des matrices
        Matrice produitMatrice = matrice1.multiplierMatrice(matrice2);
        if (produitMatrice != null) {
            System.out.println("Produit des matrices :");
            produitMatrice.afficherMatrice();
        }

        // Test d'égalité
        boolean sontEgales = matrice1.estEgale(matrice2);
        System.out.println("Les matrices sont-elles égales ? " + (sontEgales ? "Oui" : "Non"));
    }
}
