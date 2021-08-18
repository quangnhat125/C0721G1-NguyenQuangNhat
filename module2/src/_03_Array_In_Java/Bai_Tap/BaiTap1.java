package _03_Array_In_Java.Bai_Tap;

import java.util.Arrays;
import java.util.Scanner;

public class BaiTap1 {
    //    public static void main(String[] args) {
//        int[] array = {10, 4, 6, 7, 8, 6, 0, 0, 0, 0};
//        int a = 7;
//        int index = 0;
//        for (int i = 0; i < array.length; i++) {
//            if (a == array[i]) {
//                index = i;
//            }
//        }
////        System.out.println(index);
//        for (int j = index; j < array.length - 1; j++) {
//            array[j] = array[j + 1];
//        }
//        array[array.length - 1] = 0;
//        System.out.print("Mảng mới sau khi xóa là: " + Arrays.toString(array));
//    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào độ dài của mảng mong muốn: ");
        int N = Integer.parseInt(sc.nextLine());
        int[] array = new int[N];
        for (int i = 0; i < N;i++) {
            System.out.println("Nhập vào phần tử thứ " + i + "của mảng là: ");
            array[i] = Integer.parseInt(sc.nextLine());
        }
        System.out.println("Mảng có các phần tử là " + Arrays.toString(array));
        System.out.println("Nhập vào phần tử muốn xóa: ");
        int xoa = Integer.parseInt(sc.nextLine());
        int index_del = 0;
        for (int i = 0; i < array.length; i++) {
            if (xoa == array[i]) {
                index_del = i;
            }
        }
        for (int j = index_del; j < array.length - 1; j++) {
            array[j] = array[j + 1];
        }
        array[array.length -1] = 0;
        System.out.println("Mảng sau khi xóa là: " + Arrays.toString(array));
    }
}
