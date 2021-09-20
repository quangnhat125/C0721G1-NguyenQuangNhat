package bai_tap_final.models;

public class VietnameseCustomer extends Customer{
    private String typeOfCustomer;
    private int limitUsable;

    public VietnameseCustomer(String typeOfCustomer, int limitUsable) {
        this.typeOfCustomer = typeOfCustomer;
        this.limitUsable = limitUsable;
    }

    public VietnameseCustomer(String fullName, String customerCode, String typeOfCustomer, int limitUsable) {
        super(fullName, customerCode);
        this.typeOfCustomer = typeOfCustomer;
        this.limitUsable = limitUsable;
    }
    public VietnameseCustomer(){}

    public String getTypeOfCustomer() {
        return typeOfCustomer;
    }

    public void setTypeOfCustomer(String typeOfCustomer) {
        this.typeOfCustomer = typeOfCustomer;
    }

    public int getLimitUsable() {
        return limitUsable;
    }

    public void setLimitUsable(int limitUsable) {
        this.limitUsable = limitUsable;
    }

    @Override
    public String toString() {
        return "VietnameseCustomer{" +
                "typeOfCustomer='" + typeOfCustomer + '\'' +
                ", limitUsable='" + limitUsable + '\'' +
                '}';
    }
    public String getVietnameseCustomerString() {
        return super.getCustomerString() + "," + getTypeOfCustomer() + "," + getLimitUsable();
    }
}
