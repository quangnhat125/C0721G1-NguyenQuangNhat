package _12_java_collection_framework.thuc_hanh.thuc_hanh_3;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Student1 student = new Student1("Nhật", 23, "HT");
        Student1 student1 = new Student1("Phước", 30, "HN");
        Student1 student2 = new Student1("Tân", 28, "HT" );
        Student1 student3 = new Student1("Huy", 24, "HT" );

        List<Student1> lists = new ArrayList<Student1>();
        lists.add(student);
        lists.add(student1);
        lists.add(student2);
        lists.add(student3);
        Collections.sort(lists);
        for(Student1 st : lists){
            System.out.println(st.toString());
        }

        AgeComparator ageComparator = new AgeComparator();
        Collections.sort(lists,ageComparator);
        System.out.println("So sanh theo tuoi:");
        for(Student1 st : lists){
            System.out.println(st.toString());
        }
    }
}
