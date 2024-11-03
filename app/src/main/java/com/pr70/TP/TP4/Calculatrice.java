package com.pr70.TP.TP4;

import javax.swing.*;
import java.awt.*;

public class Calculatrice extends JFrame {
    private JTextField ecran;
    private JPanel panneauBoutons;
    private String operateur;
    private double premierNombre;
    private boolean estNouvelleOperation = true;

    public Calculatrice() {
        setTitle("Calculatrice");
        setSize(350, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        ecran = new JTextField();
        ecran.setEditable(false);
        ecran.setFont(new Font("Arial", Font.BOLD, 50));
        ecran.setHorizontalAlignment(JTextField.RIGHT);
        add(ecran, BorderLayout.NORTH);

        panneauBoutons = new JPanel();
        panneauBoutons.setLayout(new GridLayout(5, 4, 5, 5));
        ajouterBoutons();
        add(panneauBoutons, BorderLayout.CENTER);

        personnaliserInterface();
    }

    private void ajouterBoutons() {
        String[] nomsBoutons = {
            "C", "CE", "%", "÷",
            "7", "8", "9", "×",
            "4", "5", "6", "-",
            "1", "2", "3", "+",
            "±", "0", ".", "="
        };

        for (String nom : nomsBoutons) {
            BoutonCalculatrice bouton = new BoutonCalculatrice(nom);
            bouton.addActionListener(new GestionnaireBouton(this));
            panneauBoutons.add(bouton);
        }
    }

    private void personnaliserInterface() {
        Color couleurFond = new Color(30, 30, 30);
        Color couleurTexte = new Color(255, 255, 255);
        Color couleurBouton = new Color(50, 50, 50);
        Color couleurAccent = new Color(70, 130, 180);

        panneauBoutons.setBackground(couleurFond);
        ecran.setBackground(couleurFond);
        ecran.setForeground(couleurTexte);

        Component[] composants = panneauBoutons.getComponents();
        for (Component comp : composants) {
            if (comp instanceof BoutonCalculatrice) {
                BoutonCalculatrice btn = (BoutonCalculatrice) comp;
                btn.setBackground(couleurBouton);
                btn.setForeground(couleurTexte);
                if ("=+-×÷".contains(btn.getText())) {
                    btn.setBackground(couleurAccent);
                }
            }
        }
    }

    public JTextField getEcran() {
        return ecran;
    }

    public void setOperateur(String operateur) {
        this.operateur = operateur;
    }

    public String getOperateur() {
        return operateur;
    }

    public void setPremierNombre(double premierNombre) {
        this.premierNombre = premierNombre;
    }

    public double getPremierNombre() {
        return premierNombre;
    }

    public void setEstNouvelleOperation(boolean estNouvelleOperation) {
        this.estNouvelleOperation = estNouvelleOperation;
    }

    public boolean isEstNouvelleOperation() {
        return estNouvelleOperation;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Calculatrice calc = new Calculatrice();
            calc.setVisible(true);
        });
    }
}
