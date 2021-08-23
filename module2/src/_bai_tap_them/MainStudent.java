package _bai_tap_them;

import java.util.Scanner;

public class MainStudent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Menu \n 1. Add Student \n 2. Edit \n 3. Erase \n 4. Display");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    FunctionStudent.add();
                    FunctionStudent.display();
                    break;
            }
        }
    }
}
