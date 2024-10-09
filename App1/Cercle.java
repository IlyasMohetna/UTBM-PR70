package App1;

public class Cercle {
    private double rayon;
    private final double pi = 3.14;

    public Cercle(double rayon){
        this.rayon = rayon;
    }

    public double getPerimeter()
    {
        double diametre = this.rayon * 2;
        return diametre * this.pi;
    }

    public double getArea()
    {
        return this.rayon * this.rayon * pi;
    }
    
    public static void main(String[] args) {
        Cercle Cercle = new Cercle(5);
        System.out.println("L'aire de ce cercle est : "+ Cercle.getPerimeter());
        System.out.println("Le perimetre de ce cercle est : "+ Cercle.getArea());
    }
}
