package case_study.service.implement;

import case_study.models.House;
import case_study.models.Room;
import case_study.models.Villa;
import case_study.service.IFacility;
import case_study.utils.ReadAndWrite;
import sun.security.mscapi.CPublicKey;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class FacilityServiceImplement implements IFacility {
    static String  villaFilePath = "src\\case_study\\data\\villa.csv";
    static String houseFilePath = "src\\case_study\\data\\house.csv";
    static String roomFilePath = "src\\case_study\\data\\room.csv";

    @Override
    public void addService() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please choose your option: \n 1. Add new Villa service \n 2. Add new House service \n 3. Add new Room service");
        int choice = Integer.parseInt(sc.nextLine());
        switch (choice) {
            case 1:
                addVillaService();
                break;
            case 2:
                addHouseService();
                break;
            case 3:
                addRoomService();
                break;
            default:
                System.out.println("Please choose again!");
                break;
        }
    }

    @Override
    public void displayService() {
        Map<Villa, Integer> villaMap = ReadAndWrite.getVillaMap(villaFilePath);
        Map<House, Integer> houseMap = ReadAndWrite.getHouseMap(houseFilePath);
        Map<Room, Integer> roomMap = ReadAndWrite.getRoomMap(roomFilePath);
        Set<Villa> villaSet = villaMap.keySet();
        for (Villa villaKey : villaSet) {
            System.out.println(villaKey.toString() + "value: " + villaMap.get(villaKey));
        }
        Set<House> houseSet = houseMap.keySet();
        for (House houseKey : houseSet) {
            System.out.println(houseKey.toString() + "value: " + houseMap.get(houseKey));
        }
        Set<Room> roomSet = roomMap.keySet();
        for (Room roomKey : roomSet) {
            System.out.println(roomKey.toString() + "value: " + roomMap.get(roomKey));
        }
    }

    @Override
    public void editService() {
    }

    public void addVillaService() {
        Scanner sc = new Scanner(System.in);
        Map<Villa, Integer> villaMap = ReadAndWrite.getVillaMap(villaFilePath);
        System.out.println("Please enter name of service: ");
        String nameOfService = sc.nextLine();
        System.out.println("Please enter villa's area: ");
        Double villaArea = Double.parseDouble(sc.nextLine());
        System.out.println("Please enter villa's rate: ");
        int villaRate = Integer.parseInt(sc.nextLine());
        System.out.println("Please enter villa's maximum of people: ");
        int villaMaxPeople = Integer.parseInt(sc.nextLine());
        System.out.println("Please enter villa's type of rent: ");
        String villaTypeRent = sc.nextLine();
        System.out.println("Please enter villa's standard: ");
        String villaStandard = sc.nextLine();
        System.out.println("Please enter villa's pool area:  ");
        String villaPool = sc.nextLine();
        System.out.println("Please enter villa's number of floor:  ");
        int villaFloor = Integer.parseInt(sc.nextLine());
        Villa villa = new Villa(nameOfService, villaArea, villaRate, villaMaxPeople, villaTypeRent, villaStandard, villaPool, villaFloor);
        villaMap.put(villa, 0);
        ReadAndWrite.WriteVillaToCSV(villaMap, villaFilePath, false);
    }

    public void addHouseService() {
        Scanner sc = new Scanner(System.in);
        Map<House, Integer> houseMap = ReadAndWrite.getHouseMap(houseFilePath);
        System.out.println("Please enter name of service: ");
        String nameOfService = sc.nextLine();
        System.out.println("Please enter house's area: ");
        Double houseArea = Double.parseDouble(sc.nextLine());
        System.out.println("Please enter house's rate: ");
        int houseRate = Integer.parseInt(sc.nextLine());
        System.out.println("Please enter house's maximum of people: ");
        int houseMaxPeople = Integer.parseInt(sc.nextLine());
        System.out.println("Please enter house's type of rent: ");
        String houseTypeRent = sc.nextLine();
        System.out.println("Please enter house's standard: ");
        String houseStandard = sc.nextLine();
        System.out.println("Please enter villa's number of floor:  ");
        int houseFloor = Integer.parseInt(sc.nextLine());
        House house = new House(nameOfService, houseArea, houseRate, houseMaxPeople, houseTypeRent, houseStandard, houseFloor);
        houseMap.put(house, 0);
        ReadAndWrite.WriteHouseToCSV(houseMap, houseFilePath, false);
    }

    public void addRoomService() {
        Scanner sc = new Scanner(System.in);
        Map<Room, Integer> roomMap = ReadAndWrite.getRoomMap(roomFilePath);
        System.out.println("Please enter name of service: ");
        String nameOfService = sc.nextLine();
        System.out.println("Please enter room's area: ");
        Double roomArea = Double.parseDouble(sc.nextLine());
        System.out.println("Please enter room's rate: ");
        int roomRate = Integer.parseInt(sc.nextLine());
        System.out.println("Please enter room's maximum of people: ");
        int roomMaxPeople = Integer.parseInt(sc.nextLine());
        System.out.println("Please enter room's type of rent: ");
        String roomTypeRent = sc.nextLine();
        System.out.println("Please enter room's freeServiceIncluded: ");
        String roomFreeService = sc.nextLine();
        Room room = new Room(nameOfService, roomArea, roomRate, roomMaxPeople, roomTypeRent, roomFreeService);
        roomMap.put(room, 0);
        ReadAndWrite.WriteRoomToCSV(roomMap, roomFilePath, false);
    }
    @Override
    public void displayForMaintaining() {
        Map<Villa, Integer> villaMap = ReadAndWrite.getVillaMap(villaFilePath);
        Map<House, Integer> houseMap = ReadAndWrite.getHouseMap(houseFilePath);
        Map<Room, Integer> roomMap = ReadAndWrite.getRoomMap(roomFilePath);
        Set<Villa> villaSet = villaMap.keySet();
        for (Villa villaKey : villaSet) {
            if (villaMap.get(villaKey) > 5) {
                System.out.println(villaKey.toString());
            }
        }
        Set<House> houseSet = houseMap.keySet();
        for (House houseKey : houseSet) {
            if (houseMap.get(houseKey) > 5) {
                System.out.println(houseKey.toString());
            }
        }
        Set<Room> roomSet = roomMap.keySet();
        for (Room roomKey : roomSet) {
            if (villaMap.get(roomKey) > 5) {
                System.out.println(roomKey.toString());
            }
        }
    }

    //    for (Map.Entry<Villa, Integer> entry : villaMap.entrySet()) {
