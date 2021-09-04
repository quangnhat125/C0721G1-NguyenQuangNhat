package case_study.models;

public class Room extends Facility {
    private int roomType;
    private String roomService;

    public Room(int roomType, String roomService) {
        this.roomType = roomType;
        this.roomService = roomService;
    }

    public Room(double area, int roomNumber, int numberOfBedroom, int roomType, String roomService) {
        super(area, roomNumber, numberOfBedroom);
        this.roomType = roomType;
        this.roomService = roomService;
    }
    public Room() {

    }

    public int getRoomType() {
        return roomType;
    }

    public void setRoomType(int roomType) {
        this.roomType = roomType;
    }

    public String getRoomService() {
        return roomService;
    }

    public void setRoomService(String roomService) {
        this.roomService = roomService;
    }
}
