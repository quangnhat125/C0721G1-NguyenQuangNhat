package _05_access_modifier.bai_tap;

import java.util.Scanner;

public class TestCircle {
    public static void main(String[] args){
        Circle1 circle1 = new Circle1();
        circle1.setRadius(10);
        System.out.println("Area of circle1 is: " + circle1.getArea());
        Circle1 circle2 = new Circle1(15);
        System.out.println("Area of circle2 is: " + circle2.getArea());

    }
}
