package bai_tap_final.service;

import bai_tap_final.models.Customer;
import bai_tap_final.models.TypeOfCustomer;
import bai_tap_final.models.VietnameseCustomer;
import bai_tap_final.utils.ReadFile;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class CustomerServiceImplement implements CustomerService {
    static Scanner sc = new Scanner(System.in);
    static String customerFilePath = "src\\bai_tap_final\\data\\customer.csv";
    static String typeOfCustomerFilePath = "src\\bai_tap_final\\data\\type_of_customer.csv";

    @Override
    public void search() {

    }

    @Override
    public void add() {
        while (true) {
            Map<Customer, Integer> customerMap = ReadFile.getCustomerMap(customerFilePath);
            System.out.println("ADD CUSTOMER MANAGEMENT: \n 1. Add Vietnamese customer \n 2. Add foreigner customer \n 0. Return");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    addVietnameseCustomer();
                    break;
                case 2:
                    break;
                case 0:
                    break;
            }
        }

    }

    public void addVietnameseCustomer() {
        Map<Customer, Integer> customerMap = ReadFile.getCustomerMap(customerFilePath);
        System.out.println("Enter new customer's full name: ");
        String fullName = sc.nextLine();
        System.out.println("Enter new customer's code: ");
        String customerCode = sc.nextLine();
        List<TypeOfCustomer> typeOfCustomers = ReadFile.getListTypeOfCustomer(typeOfCustomerFilePath);
        boolean flag = true;
        String typeOfUsing = "";
        while (flag) {
            System.out.println("List type of customer: ");
            for (TypeOfCustomer typeOfCustomer : typeOfCustomers) {
                System.out.println(typeOfCustomer.getTypeOfUsing());
            }
            System.out.println("Enter type of customer using: ");
            typeOfUsing = sc.nextLine();
            for (TypeOfCustomer typeOfCustomer : typeOfCustomers) {
                if (typeOfCustomer.getTypeOfUsing().equals(typeOfUsing)) {
                    flag = false;
                    break;
                }
            }
        }
        System.out.println("Enter customer's limit use: ");
        int limitUse = Integer.parseInt(sc.nextLine());
        VietnameseCustomer vietnameseCustomer = new VietnameseCustomer(fullName, customerCode, typeOfUsing, limitUse);
        customerMap.put(vietnameseCustomer, 0);
    }

    @Override
    public void display() {

    }
}
