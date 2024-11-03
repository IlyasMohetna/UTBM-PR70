package com.pr70.TP.TP4;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GestionnaireBouton implements ActionListener {
    private Calculatrice calculatrice;

    public GestionnaireBouton(Calculatrice calculatrice) {
        this.calculatrice = calculatrice;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String commande = e.getActionCommand();

        if (commande.matches("[0-9]")) {
            if (calculatrice.isEstNouvelleOperation()) {
                calculatrice.getEcran().setText(commande);
                calculatrice.setEstNouvelleOperation(false);
            } else {
                calculatrice.getEcran().setText(calculatrice.getEcran().getText() + commande);
            }
        } else if (commande.equals(".")) {
            if (!calculatrice.getEcran().getText().contains(".")) {
                calculatrice.getEcran().setText(calculatrice.getEcran().getText() + ".");
            }
        } else if ("+-×÷".contains(commande)) {
            calculatrice.setPremierNombre(Double.parseDouble(calculatrice.getEcran().getText()));
            calculatrice.setOperateur(commande);
            calculatrice.setEstNouvelleOperation(true);
        } else if (commande.equals("=")) {
            double deuxiemeNombre = Double.parseDouble(calculatrice.getEcran().getText());
            double resultat = calculer(calculatrice.getPremierNombre(), deuxiemeNombre, calculatrice.getOperateur());
            calculatrice.getEcran().setText(String.valueOf(resultat));
            calculatrice.setEstNouvelleOperation(true);
        } else if (commande.equals("C")) {
            calculatrice.getEcran().setText("");
        } else if (commande.equals("CE")) {
            calculatrice.getEcran().setText("");
            calculatrice.setPremierNombre(0);
            calculatrice.setOperateur("");
            calculatrice.setEstNouvelleOperation(true);
        } else if (commande.equals("±")) {
            double valeur = Double.parseDouble(calculatrice.getEcran().getText());
            calculatrice.getEcran().setText(String.valueOf(-valeur));
        } else if (commande.equals("%")) {
            double valeur = Double.parseDouble(calculatrice.getEcran().getText());
            calculatrice.getEcran().setText(String.valueOf(valeur / 100));
        }
    }

    private double calculer(double num1, double num2, String op) {
        switch (op) {
            case "+":
                return num1 + num2;
            case "-":
                return num1 - num2;
            case "×":
                return num1 * num2;
            case "÷":
                return num1 / num2;
            default:
                return num2;
        }
    }
}
