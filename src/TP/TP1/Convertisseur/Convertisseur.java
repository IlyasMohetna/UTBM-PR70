package TP.TP1.Convertisseur;

import java.util.Scanner;

public class Convertisseur {
    private double degree;
    private String degree_type;


    public double getDegree() {
        return this.degree;
    }

    public void setDegree(double degree) {
        this.degree = degree;
    }

    public String getDegree_type() {
        return this.degree_type;
    }

    public void setDegree_type(String degree_type) {
        this.degree_type = degree_type;
    }

    public double CtoF()
    {
        return (this.degree * 9/5) + 32;
    }

    public double FtoC()
    {
        return (this.degree - 32) * 5/9;
    }

    public static void main(String[] args) {
        System.out.println("Pour convertir :");
        System.out.println("-- Du Celcius en Fahrenheit tapé C ");
        System.out.println("-- Du Fahrenheit en Celcius tapé F ");
        System.out.print("Votre Choix : ");
        Scanner Scanner = new Scanner(System.in);
        String degree_type = Scanner.nextLine();

        Convertisseur Convertisseur = new Convertisseur();
        Convertisseur.setDegree_type(degree_type);

        if(Convertisseur.getDegree_type().equals("C")){
            System.out.print("Merci de saisir votre températeur en Celcicus : ");
            double degree = Scanner.nextDouble();
            Convertisseur.setDegree(degree);
            System.out.println("Le temperature est équivalente à : "+ Convertisseur.CtoF()+"°F");
        }else if(Convertisseur.getDegree_type().equals("F"))
        {
            System.out.print("Merci de saisir votre températeur en Fahrenheit : ");
            double degree = Scanner.nextDouble();
            Convertisseur.setDegree(degree);
            System.out.println("Le temperature est équivalente à : "+ Convertisseur.FtoC()+"°C");
        }else{
            System.err.println("Votre choix est invalide !");
        }

        Scanner.close();
    }
}
