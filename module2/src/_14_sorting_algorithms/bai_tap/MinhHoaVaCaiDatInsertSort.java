package _14_sorting_algorithms.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class MinhHoaVaCaiDatInsertSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào kích thước của mảng: ");
        int size = Integer.parseInt(sc.nextLine());
        int[] mangSoNguyen = new int[size];
        for(int i = 0; i < size; i++) {
            System.out.println("Nhập vào phần tử thứ " + i + " của mảng: " );
            mangSoNguyen[i] = Integer.parseInt(sc.nextLine());
        }
        System.out.println("Mảng đã được tạo là: " + Arrays.toString(mangSoNguyen)) ;
        System.out.println();
        System.out.println("Mảng sau khi sắp xếp chèn là: ");
        InsertSortByStep(mangSoNguyen);
    }
    public static void InsertSortByStep(int[] mangSoNguyen) {
        for (int i = 1; i < mangSoNguyen.length; i++ ) {
            int key = mangSoNguyen[i];
            int j = i - 1;
            while (j >= 0 && mangSoNguyen[j] > key) {
                mangSoNguyen[j + 1] = mangSoNguyen[j];
                j--;
            }
            mangSoNguyen[j + 1 ] = key;
        }
        System.out.println(Arrays.toString(mangSoNguyen));

    }
}
