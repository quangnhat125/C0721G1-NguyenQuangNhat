package case_study.models;

public class Villa extends Facility {
    private String roomStandard;
    private String poolArea;
    private int numberOfFloor;

    public Villa(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public Villa(String roomStandard, String poolArea, int numberOfFloor) {
        this.roomStandard = roomStandard;
        this.poolArea = poolArea;
        this.numberOfFloor = numberOfFloor;
    }

    public Villa(String idNameOfService, String nameOfService, double area, int roomRate, int maximumPeople, String typeOfRent, String roomStandard, String poolArea, int numberOfFloor) {
        super(idNameOfService, nameOfService, area, roomRate, maximumPeople, typeOfRent);
        this.roomStandard = roomStandard;
        this.poolArea = poolArea;
        this.numberOfFloor = numberOfFloor;
    }

    public Villa() {

    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public String getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(String poolArea) {
        this.poolArea = poolArea;
    }

    public int getNumberOfFloor() {
        return numberOfFloor;
    }

    public void setNumberOfFloor(int numberOfFloor) {
        this.numberOfFloor = numberOfFloor;
    }

    @Override
    public String toString() {
        return "Villa{" +
                "roomStandard='" + roomStandard + '\'' +
                ", poolArea='" + poolArea + '\'' +
                ", numberOfFloor=" + numberOfFloor +
                '}' + super.toString();
    }
    public String getVillaString() {
        return super.getFacilityString() + "," + getRoomStandard() + "," + getPoolArea() + "," + getNumberOfFloor();
    }
}
