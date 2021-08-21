package _05_access_modifier.thuc_hanh;

public class TestStaticMethod {
    public static void main(String args[]) {
        Student.change(); //calling change method

        Student s1 = new Student(1, "Nhat");
        Student s2 = new Student(2, "Tan");
        Student s3 = new Student(3, "Phuoc");

        s1.display();
        s2.display();
        s3.display();
    }
}
