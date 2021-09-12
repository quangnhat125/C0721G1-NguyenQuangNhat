package case_study.models;

import java.time.LocalDate;

public class Employee extends Person {
    private int idEmployee;
    private String levelOfEducation;
    private String titleOfPosition;
    private double salary;

    public Employee(String fullName, String dayOfBirth, int id, String gender, int phoneNumber, String email, int idEmployee, String levelOfEducation, String titleOfPosition, double salary) {
        super(fullName, dayOfBirth, id, gender, phoneNumber, email);
        this.idEmployee = idEmployee;
        this.levelOfEducation = levelOfEducation;
        this.titleOfPosition = titleOfPosition;
        this.salary = salary;
    }

    public Employee(int idEmployee, String levelOfEducation, String titleOfPosition, double salary) {
        this.idEmployee = idEmployee;
        this.levelOfEducation = levelOfEducation;
        this.titleOfPosition = titleOfPosition;
        this.salary = salary;
    }
    public Employee(){}

    public int getIdEmployee() {
        return idEmployee;
    }

    public void setIdEmployee(int idEmployee) {
        this.idEmployee = idEmployee;
    }

    public String getLevelOfEducation() {
        return levelOfEducation;
    }

    public void setLevelOfEducation(String levelOfEducation) {
        this.levelOfEducation = levelOfEducation;
    }

    public String getTitleOfPosition() {
        return titleOfPosition;
    }

    public void setTitleOfPosition(String titleOfPosition) {
        this.titleOfPosition = titleOfPosition;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "idEmployee=" + idEmployee +
                ", levelOfEducation='" + levelOfEducation + '\'' +
                ", titleOfPosition='" + titleOfPosition + '\'' +
                ", salary=" + salary +
                '}';
    }
     public String getString() {
        return super.toString() + "," + getIdEmployee() + "," + getLevelOfEducation() + "," + getTitleOfPosition() + "," + getSalary();
     }
}
