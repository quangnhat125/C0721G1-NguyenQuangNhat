package bai_lam_them_fix_bug;

import java.util.Scanner;

public class StudentManager {
    public static Student[] studentList = new Student[100];

    static {
        studentList[0] = new Student("chanh", 18,null);
        studentList[1] = new Student("chanh1", 19,null);
        studentList[2] = new Student("chanh2", 20,null);

    }

    public static void add() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập tên");
        String name = scanner.nextLine();
        System.out.println("nhập  tuổi");
        int age = Integer.parseInt(scanner.nextLine());
//        Student student = new Student(name, age);
//        for (int i = 0; i < studentList.length; i++) {
//            if (studentList[i] == null) {
//                studentList[i] = student;
//                break;
//            }
//        }
        Address address;
        System.out.println("Nhập số nhà: ");
        String houseNumber = scanner.nextLine();
        System.out.println("Nhập đường: ");
        String street = scanner.nextLine();
        System.out.println("Nhập phường: ");
        String ward = scanner.nextLine();
        System.out.println("Nhập quận: ");
        String district = scanner.nextLine();
        System.out.println("Nhập tỉnh/thành phố: ");
        String province = scanner.nextLine();
        address = new Address(houseNumber, street, ward, district, province);
        Student student = new Student(name, age, address);
        for (int i = 0; i < studentList.length; i++) {
            if (studentList[i] == null) {
                studentList[i] = student;
                break;
            }
        }
    }

    public static void display() {
        for (int i = 0; i < studentList.length - 1; i++) {
            if (studentList[i] != null) {
                System.out.println(studentList[i].toString());
            }
        }
    }
}
