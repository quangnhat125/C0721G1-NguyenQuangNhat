package case_study.models;

public abstract class Facility {
    private double area;
    private int roomNumber;
    private int numberOfBedroom;

    public Facility() {
    }

    public Facility(double area, int roomNumber, int numberOfBedroom) {
        this.area = area;
        this.roomNumber = roomNumber;
        this.numberOfBedroom = numberOfBedroom;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public int getNumberOfBedroom() {
        return numberOfBedroom;
    }

    public void setNumberOfBedroom(int numberOfBedroom) {
        this.numberOfBedroom = numberOfBedroom;
    }
}
