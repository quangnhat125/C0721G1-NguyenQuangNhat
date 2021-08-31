package _12_java_collection_framework.bai_tap;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
//        Scanner sc = new Scanner(System.in);
        System.out.println("Menu: \n 1. Add \n 2.Edit \n 3. Delete \n 4. Display \n 5. Search \n 6. Sort" );
        int choice = Integer.parseInt(sc.nextLine());
           switch (choice) {
               case 1:
                   ProductManager.add();
                   break;
               case 4:
                   ProductManager.display();
                   break;
               default:
                   System.out.println("Vui lòng nhập lại!");
                   break;
           }
        }
    }
}
