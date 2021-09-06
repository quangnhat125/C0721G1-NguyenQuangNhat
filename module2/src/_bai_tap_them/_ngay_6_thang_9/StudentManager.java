package _bai_tap_them._ngay_6_thang_9;

import bai_lam_them_fix_bug.Address;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class StudentManager {
    static TreeMap<Student, Integer> studentList = new TreeMap<>();

    static {
        studentList.put(new Student("Tân", 28, "Codegym"), 0);
        studentList.put(new Student("Huy", 24, "Codegym"), 0);
        studentList.put(new Student("Sang", 25, "Codegym"), 0);
        studentList.put(new Student("Nhật", 23, "Codegym"), 0);
    }

    public static void add() {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập tên");
        String name = sc.nextLine();
        System.out.println("nhập  tuổi");
        int age = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập trường: ");
        String school = sc.nextLine();
        Student student = new Student(name, age, school);
        Set<Student> studentSet = studentList.keySet();
        boolean check = false;
    }
}



//    public static void display () {
//        Set<Student> studentSet = studentList.keySet();
//    }

