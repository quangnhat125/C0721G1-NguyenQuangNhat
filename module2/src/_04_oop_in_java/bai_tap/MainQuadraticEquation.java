package _04_oop_in_java.bai_tap;

;

import java.util.Scanner;

public class MainQuadraticEquation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số a:  ");
        double a = Double.parseDouble(sc.nextLine());
        System.out.println("Nhập vào số b:  ");
        double b = Double.parseDouble(sc.nextLine());
        System.out.println("Nhập vào số c:  ");
        double c = Double.parseDouble(sc.nextLine());
        QuadraticEquation quadraticEquation = new QuadraticEquation();
        quadraticEquation.setA(a);
        quadraticEquation.getA();
        quadraticEquation.setB(b);
        quadraticEquation.getB();
        quadraticEquation.setC(c);
        quadraticEquation.getB();
        quadraticEquation.getRoot();
    }
}
