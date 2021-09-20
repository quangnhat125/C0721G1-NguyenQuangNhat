package bai_tap_final.models;

public class Bill {
    private String billCode;
    private String customerCode;
    private String dateGetBill;
    private double amountOfUsing;
    private String unitPrice;
    private int totalPay;

    public Bill(String billCode, String customerCode, String dateGetBill, double amountOfUsing, String unitPrice, int totalPay) {
        this.billCode = billCode;
        this.customerCode = customerCode;
        this.dateGetBill = dateGetBill;
        this.amountOfUsing = amountOfUsing;
        this.unitPrice = unitPrice;
        this.totalPay = totalPay;
    }

    public Bill() {
    }

    public String getBillCode() {
        return billCode;
    }

    public void setBillCode(String billCode) {
        this.billCode = billCode;
    }

    public String getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
    }

    public String getDateGetBill() {
        return dateGetBill;
    }

    public void setDateGetBill(String dateGetBill) {
        this.dateGetBill = dateGetBill;
    }

    public double getAmountOfUsing() {
        return amountOfUsing;
    }

    public void setAmountOfUsing(double amountOfUsing) {
        this.amountOfUsing = amountOfUsing;
    }

    public String getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(String unitPrice) {
        this.unitPrice = unitPrice;
    }

    public int getTotalPay() {
        return totalPay;
    }

    public void setTotalPay(int totalPay) {
        this.totalPay = totalPay;
    }

    @Override
    public String toString() {
        return "Bill{" +
                "billCode='" + billCode + '\'' +
                ", customerCode='" + customerCode + '\'' +
                ", dateGetBill='" + dateGetBill + '\'' +
                ", amountOfUsing=" + amountOfUsing +
                ", unitPrice='" + unitPrice + '\'' +
                ", totalPay=" + totalPay +
                '}';
    }
    public String getBillString() {
        return getBillCode() + "," + getCustomerCode() + "," + getDateGetBill() + "," + getAmountOfUsing() + "," + getUnitPrice() + "," +getTotalPay();
    }
}
