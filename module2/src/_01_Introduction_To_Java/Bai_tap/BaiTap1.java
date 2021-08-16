package _01_Introduction_To_Java.Bai_tap;

import java.util.Scanner;

public class BaiTap1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name;
        System.out.println("Enter your name: ");
        name = scanner.nextLine();
        System.out.printf("Hello " + name);
    }
}
