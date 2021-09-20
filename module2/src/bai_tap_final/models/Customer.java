package bai_tap_final.models;

public abstract class Customer {
    private String fullName;
    private String customerCode;

    public Customer() {
    }

    public Customer(String fullName, String customerCode) {
        this.fullName = fullName;
        this.customerCode = customerCode;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "fullName='" + fullName + '\'' +
                ", customerCode='" + customerCode + '\'' +
                '}';
    }
    public String getCustomerString() {
        return getFullName() + "," + getCustomerCode();
    }
}
