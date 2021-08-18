package _03_Array_In_Java.Thuc_Hanh;

import sun.plugin2.message.JavaScriptCallMessage;

import java.util.Scanner;

public class ThucHanh3 {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Enter a size: ");
            size = Integer.parseInt(sc.nextLine());
            if (size > 20) {
                System.out.println("Size should not exceed 20!");
            }
        } while (size > 20);
        array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter element " + (i + 1) + " : ");
            array[i] = Integer.parseInt(sc.nextLine());
        }
        System.out.print("Property list: ");
        for (int j = 0; j < array.length; j++ ){
            System.out.print(array[j] + "\t");
        }
        int max = 0;
        int index = 1;
        for (int j = 0; j < array.length;j++) {
            if (array[j] > max) {
                max = array[j];
                index = j;
            }
        }
        System.out.println("The largest property value in the list is " + max + " at position" + index);
    }
}
