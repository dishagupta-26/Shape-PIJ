// class EquilateralPyramid extends shape implements volume interface
public class EquilateralPyramid extends Shape implements Volume {
    private double baseSide, height;

    // constructor
    public EquilateralPyramid(double baseSide, double height) {
        super("Equilateral Pyramid");
        this.baseSide = baseSide;
        this.height = height;
    }

}
