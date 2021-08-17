package _02_Loop_In_Java.Thuc_Hanh;

import java.util.Scanner;

public class ThucHanh1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào một số bất kì: ");
        int number = Integer.parseInt(sc.nextLine());
        if (number < 2) {
            System.out.println(number + "không phải là số nguyên tố!");
        } else {
            int i = 2;
            boolean check = true;
            while (i < number) {
                if (number % i == 0) {
                    check = false;
                    break;
                }
                i++;
            }
            if (check) {
                System.out.println(number + "là số nguyên tố!");
            } else {
                System.out.println(number + "không phải là số nguyên tố!");
            }
        }
    }
}
