package case_study_extend.models;

public class Truck extends Transportation{
    private String heavyLoad;

    public Truck(String heavyLoad) {
        this.heavyLoad = heavyLoad;
    }

    public Truck(String licensePlate, String companyName, int yearOfManufacture, String vehicleOwner, String heavyLoad) {
        super(licensePlate, companyName, yearOfManufacture, vehicleOwner);
        this.heavyLoad = heavyLoad;
    }
    public Truck(){}

    public String getHeavyLoad() {
        return heavyLoad;
    }

    public void setHeavyLoad(String heavyLoad) {
        this.heavyLoad = heavyLoad;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "heavyLoad='" + heavyLoad + '\'' +
                '}' + super.toString();
    }
    public String getTruckString() {
        return super.getTransportationString() + "," + getHeavyLoad();
    }
}
