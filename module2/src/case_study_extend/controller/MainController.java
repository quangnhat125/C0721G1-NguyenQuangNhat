package case_study_extend.controller;

import case_study_extend.service.CarServiceImplement;
import case_study_extend.service.ITransportation;

import java.util.Scanner;

public class MainController {
    static ITransportation iCar = new CarServiceImplement();
    public static void displayMainMenu() {
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Transportation Management Menu: \n 1. Add new vehicle \n 2. Display vehicle \n 3. Delete vehicle \n 4. Exit");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    displayAddMenu();
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
            }


        }
    }

    public static void displayAddMenu() {
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("ADD NEW VEHICLE MENU: \n 1. Add truck \n 2. Add car \n 3. Add bike \n 0. Return");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    break;
                case 2:
                    iCar.add();
                    break;
                case 3:
                    break;
                case 0:
                    break;
            }
        }
    }

    public static void displayVehicleMenu() {
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("DISPLAY VEHICLE MENU: \n 1. Display truck \n 2. Display car \n 3. Display bike \n 0. Return");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 0:
                    break;
            }
        }
    }

    public static void deleteVehicle() {
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("DELETE VEHICLE MANAGEMENT \n Please enter license plate for deleting: ");
            String licensePlate = sc.nextLine();
        }
    }

    public static void main(String[] args) {
        displayMainMenu();
    }
}
