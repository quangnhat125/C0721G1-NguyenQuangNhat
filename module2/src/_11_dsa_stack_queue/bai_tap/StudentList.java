package _11_dsa_stack_queue.bai_tap;

import java.time.LocalDate;

public class StudentList implements Comparable<StudentList> {
    private String name;
    private String gender;
    private int age;
    private LocalDate birthday;

    public StudentList() {
    }

    public StudentList(String name, String gender, LocalDate birthday, int age) {
        this.birthday = birthday;
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Student = { Name: " + getName() + ", Birthday: " + getBirthday() + ", Gender: " + getGender() + "}";
    }

    @Override
    public int compareTo(StudentList o) {
        if (this.getAge() > o.getAge()) {
            return 1;
        } else {
            return -1;
        }
    }
}
