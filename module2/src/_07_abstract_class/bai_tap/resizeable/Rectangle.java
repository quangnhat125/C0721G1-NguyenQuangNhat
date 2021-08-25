package _07_abstract_class.bai_tap.resizeable;

import _06_inheritance.thuc_hanh.Shape;

public class Rectangle extends Shape implements Resizeable {
    private double width = 1.0;
    private double length = 1.0;

    public Rectangle() {
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }
    public double getArea() {
        return this.width * this.length;
    }
    public double getPerimeter() {
        return 2 * (this.width * this.length);
    }
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public void resize(double percent) {
        setWidth(getWidth() * percent);
        setLength(getLength() * percent);
    }
}
