package _15_exception_and_debug.bai_tap;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
       Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào cạnh thứ nhất của tam giác: ");
        double side1 = Double.parseDouble(sc.nextLine());
        System.out.println("Nhập vào cạnh thứ hai của tam giác: ");
        double side2 = Double.parseDouble(sc.nextLine());
        System.out.println("Nhập vào cạnh thứ ba của tam giác: ");
        double side3 = Double.parseDouble(sc.nextLine());
        try {
            Triangle triangle = new Triangle(side1, side2, side3);
            System.out.println("Tam giác thõa mãn yêu cầu!");
        } catch (IllegalTriangleException e){
            System.err.println(e);
        }

    }
}
