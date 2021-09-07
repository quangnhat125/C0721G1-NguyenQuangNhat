package case_study.models;

import java.time.LocalDate;

public class Customer extends Person {
    private String typeOfCustomer;
    private String address;

    public Customer(String fullName, LocalDate dayOfBirth, int id, String gender, int phoneNumber, String email, String typeOfCustomer, String address) {
        super(fullName, dayOfBirth, id, gender, phoneNumber, email);
        this.typeOfCustomer = typeOfCustomer;
        this.address = address;
    }

    public Customer(String typeOfCustomer, String address) {
        this.typeOfCustomer = typeOfCustomer;
        this.address = address;
    }
    public Customer(){}

    public String getTypeOfCustomer() {
        return typeOfCustomer;
    }

    public void setTypeOfCustomer(String typeOfCustomer) {
        this.typeOfCustomer = typeOfCustomer;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
