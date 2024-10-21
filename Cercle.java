public class Cercle{
    // Mes propriétées
    private double rayon;

    public Cercle(double rayon_initial){
        this.rayon = rayon_initial;
    }

    // Mes methodes pour accéder et modifier mes propriétées
    public void setRayon(double r) {
        this.rayon = r;
    }

    public double getRayon() {
        return this.rayon;
    }

    // Mes méthodes de calcul
    public double calculerAire()
    {
        /// Pi * rayon * rayon
        return 3.14 * this.rayon * this.rayon;
    }

    public double calculerPerimetre()
    {
        /// 2 * Pi * rayon
        return 2 * 3.14 * this.rayon;
    }

    // Ma méthode qui se lance
    public static void main(String[] args) {
        System.out.println("Mon cercle : ");
        Cercle MonCercle1 = new Cercle(5);
        System.out.println("L'aire de mon cercle est " + MonCercle1.calculerAire());
        System.out.println("Le rayon de mon cercle : " + MonCercle1.getRayon());
        System.out.println("Le perimetre de mon cercle : " + MonCercle1.calculerPerimetre());
    }
}