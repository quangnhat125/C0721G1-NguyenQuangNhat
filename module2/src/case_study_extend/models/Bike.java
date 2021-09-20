package case_study_extend.models;

public class Bike extends Transportation {
    private String horsePower;

    public Bike(String horsePower) {
        this.horsePower = horsePower;
    }

    public Bike(String licensePlate, String companyName, int yearOfManufacture, String vehicleOwner, String horsePower) {
        super(licensePlate, companyName, yearOfManufacture, vehicleOwner);
        this.horsePower = horsePower;
    }
    public Bike() {}

    public String getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(String horsePower) {
        this.horsePower = horsePower;
    }

    @Override
    public String toString() {
        return "Bike{" +
                "horsePower='" + horsePower + '\'' +
                '}' + super.toString();
    }
    public String getBikeString(){
        return super.getTransportationString() + "," + getHorsePower();
    }
}
