package bai_lam_them_fix_bug;
import java.util.*;

public class jjj {
    public static class SetStudent {
        static List<hhh.Student4> students = new ArrayList<>();
        static List<hhh.Student4> setStudents = new ArrayList<>();

        static {

            students.add( new hhh.Student4("Huy", "male", 24));
            students.add(new hhh.Student4("Nhat", "male", 23));
            students.add(new hhh.Student4("Lan", "female", 20));
            students.add(new hhh.Student4("Hien", "female", 26));
            students.add(new hhh.Student4("Tien", "male", 27));
        }

        public static void display() {
            for (int i = 0; i < students.size(); i++) {
                System.out.println(i+1+"."+students.get(i));
            }
        }

        public static void setDisplay() {
            Queue<hhh.Student4> female = new LinkedList();

            Queue<hhh.Student4> male = new LinkedList();
            for (int i = 0; i < students.size(); i++) {
                if (students.get(i).getGender().equals("female")) {
                    female.add(students.get(i));
                } else {
                    male.add(students.get(i));
                }
            }
            while (!female.isEmpty()) {
                setStudents.add(female.remove());
            }
            while (!male.isEmpty()) {
                setStudents.add(male.remove());
            }
            for (int i = 0; i < setStudents.size(); i++) {
                System.out.println(i + 1 + "." + setStudents.get(i));
            }
        }

        public static void main(String[] args) {
            SetStudent.display();
            System.out.println("Set display: ");
            SetStudent.setDisplay();

        }


    }
}
