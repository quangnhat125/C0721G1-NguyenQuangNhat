package test_final.service;


import jdk.nashorn.internal.ir.WhileNode;
import test_final.models.Class;
import test_final.models.Student;
import test_final.utils.NotFoundStudentException;
import test_final.utils.ReadFile;
import test_final.utils.Validate;
import test_final.utils.WriteFile;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentServiceImplement implements IStudent {
    static String studentFilePath = "src\\test_final\\data\\student.csv";
    static String classFilePath = "src\\test_final\\data\\batchs.csv";
    static Scanner sc = new Scanner(System.in);

    @Override
    public void add() {

        try {
            List<Student> studentList = ReadFile.getStudentList(studentFilePath);
            System.out.println("Enter student code: ");
            String id = sc.nextLine();
            String fullName;
            do {
                System.out.println("Enter full name of student: ");
                fullName = sc.nextLine();
            } while(!Validate.validateName(fullName));
            String dayOfBirth;
            do {
                System.out.println("Enter student day of birth: ");
                dayOfBirth = sc.nextLine();
            } while (!Validate.validateDate(dayOfBirth));
            String gender = "";
            System.out.println("Please choose gender: \n 1. Male \n 2. Female \n 3. Other");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    gender = "Male";
                    break;
                case 2:
                    gender = "Female";
                    break;
                case 3:
                    gender = "Other";
                    break;
            }
            String phoneNumber;
            do {
                System.out.println("Enter phone number: ");
                phoneNumber = sc.nextLine();
            } while (!Validate.validatePhoneNumber(phoneNumber));
            List<Class> classList = ReadFile.getListClassCode(classFilePath);
            boolean flag = true;
            String classCode = "";
            while (flag) {
                System.out.println("List of class code: ");
                for (Class class1 : classList) {
                    System.out.println(class1.toString());
                }
                System.out.println("Enter class code: ");
                classCode = sc.nextLine();
                for (Class class2 : classList) {
                    if (class2.getClassCode().equals(classCode)) {
                        flag = false;
                        break;
                    }
                }
            }
            Student student = new Student(fullName, dayOfBirth, gender, phoneNumber, id, classCode);
            studentList.add(student);
            System.out.println("You have done added student!");
            WriteFile.WriteStringStudentToCSV(studentList, studentFilePath, false);
            display();
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }


    @Override
    public void display() {
        List<Student> studentList = ReadFile.getStudentList(studentFilePath);
        List<Class> classList = ReadFile.getListClassCode(classFilePath);
        for (int i = 0; i < studentList.size(); i++) {
            for (int j = 0; j < classList.size(); j++) {
                if (studentList.get(i) != null) {
                    System.out.println(i + 1 + ". " + studentList.get(i).toString() + "with name class: " + classList.get(j).getClassName());
                    break;
                }
            }
        }
    }

    public void deleteStudent() {
        List<Student> studentList = ReadFile.getStudentList(studentFilePath);
        int deleteID;
        boolean check;
        System.out.println("List of student: ");
        for (Student student : studentList) {
            System.out.println(student.toString());
        }
        do {
            System.out.println("Please enter id to delete: ");
            deleteID = Integer.parseInt(sc.nextLine());
            check = false;
            try {
                for (Student student : studentList) {
                    if (student.getStudentCode().equals(deleteID)) {
                        throw new NotFoundStudentException("Your ID is not exist! Please enter again");
                    }
                }
            } catch (NotFoundStudentException e) {
                System.err.println(e.toString());
                check = true;
            }
        } while (check);
        for (Student student : studentList) {
            if (student.getStudentCode().equals(deleteID)) {
                System.out.println("Do you want to delete: \n 1. Yes \n 2. No \n Please choose option: ");
                int choice = Integer.parseInt(sc.nextLine());
                switch (choice) {
                    case 1:
                        studentList.remove(student);
                        WriteFile.WriteStringStudentToCSV(studentList, studentFilePath, false);
                        System.out.println("You have done deleted student! ");
                        display();
                        break;
                    case 2:
                        break;
                }
            }
        }
    }

    public void search() {
        List<Student> studentList = ReadFile.getStudentList(studentFilePath);
        List<Student> studentSearchList = new ArrayList<>();
        System.out.println("Enter name of student for searching: ");
        String searchName = sc.nextLine();
        for (Student student : studentList) {
            if (student.getFullName().contains(searchName)) {
                studentSearchList.add(student);
            }
        }
        System.out.println("You have found" + studentSearchList.size() + "student with name: " + searchName);
        int i = 1;
        for (Student student : studentSearchList) {
            System.out.println(i + ":" + student.toString());
            i++;
        }
    }
}





