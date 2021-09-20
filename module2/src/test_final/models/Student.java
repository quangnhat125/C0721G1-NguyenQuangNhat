package test_final.models;

public class Student extends Person {
//    private static int idStudentTemp = 1;
    private String studentCode;
    private String classCode;

    public Student(String studentCode, String classCode) {
        this.studentCode = studentCode;
        this.classCode = classCode;
    }

    public Student(String fullName, String dateOfBirth, String gender, String phoneNumber, String studentCode, String classCode) {
        super(fullName, dateOfBirth, gender, phoneNumber);
        this.studentCode = studentCode;
        this.classCode = classCode;
    }
    public Student() {}

    public String getStudentCode() {
        return studentCode;
    }

    public void setStudentCode(String studentCode) {
        this.studentCode = studentCode;
    }

    public String getClassCode() {
        return classCode;
    }

    public void setClassCode(String classCode) {
        this.classCode = classCode;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentCode='" + studentCode + '\'' +
                ", classCode='" + classCode + '\'' +
                '}' + super.toString();
    }
    public String getStudentString() {
        return super.getPersonString() + "," + getStudentCode() + "," + getClassCode();
    }

    @Override
    public void showInfo() {
        System.out.println(toString());
    }
}
