package _bai_tap_them;

import java.util.Arrays;
import java.util.Scanner;

public class BaiTapThem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số dòng của mảng: ");
        int row = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập vào số cột của mảng: ");
        int column = Integer.parseInt(sc.nextLine());
        int[][] mangSoNguyen = new int[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.println("Nhập vào phần tử thứ [" + i + ", " + j + "]: ");
                mangSoNguyen[i][j] = Integer.parseInt(sc.nextLine());
            }
        }
        System.out.println(Arrays.toString(FindMax.findmax(mangSoNguyen, row, column)));
    }
    static class FindMax {
        public static int[] findmax(int[][] X, int row, int column) {
            int[] mangSoNguyenLonNhat = new int[row];
            for (int i = 0; i < row; i++) {
                int max = X[0][0];
                for (int j = 0; j < column; j++) {
                    if (X[i][j] > max) {
                        max = X[i][j];
                    }
                }
                mangSoNguyenLonNhat[i] = max;
            }
            return mangSoNguyenLonNhat;
        }
    }
}
