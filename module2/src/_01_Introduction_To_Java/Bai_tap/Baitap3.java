package _01_Introduction_To_Java.Bai_tap;

import java.util.Scanner;

public class Baitap3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int a = 23000;
        System.out.println("Nhập vào lựa chọn của bạn: \n 1: Đổi từ VND sang USD \n 2: Đổi từ USD sang VND \n 3: Hủy");
        int number = Integer.parseInt(sc.nextLine());
        if (number == 1) {
            System.out.println("Nhập vào số tiền muốn chuyển đổi: ");
            double money = Double.parseDouble(sc.nextLine());
            double result = money / a;
            System.out.println("Giá trị quy đổi sang VND là: " + result);
        }
        if (number == 2) {
            System.out.println("Nhập vào số tiền muốn chuyển đổi: ");
            double money = Double.parseDouble(sc.nextLine());
            double result = money * a;
            System.out.println("Giá trị quy đổi sang VND là: " + result);
        }

    }
}
