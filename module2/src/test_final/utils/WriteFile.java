package test_final.utils;

import case_study_extend.models.Car;
import test_final.models.Student;
import test_final.models.Teacher;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class WriteFile {
    private static void Write(List<String> stringList, String path, boolean append) {
        File file = new File(path);
        try {
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (String line : stringList) {
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

public static void WriteStringStudentToCSV(List<Student> studentList, String path, boolean append) {
    List<String> stringList = new ArrayList<>();
    for (Student student : studentList) {
        stringList.add(student.getStudentString());
    }
    Write(stringList, path, append);
}
    public static void WriteStringTeacherToCSV(List<Teacher> teacherList, String path, boolean append) {
        List<String> stringList = new ArrayList<>();
        for (Teacher teacher : teacherList) {
            stringList.add(teacher.getTeacherString());
        }
        Write(stringList, path, append);
    }
}
