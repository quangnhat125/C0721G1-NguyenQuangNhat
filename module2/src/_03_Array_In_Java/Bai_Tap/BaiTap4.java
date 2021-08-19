package _03_Array_In_Java.Bai_Tap;

import java.util.Arrays;
import java.util.Scanner;

public class BaiTap4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số hàng của ma trận: ");
        int row = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập vào số cột của ma trận: ");
        int column = Integer.parseInt(sc.nextLine());
        int[][] matrix = new int[row][column];
        for (int i = 0 ; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.println("Nhập vào phần tử vị trí: ["+i+","+j+"]");
                matrix[i][j] = Integer.parseInt(sc.nextLine());
            }
        }
        System.out.println("Ma trận đã nhập vào là: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]+ " ");
            }
            System.out.println();
        }
        int max = matrix[0][0];
        int index = 0;
        int index1 = 0;
        for(int i = 0; i < matrix.length;i++) {
            for (int j = 0; j < matrix[i].length;j++) {
                if (max < matrix[i][j]){
                    max = matrix[i][j];
                    index = i;
                    index1 = j;
                }
            }
        }
        System.out.println("Số lớn nhất trong ma trận là: " + max + "và có vị trí là: ["+index+","+index1+"]");
    }
}
