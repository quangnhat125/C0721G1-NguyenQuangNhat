package bai_tap_final.models;

public class TypeOfCustomer {
    private String customerCode;
    private String typeOfUsing;

    public TypeOfCustomer(String customerCode, String typeOfUsing) {
        this.customerCode = customerCode;
        this.typeOfUsing = typeOfUsing;
    }

    public TypeOfCustomer() {
    }

    public String getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
    }

    public String getTypeOfUsing() {
        return typeOfUsing;
    }

    public void setTypeOfUsing(String typeOfUsing) {
        this.typeOfUsing = typeOfUsing;
    }

    @Override
    public String toString() {
        return "TypeOfCustomer{" +
                "customerCode='" + customerCode + '\'' +
                ", typeOfUsing='" + typeOfUsing + '\'' +
                '}';
    }
    public String getTypeOfCustomerString() {
        return getCustomerCode() + "," +getTypeOfUsing();
    }
}
