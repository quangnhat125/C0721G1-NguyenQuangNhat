package _03_Array_In_Java.Bai_Tap;

import java.util.Arrays;
import java.util.Scanner;

public class BaiTap3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập kích thước của mảng 1: ");
        int N = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập kích thước của mảng 2: ");
        int N1 = Integer.parseInt(sc.nextLine());
        int[] array = new int[N];
        int[] array2 = new int[N1];
        for (int i = 0; i < N; i++ ) {
            System.out.println("Nhập vào phần tử thứ " + i + "của mảng 1: ");
            array[i] = Integer.parseInt(sc.nextLine());
        }
        System.out.println("Mảng 1 được tạo là: " + Arrays.toString(array));
        for (int j = 0; j < N1; j++ ) {
            System.out.println("Nhập vào phần tử thứ " + j + "của mảng 2: ");
            array2[j] = Integer.parseInt(sc.nextLine());
        }
        System.out.println("Mảng 2 được tạo là: " + Arrays.toString(array2));
        int[] array3 = new int[N + N1];
        for (int i = 0; i < array.length; i++) {
            array3[i] = array[i];
        }
        for (int j = 0; j < array2.length; j++) {
            array3[array.length + j] = array2[j];
        }
        System.out.println("Mảng 3 sau khi gộp là " + Arrays.toString(array3));

    }
}
