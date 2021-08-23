package _bai_tap_them;

public class Student {
    private static String school = "CodeGym";
    private int Age;
    private String name;
    public Student() {
    }

    public static String getSchool() {
        return school;
    }

    public static void setSchool(String school) {
        Student.school = school;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public Student(String name, int Age) {
        this.name = name;
        this.Age = Age;
    }
}
