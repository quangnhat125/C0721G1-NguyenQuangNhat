package _18_binary_file_and_serializaiton.thuc_hanh.thuc_hanh_2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> student = new ArrayList<>();
        student.add(new Student(1, "Vũ Kiều Anh", "Hà Nội"));
        student.add(new Student(2, "Nguyễn Minh Quân", "Hà Nội"));
        student.add(new Student(3, "Đặng Huy Hoà", "Đà Nẵng"));
        student.add(new Student(4, "Nguyễn Khánh Tùng", "Hà Nội"));
        student.add(new Student(5, "Nguyễn Khắc Nhật", "Hà Nội"));
        writeToFile("studentTest.txt", student);
        List<Student> studentDataFromFile = readDataFromFile("student.txt");
        for (Student student2 : studentDataFromFile) {
            System.out.println(student);
        }
    }
    public static void writeToFile(String path, List<Student> students) {
        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(students);
            oos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static List<Student> readDataFromFile(String path) {
        List<Student> students = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            students = (List<Student>) ois.readObject();
            fis.close();
            ois.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return students;
    }
}
