// sphere class extends shape class implements volume interface
public class Sphere extends Shape implements Volume {
    private double radius;

    // constructor
    public Sphere(double radius) {
        super("Sphere");
        this.radius = radius;
    }
}
