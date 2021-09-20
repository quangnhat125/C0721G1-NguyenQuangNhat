package test_final.models;

public class Class {
    private String classCode;
    private String className;
    private String teacherCode;

    public Class() {
    }

    public Class(String classCode, String className, String teacherCode) {
        this.classCode = classCode;
        this.className = className;
        this.teacherCode = teacherCode;
    }

    public String getClassCode() {
        return classCode;
    }

    public void setClassCode(String classCode) {
        this.classCode = classCode;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getTeacherCode() {
        return teacherCode;
    }

    public void setTeacherCode(String teacherCode) {
        this.teacherCode = teacherCode;
    }

    @Override
    public String toString() {
        return "Class{" +
                "classCode='" + classCode + '\'' +
                ", className='" + className + '\'' +
                ", teacherCode='" + teacherCode + '\'' +
                '}';
    }

    public String getTeacherString(){
        return  getClassCode() +","+ getClassName() +","+ getTeacherCode();
    }

}
