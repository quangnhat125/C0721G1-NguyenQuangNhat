package case_study.models;

public class Room extends Facility {
    private String freeServiceIncluded;

    public Room(String freeServiceIncluded) {
        this.freeServiceIncluded = freeServiceIncluded;
    }

    public Room(String nameOfService, double area, int roomRate, int maximumPeople, String typeOfRent, String freeServiceIncluded) {
        super(nameOfService, area, roomRate, maximumPeople, typeOfRent);
        this.freeServiceIncluded = freeServiceIncluded;
    }
    public Room(){

    }

    public String getFreeServiceIncluded() {
        return freeServiceIncluded;
    }

    public void setFreeServiceIncluded(String freeServiceIncluded) {
        this.freeServiceIncluded = freeServiceIncluded;
    }

    @Override
    public String toString() {
        return "Room{" +
                "freeServiceIncluded='" + freeServiceIncluded + '\'' +
                '}';
    }
    public String getRoomString() {
        return super.getFacilityString() + "," + getFreeServiceIncluded();
    }
}