//        if (entry.getValue() > 5) {
//            System.out.println(entry.getKey().toString());
//        }
//        }
    public void addTimesOfUsing(String nameOfService) {
        Map<Villa, Integer> villaMap = ReadAndWrite.getVillaMap(villaFilePath);
        Map<House, Integer> houseMap = ReadAndWrite.getHouseMap(houseFilePath);
        Map<Room, Integer> roomMap = ReadAndWrite.getRoomMap(roomFilePath);
        Set<Villa> villaSet = villaMap.keySet();
//        for (Villa villaKey : villaSet) {
//            if (villaKey.getNameOfService().equals(nameOfService)) {
//                villaMap.get(villaKey)++;
//            }
//        }
        for (Map.Entry<Villa, Integer> entry : villaMap.entrySet()) {
            if (entry.getKey().getNameOfService().equals(nameOfService)) {
                entry.setValue(entry.getValue() + 1);
            }
            ReadAndWrite.WriteVillaToCSV(villaMap, villaFilePath, false);
        }
        for (Map.Entry<House, Integer> entry : houseMap.entrySet()) {
            if (entry.getKey().getNameOfService().equals(nameOfService)) {
                entry.setValue(entry.getValue() + 1);
            }
            ReadAndWrite.WriteHouseToCSV(houseMap, houseFilePath, false);
        }
        for (Map.Entry<Room, Integer> entry : roomMap.entrySet()) {
            if (entry.getKey().getNameOfService().equals(nameOfService)) {
                entry.setValue(entry.getValue() + 1);
            }
            ReadAndWrite.WriteRoomToCSV(roomMap, roomFilePath, false);
        }
    }
}
