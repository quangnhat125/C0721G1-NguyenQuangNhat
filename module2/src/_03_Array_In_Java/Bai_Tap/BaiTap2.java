package _03_Array_In_Java.Bai_Tap;

import java.util.Arrays;
import java.util.Scanner;

public class BaiTap2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào kích thước mảng mong muốn: ");
        int N = Integer.parseInt(sc.nextLine());
        int[] array = new int[N];
        for (int i = 0; i < N; i++) {
            System.out.println("Nhập vào phần tử thứ " + i + "của mảng: ");
            array[i] = Integer.parseInt(sc.nextLine());
        }
        System.out.println("Mảng mới được tạo là: " + Arrays.toString(array));
        System.out.println("Nhập vào số X cần chèn: ");
        int X = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập vào vị trí index muốn chèn: ");
        int index = Integer.parseInt(sc.nextLine());
        if (index <= -1 || index >= array.length - 1) {
            System.out.println("Không thể chèn vào được mảng!");
        } else {
            for (int i = 0; i < array.length; i++) {
                if (i == index) {
                    array[i] = array[i +1];
                    array[index] = X;
                }
            }
        }
        System.out.println("Mảng sau khi thêm là: " + Arrays.toString(array));
    }
}
