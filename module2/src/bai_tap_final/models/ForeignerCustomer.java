package bai_tap_final.models;

public class ForeignerCustomer extends Customer {
    private String nationality;

    public ForeignerCustomer(String nationality) {
        this.nationality = nationality;
    }

    public ForeignerCustomer(String fullName, String customerCode, String nationality) {
        super(fullName, customerCode);
        this.nationality = nationality;
    }
    public ForeignerCustomer(){}

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    @Override
    public String toString() {
        return "ForeignerCustomer{" +
                "nationality='" + nationality + '\'' +
                '}';
    }
    public String getForeignerCustomerString(){
        return super.getCustomerString() + "," + getNationality();
    }
}
