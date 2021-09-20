package case_study_extend.models;

public class Car extends Transportation{
   private int numberOfSeats;
   private String typeOfCar;

    public Car(String licensePlate) {
        super(licensePlate);
    }

    public Car(int numberOfSeats, String typeOfCar) {
        this.numberOfSeats = numberOfSeats;
        this.typeOfCar = typeOfCar;
    }

    public Car(String licensePlate, String companyName, int yearOfManufacture, String vehicleOwner, int numberOfSeats, String typeOfCar) {
        super(licensePlate, companyName, yearOfManufacture, vehicleOwner);
        this.numberOfSeats = numberOfSeats;
        this.typeOfCar = typeOfCar;
    }
    public Car(){}


    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public String getTypeOfCar() {
        return typeOfCar;
    }

    public void setTypeOfCar(String typeOfCar) {
        this.typeOfCar = typeOfCar;
    }

    @Override
    public String toString() {
        return "Car{" +
                "numberOfSeats=" + numberOfSeats +
                ", typeOfCar='" + typeOfCar + '\'' +
                '}' + super.toString();
    }
    public String getCarString(){
        return super.getTransportationString() + "," +getNumberOfSeats() + "," + getTypeOfCar();
    }
}
