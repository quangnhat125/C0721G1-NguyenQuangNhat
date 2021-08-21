package bai_lam_them_fix_bug;

import java.util.Scanner;

public class StudentManager {
    public static Student[] studentList = new Student[100];

    static {
        studentList[0] = new Student("chanh", 18);
        studentList[1] = new Student("chanh1", 19);
        studentList[2] = new Student("chanh2", 20);

    }

    public static void add() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập tên");
        String name = scanner.nextLine();
        System.out.println("nhập  tuổi");
        int age = Integer.parseInt(scanner.nextLine());
        Student student = new Student(name, age);
        for (int i = 0; i < studentList.length; i++) {
            if (studentList[i] == null) {
                studentList[i] = student;
                break;
            }
        }
    }

    public static void display() {
        for (int i = 0; i < studentList.length - 1; i++) {
            System.out.println(studentList[i].toString());
        }
    }
}
