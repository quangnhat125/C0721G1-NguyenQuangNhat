//package _bai_tap_them._ngay_6_thang_9;
//
//import bai_lam_them_fix_bug.Address;
//
//public class Student implements Comparable<Student> {
//    private String school;
//    private String name;
//    private int age;
//
//
//
//    public Student(String name, int age, String school) {
//        this.name = name;
//        this.age = age;
//        this.school = school;
//    }
//
//    public Student() {
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//
//
//    public String getSchool() {
//        return school;
//    }
//
//    public void setSchool(String school) {
//        this.school = school;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    @Override
//    public String toString() {
//        return "Student{" +
//                "name='" + getName() + '\'' +
//                ", AGE=" + getAge() + ", school= " + getSchool() +
//                '}';
//    }
//    @Override
//    public int compareTo(Student o) {
//        return this.getName().compareTo(o.getName());
//    }
//}
