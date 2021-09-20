package case_study.service.implement;

import case_study.controllers.FuramaController;
import case_study.models.House;
import case_study.models.Room;
import case_study.models.Villa;
import case_study.service.IFacility;
import case_study.utils.ReadAndWrite;
import case_study.utils.Validate;
import case_study.utils.IDNotFoundException;

import java.util.*;

public class FacilityServiceImplement implements IFacility {
    static String villaFilePath = "src\\case_study\\data\\villa.csv";
    static String houseFilePath = "src\\case_study\\data\\house.csv";
    static String roomFilePath = "src\\case_study\\data\\room.csv";

    @Override
    public void addService() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please choose your option: \n 1. Add new Villa service \n 2. Add new House service \n 3. Add new Room service \n 4. Back to main menu \n 5. Delete Facility");
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
            case 4:
                FuramaController.displayFacilityManagement();
                break;
            case 5:
                deleteFacility();
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + choice);
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
        try {
            Scanner sc = new Scanner(System.in);
            Map<Villa, Integer> villaMap = ReadAndWrite.getVillaMap(villaFilePath);
            String idNameOfService;
            do {
                System.out.println("Please enter name of service's ID:");
                idNameOfService = sc.nextLine();
            } while (!Validate.validateIDNameOfServiceVilla(idNameOfService));
            String nameOfService;
            do {
                System.out.println("Please enter name of service: ");
                nameOfService = sc.nextLine();
            } while (!Validate.validateNameService(nameOfService));
            Double villaArea;
            do {
                System.out.println("Please enter villa's area: ");
                villaArea = Double.parseDouble(sc.nextLine());
            } while (!Validate.validateArea(villaArea));
            int villaRate;
            do {
                System.out.println("Please enter villa's rate: ");
                villaRate = Integer.parseInt(sc.nextLine());
            } while (!Validate.validateRoomRate(villaRate));
            int villaMaxPeople;
            do {
                System.out.println("Please enter villa's maximum of people: ");
                villaMaxPeople = Integer.parseInt(sc.nextLine());
            } while (!Validate.validateMaximumPeople(villaMaxPeople));
            String villaTypeRent;
            do {
                System.out.println("Please enter villa's type of rent: ");
                villaTypeRent = sc.nextLine();
            } while (!Validate.validateTypeOfRent(villaTypeRent));
            String villaStandard;
            System.out.println("Please enter villa's standard: ");
            villaStandard = sc.nextLine();
            Double villaPool;
            do {
                System.out.println("Please enter villa's pool area:  ");
                villaPool = Double.parseDouble(sc.nextLine());
            } while (!Validate.validatePoolArea(villaPool));
            System.out.println("Please enter villa's number of floor:  ");
            int villaFloor = Integer.parseInt(sc.nextLine());
            Villa villa = new Villa(idNameOfService, nameOfService, villaArea, villaRate, villaMaxPeople, villaTypeRent, villaStandard, villaPool, villaFloor);
            villaMap.put(villa, 0);
            ReadAndWrite.WriteVillaToCSV(villaMap, villaFilePath, false);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }

    public void addHouseService() {
        try {
            Scanner sc = new Scanner(System.in);
            Map<House, Integer> houseMap = ReadAndWrite.getHouseMap(houseFilePath);
            String idNameOfService;
            do {
                System.out.println("Please enter name of service's ID:");
                idNameOfService = sc.nextLine();
            } while (!Validate.validateIDNameOfServiceHouse(idNameOfService));
            String nameOfService;
            do {

                System.out.println("Please enter name of service: ");
                nameOfService = sc.nextLine();
            } while (!Validate.validateNameService(nameOfService));
            Double houseArea;
            do {
                System.out.println("Please enter house's area: ");
                houseArea = Double.parseDouble(sc.nextLine());
            } while (!Validate.validateArea(houseArea));
            int houseRate;
            do {
                System.out.println("Please enter house's rate: ");
                houseRate = Integer.parseInt(sc.nextLine());
            } while (!Validate.validateRoomRate(houseRate));
            int houseMaxPeople;
            do {
                System.out.println("Please enter house's maximum of people: ");
                houseMaxPeople = Integer.parseInt(sc.nextLine());
            } while (!Validate.validateMaximumPeople(houseMaxPeople));
            String houseTypeRent;
            do {
                System.out.println("Please enter house's type of rent: ");
                houseTypeRent = sc.nextLine();
            } while (!Validate.validateTypeOfRent(houseTypeRent));
            System.out.println("Please enter house's standard: ");
            String houseStandard = sc.nextLine();
            int houseFloor;
            do {
                System.out.println("Please enter villa's number of floor:  ");
                houseFloor = Integer.parseInt(sc.nextLine());
            } while (!Validate.validateNumberFloor(houseFloor));
            House house = new House(idNameOfService, nameOfService, houseArea, houseRate, houseMaxPeople, houseTypeRent, houseStandard, houseFloor);
            houseMap.put(house, 0);
            ReadAndWrite.WriteHouseToCSV(houseMap, houseFilePath, false);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }

    public void addRoomService() {
        try {
            Scanner sc = new Scanner(System.in);
            Map<Room, Integer> roomMap = ReadAndWrite.getRoomMap(roomFilePath);
            String idNameOfService;
            do {
                System.out.println("Please enter name of service's ID:");
                idNameOfService = sc.nextLine();
            } while (!Validate.validateIDNameOfServiceRoom(idNameOfService));
            String nameOfService;
            do {
                System.out.println("Please enter name of service: ");
                nameOfService = sc.nextLine();
            } while (!Validate.validateNameService(nameOfService));
            Double roomArea;
            do {
                System.out.println("Please enter room's area: ");
                roomArea = Double.parseDouble(sc.nextLine());
            } while (!Validate.validateArea(roomArea));
            int roomRate;
            do {
                System.out.println("Please enter room's rate: ");
                roomRate = Integer.parseInt(sc.nextLine());
            } while (!Validate.validateRoomRate(roomRate));
            int roomMaxPeople;
            do {
                System.out.println("Please enter room's maximum of people: ");
                roomMaxPeople = Integer.parseInt(sc.nextLine());
            } while (!Validate.validateMaximumPeople(roomMaxPeople));
            String roomTypeRent;
            do {
                System.out.println("Please enter room's type of rent: ");
                roomTypeRent = sc.nextLine();
            } while (!Validate.validateTypeOfRent(roomTypeRent));
            System.out.println("Please enter room's freeServiceIncluded: ");
            String roomFreeService = sc.nextLine();
            Room room = new Room(idNameOfService, nameOfService, roomArea, roomRate, roomMaxPeople, roomTypeRent, roomFreeService);
            roomMap.put(room, 0);
            ReadAndWrite.WriteRoomToCSV(roomMap, roomFilePath, false);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }

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
    public void addTimesOfUsing(String idNameOfService) {
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
            if (entry.getKey().getIdNameOfService().equals(idNameOfService)) {
                entry.setValue(entry.getValue() + 1);
            }
            ReadAndWrite.WriteVillaToCSV(villaMap, villaFilePath, false);
        }
        for (Map.Entry<House, Integer> entry : houseMap.entrySet()) {
            if (entry.getKey().getIdNameOfService().equals(idNameOfService)) {
                entry.setValue(entry.getValue() + 1);
            }
            ReadAndWrite.WriteHouseToCSV(houseMap, houseFilePath, false);
        }
        for (Map.Entry<Room, Integer> entry : roomMap.entrySet()) {
            if (entry.getKey().getIdNameOfService().equals(idNameOfService)) {
                entry.setValue(entry.getValue() + 1);
            }
            ReadAndWrite.WriteRoomToCSV(roomMap, roomFilePath, false);
        }
    }

    public void deleteFacility() {
        Scanner sc = new Scanner(System.in);
        System.out.println("DELETE MANAGEMENT \n Please choose your option: \n 1. Delete new Villa service \n 2. Add new House service \n 3. Add new Room service \n 4. Back to main menu");
        int choice = Integer.parseInt(sc.nextLine());
        switch (choice) {
            case 1:
                deleteVilla();
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                FuramaController.displayFacilityManagement();
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + choice);
        }

    }

    public void deleteVilla() {
        try {
            Scanner sc = new Scanner(System.in);
            Map<Villa, Integer> villaMap = ReadAndWrite.getVillaMap(villaFilePath);
            Set<Villa> villaSet = villaMap.keySet();
            String deleteID = "";
            boolean flag = true;
            boolean check;
            boolean checkExist = true;
            while (flag) {
                do {
                    System.out.println("List of Villa service: ");
                    for (Villa villa : villaSet) {
                        System.out.println(villa.getIdNameOfService());
                    }
                    System.out.println("Enter ID of Villa for deleting: ");
                    deleteID = sc.nextLine();
                    check = false;
                    try {
                        if (!Validate.validateIDNameOfServiceVilla(deleteID)) {
                            throw new IDNotFoundException("ID is not exist!");
                        }
                    } catch (IDNotFoundException e) {
                        System.err.println(e.getMessage());
                        check = true;
                    }
                } while (check);

                for (Villa villa : villaSet) {
                    if (villa.getIdNameOfService().equals(deleteID)) {
                        checkExist = false;
                        System.out.println("Do you want to delete" + deleteID + "? \n 1. Yes \n 2. No");
                        String choice = sc.nextLine();
                        if (choice.equals("1")) {
                            villaSet.remove(villa);
                            flag = false;
                            break;
                        } else {
                            flag = false;
                            break;
                        }
                    }
                }
                try {
                    if (checkExist) {
                        throw new IDNotFoundException("ID is not exist!");
                    }
                } catch (IDNotFoundException e) {
                    System.err.println(e.getMessage());
                }
                ReadAndWrite.WriteVillaToCSV(villaMap, villaFilePath, false);
                displayService();

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
