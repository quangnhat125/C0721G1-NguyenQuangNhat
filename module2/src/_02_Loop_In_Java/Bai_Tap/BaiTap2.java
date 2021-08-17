package _02_Loop_In_Java.Bai_Tap;

import java.util.Scanner;

public class BaiTap2 {
    public static void main(String[] args) {
        System.out.println("Nhập vào số lượng số nguyên tố cần in ra: ");
        Scanner sc = new Scanner(System.in);
        int numbers = Integer.parseInt(sc.nextLine());
        int count = 0;
        int N = 2;
        while (count <= numbers) {
            int i = 2;
            boolean check = true;
            while (i <= Math.sqrt(N)) {
                if (N % i == 0) {
                    check = false;
                    break;
                }
                i++;
            }
            if (check) {
                System.out.println(N);
                count++;
            }
            N++;
        }

    }
}
