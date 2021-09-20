package test_final.models;

public class Teacher extends Person{
    private String teacherCode;

    public Teacher(String teacherCode) {
        this.teacherCode = teacherCode;
    }

    public Teacher(String fullName, String dateOfBirth, String gender, String phoneNumber, String teacherCode) {
        super(fullName, dateOfBirth, gender, phoneNumber);
        this.teacherCode = teacherCode;
    }
    public Teacher(){}

    public String getTeacherCode() {
        return teacherCode;
    }

    public void setTeacherCode(String teacherCode) {
        this.teacherCode = teacherCode;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "teacherCode='" + teacherCode + '\'' +
                '}' +super.toString();
    }
    public String getTeacherString() {
        return super.getPersonString() + "," + getTeacherCode();
    }

    @Override
    public void showInfo() {
        System.out.println(toString());
    }
}
