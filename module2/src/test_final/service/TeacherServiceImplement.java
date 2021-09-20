package test_final.service;

import test_final.models.Teacher;
import test_final.utils.ReadFile;

import java.util.List;

public class TeacherServiceImplement implements ITeacher {
    static String teacherFilePath = "src\\test_final\\data\\teacher.csv";

    @Override
    public void add() {

    }

    @Override
    public void display() {
        List<Teacher> teacherList = ReadFile.getTeacherList(teacherFilePath);
        for (int i = 0; i < teacherList.size(); i++) {
            if (teacherList.get(i) != null) {
                System.out.println(i + 1 + ". " + teacherList.get(i).toString());
            }
        }
    }
}
