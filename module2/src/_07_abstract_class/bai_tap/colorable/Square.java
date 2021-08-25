package _07_abstract_class.bai_tap.colorable;

import _06_inheritance.thuc_hanh.Rectangle;

public class Square extends Rectangle implements IColorable{
    public Square(){}
    public Square(double side) {
        super(side, side);
    }
    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }
    public double getSide() {
        return getWidth();
    }
    public void setSide(double side) {
        setWidth(side);
        setLength(side);
    }

    @Override
    public String toString() {
        return "A Square with side = " + getSide() + ", which is a subclass of " + super.toString();
    }

    @Override
    public void setWidth(double width) {
        setSide(width);
    }

    @Override
    public void setLength(double length) {
        setSide(length);
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides.");
    }
}
