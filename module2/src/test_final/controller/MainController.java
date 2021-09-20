package test_final.controller;

import test_final.service.IStudent;
import test_final.service.ITeacher;
import test_final.service.StudentServiceImplement;
import test_final.service.TeacherServiceImplement;

import java.io.*;
import java.io.File;
import java.util.Scanner;

public class MainController {
    static Scanner input = new Scanner(System.in);
    static IStudent iStudent = new StudentServiceImplement();
    static ITeacher iTeacher = new TeacherServiceImplement();


    public static void displayMainMenu() {
        while (true) {
            System.out.println("STUDENT MANAGEMENT: \n" +
                    "1.Add new student\n" +
                    "2.Delete student\n" +
                    "3.Display list of student\n" +
                    "4.Display information of teacher \n" +
                    "5.Search student\n" +
                    "0.Exit main menu");
            System.out.println("Enter your choose :");
            String choose = input.nextLine();
            switch (choose) {
                case "1":
                    iStudent.add();
                    break;
                case "2":
                    iStudent.deleteStudent();
                    break;
                case "3":
                    iStudent.display();
                    break;
                case "4":
                    iTeacher.display();
                    break;
                case "5":
                    iStudent.search();
                    break;
                case "0":
                    System.exit(0);
                default:
                    System.out.println("Enter again !");
                    displayMainMenu();
                    break;
            }
        }

    }


    public static void main(String[] args) {
        displayMainMenu();

    }
}



