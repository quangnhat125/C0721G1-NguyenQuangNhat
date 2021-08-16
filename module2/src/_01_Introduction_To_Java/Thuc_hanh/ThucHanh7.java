package _01_Introduction_To_Java.Thuc_hanh;

import java.util.Scanner;

public class ThucHanh7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double weight, height, bmi;
        System.out.println("Your weight (in kilogram): ");
        weight = scanner.nextDouble();

        System.out.println("Your height (in meter): ");
        height = scanner.nextDouble();
        bmi = weight / Math.pow(height, 2);
        System.out.printf("bmi", "Interpretation\n ");

        if (bmi < 18) {
            System.out.println("Underweight");
        } else if (bmi < 25.0) {
            System.out.println("Normal");
        } else if (bmi < 30.0) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obese");
        }
    }
}
