package _02_Loop_In_Java.Thuc_Hanh;

import java.util.Scanner;

public class ThucHanh3 {
    public static void main(String[] args) {
        int a;
        int b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số a: ");
        a = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập vào số b: ");
        b = Integer.parseInt(sc.nextLine());
        a = Math.abs(a);
        b = Math.abs(b);
        if (a == 0 || b == 0) {
            System.out.println("Không có ước số chung lớn nhất!");
        }
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b -a;
            }
        }
        System.out.println("Ước số chung lớn nhất là: " + a);
    }
}
