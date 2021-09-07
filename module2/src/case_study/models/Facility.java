package case_study.models;

public abstract class Facility {
    private String nameOfService;
    private double area;
    private int roomRate;
    private int maximumPeople;
    private String typeOfRent;

    public Facility() {
    }

    public Facility(String nameOfService,double area, int roomRate, int maximumPeople, String typeOfRent) {
        this.nameOfService = nameOfService;
        this.area = area;
        this.roomRate = roomRate;
        this.maximumPeople = maximumPeople;
        this.typeOfRent = typeOfRent;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public int getRoomRate() {
        return roomRate;
    }

    public void setRoomRate(int roomRate) {
        this.roomRate = roomRate;
    }

    public int getMaximumPeople() {
        return maximumPeople;
    }

    public void setMaximumPeople(int maximumPeople) {
        this.maximumPeople = maximumPeople;
    }

    public String getTypeOfRent() {
        return typeOfRent;
    }

    public void setTypeOfRent(String typeOfRent) {
        this.typeOfRent = typeOfRent;
    }

    public String getNameOfService() {
        return nameOfService;
    }

    public void setNameOfService(String nameOfService) {
        this.nameOfService = nameOfService;
    }
}
