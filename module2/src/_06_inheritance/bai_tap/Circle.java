package _06_inheritance.bai_tap;

public class Circle {
    public double radius = 1.0;
    public String color = "yellow";

    public Circle() {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public double getArea() {
        return this.radius * this.radius * Math.PI;
    }

    @Override
    public String toString() {
        return "A Circle with radius = " + getRadius() + " and color is: " + getColor();
    }
}
