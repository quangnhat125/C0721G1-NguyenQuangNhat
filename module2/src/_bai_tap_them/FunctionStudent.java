package _bai_tap_them;

import java.util.Scanner;

public class FunctionStudent {
    public static Student[] StudentList= new Student[100];
    static {
        StudentList[0] = new Student("Nhật",23);
        StudentList[1] = new Student("Tân",29);
        StudentList[2] = new Student("Huy",24);

    }
    public static void add() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào tên muốn thêm: ");
        String name = sc.nextLine();
        System.out.println("Nhập vào số tuổi: ");
        int Age = Integer.parseInt(sc.nextLine());
        Student student = new Student();
        for (int i = 0; i < StudentList.length; i++) {
            if (StudentList[i] == null) {
                StudentList[i] = student;
                break;
            }
        }

    }
    public static void display(){
        for (int i = 0; i < StudentList.length; i++) {
            if (StudentList[i] != null) {
                System.out.println(StudentList);
            }
        }
    }
}
