package _07_abstract_class.bai_tap.resizeable;

import _06_inheritance.thuc_hanh.Shape;

public class Circle extends Shape implements Resizeable {
    public double radius = 1.0;

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle() {
    }

    ;

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    @Override
    public void resize(double percent) {
        setRadius(getRadius() * (percent));
    }
}
