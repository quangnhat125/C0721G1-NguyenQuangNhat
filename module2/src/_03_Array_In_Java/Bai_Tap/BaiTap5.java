package _03_Array_In_Java.Bai_Tap;

import java.util.Arrays;
import java.util.Scanner;

public class BaiTap5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào kích thước của mảng: ");
        int N = Integer.parseInt(sc.nextLine());
        int[] array = new int[N];
        for (int i = 0; i < N; i++ ){
            System.out.println("Nhập vào phần tử thứ " + i + "của mảng: ");
            array[i] = Integer.parseInt(sc.nextLine());
        }
        System.out.println("Mảng sau khi tạo là: " + Arrays.toString(array));
        int min = array[0];
        int index = 1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                index = i;
            }
        }
        System.out.println("Giá trị nhỏ nhất là: " + min + "tại vị trí: " + index);
    }
}
