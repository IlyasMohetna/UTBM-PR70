package App1;

public class Cercle {
    private double radius;
    private final double pi = 3.14;

    public Cercle(double radius){
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getPi() {
        return this.pi;
    }

    public double getPerimeter()
    {
        double diametre = this.radius * 2;
        return diametre * this.pi;
    }

    public double getArea()
    {
        return this.radius * this.radius * pi;
    }
    
    public static void main(String[] args) {
        Cercle Cercle = new Cercle(5);
        System.out.println("L'aire de ce cercle est : "+ Cercle.getPerimeter());
        System.out.println("Le perimetre de ce cercle est : "+ Cercle.getArea());
    }
}
