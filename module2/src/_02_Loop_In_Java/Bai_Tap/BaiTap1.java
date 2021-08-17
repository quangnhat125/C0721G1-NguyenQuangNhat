package _02_Loop_In_Java.Bai_Tap;

import java.util.Scanner;

public class BaiTap1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = -1;
        while (choice != 0) {
            System.out.println("Menu \n 1. Print the rectangle \n 2. Print the square triangle \n 3. Print isosceles triangle \n 4. Exit \n Enter your choice: ");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Nhập vào chiều dài của hình: ");
                    int a = Integer.parseInt(sc.nextLine());
                    System.out.println("Nhập vào chiều rộng của hình: ");
                    int b = Integer.parseInt(sc.nextLine());
                    for (int i = 0; i < b; i++) {
                        for (int j = 0; j < a; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    System.out.println("Nhập vào cạnh của tam giác vuông cân: ");
                    int c = Integer.parseInt(sc.nextLine());
                    System.out.println("Bạn muốn đỉnh nằm ở đâu? \n 1. Ở trên bên trái \n 2. Ở trên bên phải \n 3. Ở dưới bên trái \n 4. Ở dưới bên phải");
                    int choice1 = Integer.parseInt(sc.nextLine());
                    switch (choice1) {
                        case 1:
                            for (int i = c; i > 0; i--) {
                                for (int j = 1; j <= i; j++) {
                                    System.out.print("*");
                                }
                            }
                            System.out.println();
                            break;
                        case 2:
                            for (int i = 0; i < c; i++) {
                                for (int j = 0; j < c; j++) {
                                    if (j < i) {
                                        System.out.print(" ");
                                    } else {
                                        System.out.print("*");
                                    }
                                }
                                System.out.println();
                            }
                            break;
                        case 3:
                            for (int i = 1; i <= c; i++) {
                                for (int j = 1; j <= i; j++) {
                                    System.out.print("*");
                                }
                                System.out.println();
                            }
                            break;
                        case 4:
                            for (int i = 0; i < c; i++) {
                                for (int j = c - i; j > 0; j--) {
                                    System.out.print(" ");
                                }
                                for (int k = 1; k <= i + 1; k++) {
                                    System.out.print("*");
                                }
                                System.out.println();
                            }
                            break;
                        default:
                            System.out.println("Không hiển thị được!");
                    }
                    break;
                case 3:
                    System.out.println("Nhập chiều cao của tam giác cân: ");
                    int d = Integer.parseInt(sc.nextLine());
                    for (int i = 0; i < d; i++) {
                        for (int j = d - i; j > 0; j--) {
                            System.out.print(" ");
                        }
                        for (int k = 1; k <= i * 2 + 1; k++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Không có trường hợp nào được chọn!");
            }
        }
    }
}
