package _07_abstract_class.bai_tap.colorable;

import _06_inheritance.thuc_hanh.Shape;
import _07_abstract_class.bai_tap.resizeable.Circle;
import _07_abstract_class.bai_tap.resizeable.Rectangle;


import java.util.Scanner;

public class ColorableTest {

    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(5);
        shapes[1] = new Rectangle(4, 7);
        shapes[2] = new Square(3);
        for (Shape shape : shapes) {
            if (shape instanceof Circle) {
                System.out.println("Circle has AREA is " + ((Circle) shape).getArea());
            }
            if (shape instanceof Rectangle) {
                System.out.println("Rectangle has AREA is " + ((Rectangle) shape).getArea());
            }
            if (shape instanceof Square) {
                System.out.println("Square has AREA is " + ((Square) shape).getArea());
                ((Square) shape).howToColor();
                System.out.println();
            }
        }
    }
}
