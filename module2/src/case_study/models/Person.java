package case_study.models;

import java.time.LocalDate;

public abstract class Person {
    private String fullName;
    private LocalDate dayOfBirth;
    private int id;
    private String gender;
    private int phoneNumber;
    private String email;

    public Person(String fullName, LocalDate dayOfBirth, int id, String gender, int phoneNumber, String email) {
        this.fullName = fullName;
        this.dayOfBirth = dayOfBirth;
        this.id = id;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }
    public Person(){}

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public LocalDate getDayOfBirth() {
        return dayOfBirth;
    }

    public void setDayOfBirth(LocalDate dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
