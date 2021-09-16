package case_study.controllers;

import case_study.service.*;
import case_study.service.implement.BookingServiceImplement;
import case_study.service.implement.CustomerServiceImplement;
import case_study.service.implement.EmployeeServiceImplement;
import case_study.service.implement.FacilityServiceImplement;
import org.omg.PortableInterceptor.INACTIVE;

import java.sql.SQLOutput;
import java.util.Scanner;

public class FuramaController {
    static IEmployee iEmployee = new EmployeeServiceImplement();
    static ICustomer iCustomer = new CustomerServiceImplement();
    static IFacility iFacility = new FacilityServiceImplement();
    static IBooking iBooking = new BookingServiceImplement();

    public static void displayMainMenu() {
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Menu: \n 1. Employee Management \n 2. Customer Management \n 3. Facility Management \n 4. Booking Management \n 5. Promotion Management \n 6. Exit");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    displayEmployeeManagement();
                    break;
                case 2:
                    displayCustomerManagement();
                    break;
                case 3:
                    displayFacilityManagement();
                    break;
                case 4:
                    displayBookingManagement();
                    break;
                case 5:
                    System.out.println("Please select option: \n 1. Display list customers use service \n 2. Display list customers get voucher \n 3. Return main menu");
                    break;
                case 6:
                    System.exit(0);
                default:
                    System.out.println("Please enter again!");
                    break;
            }
        }
    }

    public static void displayEmployeeManagement() {
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("EMPLOYEE MANAGEMENT: \n Please select option \n 1. Display list employees \n 2. Add new employee \n 3. Edit employee \n 4. Return main menu ");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    iEmployee.displayService();
                    break;
                case 2:
                    iEmployee.addService();
                    break;
                case 3:
                    break;
                case 4:
                    displayMainMenu();
                    break;

            }
        }
    }

    public static void displayCustomerManagement() {
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("CUSTOMER MANAGEMENT \n Please select option: \n 1. Display list customers \n 2. Add new customer \n 3. Edit customer \n 4. Return main menu");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    iCustomer.displayService();
                    break;
                case 2:
                    iCustomer.addService();
                    break;
                case 3:
                    break;
                case 4:
                    displayMainMenu();
                    break;

            }
        }
    }
    public static void displayFacilityManagement() {
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("FACILITY MANAGEMENT \n Please select option: \n 1. Display list facility \n 2. Add new facility \n 3. Display list facility maintenance \n 4. Return main menu");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    iFacility.displayService();
                    break;
                case 2:
                    iFacility.addService();
                    break;
                case 3:
                    iFacility.displayForMaintaining();
                    break;
                case 4:
                    displayMainMenu();
                    break;

            }
        }
    }
    public static void displayBookingManagement() {
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("BOOKING MANAGEMENT \n Please select option: \n 1. Add new booking \n 2. Display list booking \n 3. Create new contracts \n 4. Display list contracts \n 5. Edit contracts \n 6. Return main menu");
            int choice = Integer.parseInt(sc.nextLine());
            switch(choice) {
                case 1:
                    iBooking.addService();
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
                    displayMainMenu();
                    break;
            }
        }
    }

    public static void main(String[] args) {
        displayMainMenu();
    }
}
