package _03_Array_In_Java.Thuc_Hanh;

import java.util.Scanner;

public class ThucHanh4 {
    public static void main(String[] args) {
        int choice = -1;
        Scanner sc = new Scanner(System.in);
        double Fahrenheit;
        double celsius;
     while (choice != 0) {
         System.out.println("Menu \n 1. Fahrenheit to Celsius \n 2. Celsius to Fahrenheit \n 3. Exit");
         choice = Integer.parseInt(sc.nextLine());
         switch (choice) {
             case 1:
                 System.out.println("Enter fahrenheit: ");
                 Fahrenheit = Double.parseDouble(sc.nextLine());
                 System.out.println("Fahrenheit to Celsius: " + fahrenheitToCelsius(Fahrenheit));
                 break;
             case 2:
                 System.out.println("Enter celsius: ");
                 celsius = Double.parseDouble(sc.nextLine());
                 System.out.println("Fahrenheit to Celsius: " + celsiusToFahrenheit(celsius));
                 break;
             case 3:
                 System.exit(3);
         }
     }
    }
    public static double celsiusToFahrenheit(double celsius) {
        double Fahrenheit = (9.0 / 5) * celsius + 32;
        return Fahrenheit;
    }
    public static double fahrenheitToCelsius(double fahrenheit) {
        double celsius = (5.0 / 9) * (fahrenheit - 32);
        return celsius;
    }
}
