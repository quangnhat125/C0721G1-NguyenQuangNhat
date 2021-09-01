package _11_dsa_stack_queue.bai_tap;
import java.util.ArrayList;
import java.time.LocalDate;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class DemergingStudentList {

    static ArrayList<StudentList> listStudent = new ArrayList();

    static {
        listStudent.add(new StudentList("Nhật", "male", LocalDate.of(1998, 5, 12), 23));
        listStudent.add(new StudentList("Huy", "male", LocalDate.of(1997, 4, 18), 23));
        listStudent.add(new StudentList("Thư", "female", LocalDate.of(2003, 8, 23), 18));
        listStudent.add(new StudentList("Thảo", "female", LocalDate.of(2000, 7, 26), 21));
    }

    public static void main(String[] args) {
        Queue<StudentList> male = new LinkedList<>();
        Queue<StudentList> female = new LinkedList<>();
        Collections.sort(listStudent);
        for (int i = 0; i < listStudent.size(); i++) {
            if (listStudent.get(i).getGender().equals("male")) {
                male.add(listStudent.get(i));
            } else {
                female.add(listStudent.get(i));
            }
        }
        ArrayList<StudentList> listStudentAfterDemerging = new ArrayList<>();
        while (!female.isEmpty()) {
            listStudentAfterDemerging.add(female.poll());
        }
        while(!male.isEmpty()) {
            listStudentAfterDemerging.add(male.poll());
        }
        for (StudentList studentList : listStudent ) {
            System.out.println(listStudentAfterDemerging);
        }
    }
}
