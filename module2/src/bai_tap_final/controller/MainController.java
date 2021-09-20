package bai_tap_final.controller;

import bai_tap_final.service.BillService;
import bai_tap_final.service.BillServiceImplement;
import bai_tap_final.service.CustomerService;
import bai_tap_final.service.CustomerServiceImplement;

import java.util.Scanner;

public class MainController {
    static BillService billService = new BillServiceImplement();
    static CustomerService customerService = new CustomerServiceImplement();

    static Scanner sc = new Scanner(System.in);
    public static void displayMainMenu() {
        while (true) {
            System.out.println("ELECTRIC_BILL MANAGEMENT: \n Please choose these options: \n 1. Add new customer \n " +
                    "2. Display customer information \n 3. Search customer information \n 4. Add new bill \n " +
                    "5. Edit bill \n 6. Display bill \n 7. Exit");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    customerService.add();
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
            }

        }
    }
    public static void main(String[] args) {
        displayMainMenu();
    }

}
