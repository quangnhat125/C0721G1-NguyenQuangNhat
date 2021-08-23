package _05_access_modifier.bai_tap;

public class Circle1 {
    private double radius = 1.0;
    private String color = "red";

    public Circle1() {
    }
    public Circle1(double radius) {
        this.radius = radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea() {
        return this.radius*this.radius*Math.PI;
    }
}
