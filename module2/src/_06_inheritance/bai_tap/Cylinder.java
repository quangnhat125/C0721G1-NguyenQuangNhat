package _06_inheritance.bai_tap;

public class Cylinder extends Circle {
    private double height;
    public Cylinder(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return " A Cylinder with height = " + getHeight() + ", radius = " + getRadius() + " and color is: " + getColor() + ", which is a subclass of " + super.toString();
    }
}
