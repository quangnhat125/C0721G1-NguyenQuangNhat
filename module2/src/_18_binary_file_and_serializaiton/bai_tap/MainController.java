package _18_binary_file_and_serializaiton.bai_tap;

import java.util.List;
import java.util.Scanner;

public class MainController {
    public static void main(String[] args) {
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Menu \n 1. Add \n 2. Display \n 3. Search");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    ProductFunction.add();
                    break;
                case 2:
                    ProductFunction.display();
                    break;
                case 3:
                default:
                    System.out.println("Vui lòng nhập lại!");
                    break;
            }
        }
    }
}
