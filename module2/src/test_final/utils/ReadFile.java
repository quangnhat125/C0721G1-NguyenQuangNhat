package test_final.utils;

import bai_tap_final.models.TypeOfCustomer;
import test_final.models.Class;
import test_final.models.Student;
import test_final.models.Teacher;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ReadFile {
    public static List<String> ReadCSVToString(String path) {
        List<String> stringList = new ArrayList<>();
        File file = new File(path);
        try {
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                stringList.add(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return stringList;
    }
    public static List<Class> getListClassCode(String path) {
        List<String> stringList = ReadCSVToString(path);
        List<Class> classList = new LinkedList<>();
        for (String string : stringList) {
            String[] array = string.split(",");
            Class class1 = new Class(array[0], array[1], array[2]);
            classList.add(class1);
        }
        return classList;
    }

    public static List<Student> getStudentList(String path) {
        List<String> stringList = ReadCSVToString(path);
        List<Student> studentList = new ArrayList<>();
        for (int i = 0; i < stringList.size(); i++) {
            String[] array = stringList.get(i).split(",");
            Student student = new Student(array[0], array[1], array[2], array[3], array[4], array[5]);
            studentList.add(student);
        }
        return studentList;
    }
    public static List<Teacher> getTeacherList(String path) {
        List<String> stringList = ReadCSVToString(path);
        List<Teacher> teacherList = new ArrayList<>();
        for (int i = 0; i < stringList.size(); i++) {
            String[] array = stringList.get(i).split(",");
            Teacher teacher = new Teacher(array[0], array[1], array[2], array[3], array[4]);
            teacherList.add(teacher);
        }
        return teacherList;
    }
}
