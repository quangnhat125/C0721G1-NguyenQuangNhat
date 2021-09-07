package case_study.models;

public class Contract {
    private int idContract;
    private int idBooking;
    private double amountOfDeposit;
    private double totalPay;
    private int idCustomer;

    public Contract(int idContract, int idBooking, double amountOfDeposit, double totalPay, int idCustomer) {
        this.idContract = idContract;
        this.idBooking = idBooking;
        this.amountOfDeposit = amountOfDeposit;
        this.totalPay = totalPay;
        this.idCustomer = idCustomer;
    }
    public Contract(){}

    public int getIdContract() {
        return idContract;
    }

    public void setIdContract(int idContract) {
        this.idContract = idContract;
    }

    public int getIdBooking() {
        return idBooking;
    }

    public void setIdBooking(int idBooking) {
        this.idBooking = idBooking;
    }

    public double getAmountOfDeposit() {
        return amountOfDeposit;
    }

    public void setAmountOfDeposit(double amountOfDeposit) {
        this.amountOfDeposit = amountOfDeposit;
    }

    public double getTotalPay() {
        return totalPay;
    }

    public void setTotalPay(double totalPay) {
        this.totalPay = totalPay;
    }

    public int getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(int idCustomer) {
        this.idCustomer = idCustomer;
    }
}
