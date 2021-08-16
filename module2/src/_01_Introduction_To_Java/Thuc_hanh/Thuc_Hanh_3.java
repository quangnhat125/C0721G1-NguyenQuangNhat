package _01_Introduction_To_Java;

import java.util.Scanner;

public class Thuc_Hanh_3 {
    public static void main(String[] args) {
        float width;
        float height;
        Scanner sc = new Scanner(System.in);
            System.out.println("Enter width:");
            width = sc.nextFloat();
            System.out.println("Enter Height:");
            height = sc.nextFloat();
            float area = width * height;
            System.out.println("Area is: " + area);
    }
}
