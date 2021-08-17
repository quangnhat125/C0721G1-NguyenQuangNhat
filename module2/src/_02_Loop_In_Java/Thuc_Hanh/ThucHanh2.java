package _02_Loop_In_Java.Thuc_Hanh;

import java.util.Scanner;

public class ThucHanh2 {
    public static void main(String[] args) {
        double money = 1.0;
        int month = 1;
        double interest = 1.0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số tiền muốn gởi: ");
        money = Double.parseDouble(sc.nextLine());
        System.out.println("Nhập vào số tháng muốn gởi: ");
        month = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập vào lãi suất: ");
        interest = Double.parseDouble(sc.nextLine());
        double result = 0;
        for (int i = 0; i < month; i++) {
            result += money * (interest/100)/12 * month;
        }
        System.out.println("Tổng số tiền lãi là: " + result);
    }
}
