package _14_sorting_algorithms.thuc_hanh;

import java.util.Scanner;

public class ThucHanh2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào kích thước của mảng: ");
        int size = Integer.parseInt(sc.nextLine());
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Nhập vào phần tử thứ " + i + "của mảng: ");
            array[i] = Integer.parseInt(sc.nextLine());
        }
        System.out.println("\nBegin sort processing...");
        bubbleSortByStep(array);
    }
    public static void bubbleSortByStep(int[] array) {
        boolean isSwap = true;
        for (int k = 1; k < array.length && isSwap; k++) {
            isSwap = false;
            for (int i = 0; i < array.length - k; i++) {
                if (array[i] > array[i + 1]) {
                    System.out.println("Đổi chỗ " + array[i] + " với " + array[i + 1]);
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    isSwap = true;
                }
            }

            if (isSwap == false) {
                System.out.println("Mảng đã được sắp xếp!");
                break;
            }

            System.out.print("Mảng sau lần sắp xếp thứ " + k + ":");
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[j] + "\t");
            }
            System.out.println();
        }
    }
}
