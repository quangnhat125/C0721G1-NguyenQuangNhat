package _07_abstract_class.bai_tap.resizeable;

import _06_inheritance.thuc_hanh.Shape;


import java.sql.SQLOutput;
import java.util.Scanner;

public class ResizeableTest {

    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(4.5);
        shapes[1] = new Rectangle(4, 6);
        shapes[2] = new Square(6);
        System.out.println("Before Resizeable: ");
        for (Shape shape : shapes) {
            if (shape instanceof Circle) {
                System.out.println("Circle has the AREA is " + ((Circle) shape).getArea());
            }
            if (shape instanceof Rectangle) {
                System.out.println("Rectangle has the AREA is " + ((Rectangle) shape).getArea());
            }
            if (shape instanceof Square) {
                System.out.println("Square has the AREA is " + ((Square) shape).getArea());
            }
        }
        for (Shape shape : shapes) {
            if (shape instanceof Circle) {
                ((Circle) shape).resize(Math.random() * 100);
            }
            if (shape instanceof Rectangle) {
                ((Rectangle) shape).resize(Math.random() * 100);
            }
            if (shape instanceof Square) {
                ((Square) shape).resize(Math.random() * 100);
            }
        }
        System.out.println();
        System.out.println("After resize all the shape: ");
        System.out.println();
        for (Shape shape : shapes) {
            if (shape instanceof Circle) {
                System.out.println("Circle has the AREA is: " + ((Circle) shape).getArea());
            }
            if (shape instanceof Rectangle) {
                System.out.println("Rectangle has the AREA is: " + ((Rectangle) shape).getArea());
            }
            if (shape instanceof Square) {
                System.out.println("Square has the AREA is: " + ((Square) shape).getArea());
            }
        }
    }
}

