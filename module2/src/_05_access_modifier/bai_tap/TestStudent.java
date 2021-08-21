package _05_access_modifier.bai_tap;

public class TestStudent {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setName("Alex");
        student1.setClasses("C03");
        System.out.println(student1.getName() + " and " + student1.getClasses());
    }
}
