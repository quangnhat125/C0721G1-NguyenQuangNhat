package case_study_extend.models;

public abstract class Transportation {
    private String licensePlate;
    private String companyName;
    private int yearOfManufacture;
    private String vehicleOwner;

    public Transportation() {
    }

    public Transportation(String licensePlate, String companyName,int yearOfManufacture, String vehicleOwner) {
        this.licensePlate = licensePlate;
        this.companyName = companyName;
        this.yearOfManufacture = yearOfManufacture;
        this.vehicleOwner = vehicleOwner;
    }
    public Transportation(String licensePlate){
        this.licensePlate = licensePlate;

    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public void setYearOfManufacture(int yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

    public String getVehicleOwner() {
        return vehicleOwner;
    }

    public void setVehicleOwner(String vehicleOwner) {
        this.vehicleOwner = vehicleOwner;
    }

    @Override
    public String toString() {
        return "Transportation{" +
                "licensePlate='" + licensePlate + '\'' +
                ", companyName='" + companyName + '\'' +
                ", yearOfManufacture='" + yearOfManufacture + '\'' +
                ", vehicleOwner='" + vehicleOwner + '\'' +
                '}';
    }
    public String getTransportationString() {
        return getLicensePlate() + "," + getCompanyName() + "," + getYearOfManufacture() + "," + getVehicleOwner();
    }
}
