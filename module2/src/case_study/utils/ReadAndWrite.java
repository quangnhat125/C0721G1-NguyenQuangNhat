package case_study.utils;

import case_study.models.*;

import java.io.*;
import java.time.LocalDate;
import java.util.*;

public class ReadAndWrite {
    private static void Write(List<String> stringList, String path, boolean append) {
        File file = new File(path);
        try {
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (String line : stringList) {
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void WriteStringEmployeeToCSV(List<Employee> employeeList, String path, boolean append) {
        List<String> stringList = new ArrayList<>();
        for (Employee employee : employeeList) {
            stringList.add(employee.getString());
        }
        Write(stringList, path, append);
    }

    public static void WriteStringCustomerToCSV(List<Customer> customerList, String path, boolean append) {
        List<String> stringList = new ArrayList<>();
        for (Customer customer : customerList) {
            stringList.add(customer.getCustomerString());
        }
        Write(stringList, path, append);
    }

//    public static void WriteStringVillaToCSV(List<Villa> villaList, String path, boolean append) {
//        List<String> stringList = new ArrayList<>();
//        for (Villa villa : villaList) {
//            stringList.add(villa.getVillaString());
//        }
//        Write(stringList, path, append);
//    }
//
//    public static void WriteStringRoomToCSV(List<Room> roomList, String path, boolean append) {
//        List<String> stringList = new ArrayList<>();
//        for (Room room : roomList) {
//            stringList.add(room.getRoomString());
//        }
//        Write(stringList, path, append);
//    }
//
//    public static void WriteStringHouseToCSV(List<House> houseList, String path, boolean append) {
//        List<String> stringList = new ArrayList<>();
//        for (House house : houseList) {
//            stringList.add(house.getHouseString());
//        }
//        Write(stringList, path, append);
//    }

    public static void WriteBookingTreeSetToCSV(TreeSet<Booking> bookingTreeSet, String path, boolean append) {
        List<String> stringList = new ArrayList<>();
        TreeSet<Booking> bookingTree = new TreeSet<>();
        for (Booking booking : bookingTree) {
            stringList.add(booking.getBookingString());
        }
        Write(stringList, path, append);
    }
    public static void WriteBookingTreeSetToQueue(Queue<Booking> bookingQueue, String path, boolean append) {
        List<String> stringList = new ArrayList<>();
        for (Booking booking : bookingQueue) {
            stringList.add(booking.getBookingString());
        }
        Write(stringList, path, append);
    }
    public static TreeSet<Booking> getBookingTreeSet(String path) {
        List<String> stringList = ReadCSVToString(path);
        TreeSet<Booking> bookingTreeSet = new TreeSet<>();
        for (int i = 0; i < stringList.size(); i++) {
            String[] array = stringList.get(i).split(",");
            Booking bookingTree = new Booking(array[0], array[1], array[2], array[3], array[4], array[5]);
            bookingTreeSet.add(bookingTree);
        }
        return bookingTreeSet;
    }
    public static Queue<Booking> getBookingQueue(String path) {
        List<String> stringList = ReadCSVToString(path);
        Queue<Booking> bookingQueue = new LinkedList<>();
        for (int i = 0; i < stringList.size(); i++) {
            String[] array = stringList.get(i).split(",");
            Booking booking = new Booking(array[0], array[1], array[2], array[3], array[4], array[5]);
            bookingQueue.add(booking);
        }
        return bookingQueue;
    }


    public static void WriteStringContractToCSV(TreeSet<Contract> bookingTreeSet, String path, boolean append) {
        List<String> stringList = new ArrayList<>();
    }

    public static List<String> ReadCSVToString(String path) {
        List<String> stringList = new ArrayList<>();
        File file = new File(path);
        try {
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                stringList.add(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return stringList;
    }

    public static List<Employee> getListEmployee(String path) {
        List<String> stringList = ReadCSVToString(path);
        List<Employee> employeeList = new ArrayList<>();
        for (int i = 0; i < stringList.size(); i++) {
            String[] array = stringList.get(i).split(",");
            Employee employee = new Employee(array[0], array[1], array[2],
                    array[3], array[4], array[5], array[6], array[7], array[8], Double.parseDouble(array[9]));
            employeeList.add(employee);
        }
        return employeeList;
    }

    public static List<Customer> getListCustomer(String path) {
        List<String> stringList = ReadCSVToString(path);
        List<Customer> customersList = new LinkedList<>();
        for (int i = 0; i < stringList.size(); i++) {
            String[] array = stringList.get(i).split(",");
            Customer customer = new Customer(array[0], array[1], array[2],
                    array[3], array[4], array[5], array[6], array[7], array[8]);
            customersList.add(customer);
        }
        return customersList;
    }

//    public static List<House> getListHouse(String path) {
//        List<String> stringList = ReadCSVToString(path);
//        List<House> housesList = new ArrayList<>();
//        for (int i = 0; i < stringList.size(); i++) {
//            String[] array = stringList.get(i).split(",");
//            House house = new House(array[0], Double.parseDouble(array[1]), Integer.parseInt(array[2]),
//                    Integer.parseInt(array[3]), array[4], array[5], Integer.parseInt(array[6]));
//            housesList.add(house);
//        }
//        return housesList;
//    }

    //    public static Map<Villa, Integer> getListVilla(String path) {
//        List<String> stringList = ReadCSVToString(path);
//        List<Villa> villasList = new ArrayList<>();
//        for (int i = 0; i < stringList.size(); i++) {
//            String[] array = stringList.get(i).split(",");
//            Villa villa = new Villa(array[0], Double.parseDouble(array[1]), Integer.parseInt(array[2]),
//                    Integer.parseInt(array[3]),array[4],array[5],array[6],Integer.parseInt(array[7]));
//            villasList.add(villa);
//        }
//        return villasList;
//    }
//    public static List<Room> getListRoom(String path) {
//        List<String> stringList = ReadCSVToString(path);
//        List<Room> roomList = new ArrayList<>();
//        for (int i = 0; i < stringList.size(); i++) {
//            String[] array = stringList.get(i).split(",");
//            Room room = new Room(array[0], Double.parseDouble(array[1]), Integer.parseInt(array[2]),
//                    Integer.parseInt(array[3]), array[4], array[5]);
//            roomList.add(room);
//        }
//        return roomList;
//    }

//    public static Map<Villa, Integer> readFacilitytoString(String path) {
//        Map<Facility, Integer> facilityList = new LinkedHashMap<>();
//        File file = new File(path);
//        try {
//            if (!file.exists()) {
//                throw new FileNotFoundException();
//            }
//            FileReader fileReader = new FileReader(file);
//            BufferedReader bufferedReader = new BufferedReader(fileReader);
//            String line = "";
//            while ((line = bufferedReader.readLine()) != null) {
//                facilityList.put(line, 0);
//
//            }
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        return facilityList;
//    }

    public static void WriteVillaToCSV(Map<Villa, Integer> villaMap, String path, boolean append) {
        List<String> stringList = new ArrayList<>();
        Set<Villa> keySet = villaMap.keySet();
        for (Villa key : keySet) {
            stringList.add(key.getVillaString() + "," + villaMap.get(key));
        }
        Write(stringList, path, append);
    }

    public static Map<Villa, Integer> getVillaMap(String path) {
        List<String> stringList = ReadCSVToString(path);
        Map<Villa, Integer> villaMap = new LinkedHashMap<>();
        for (int i = 0; i < stringList.size(); i++) {
            String[] array = stringList.get(i).split(",");
            Villa villa = new Villa(array[0], Double.parseDouble(array[1]), Integer.parseInt(array[2]), Integer.parseInt(array[3]), array[4], array[5], array[6], Integer.parseInt(array[7]));
            villaMap.put(villa, Integer.parseInt(array[8]));

        }
        return villaMap;
    }

    public static void WriteHouseToCSV(Map<House, Integer> houseMap, String path, boolean append) {
        List<String> stringList = new ArrayList<>();
        Set<House> keySet = houseMap.keySet();
        for (House key : keySet) {
            stringList.add(key.getHouseString() + "," + houseMap.get(key));
        }
        Write(stringList, path, append);
    }

    public static Map<House, Integer> getHouseMap(String path) {
        List<String> stringList = ReadCSVToString(path);
        Map<House, Integer> houseMap = new LinkedHashMap<>();
        for (int i = 0; i < stringList.size(); i++) {
            String[] array = stringList.get(i).split(",");
            House house = new House(array[0], Double.parseDouble(array[1]), Integer.parseInt(array[2]), Integer.parseInt(array[3]), array[4], array[5], Integer.parseInt(array[6]));
            houseMap.put(house, Integer.parseInt(array[7]));
        }
        return houseMap;
    }

    public static void WriteRoomToCSV(Map<Room, Integer> roomMap, String path, boolean append) {
        List<String> stringList = new ArrayList<>();
        Set<Room> keySet = roomMap.keySet();
        for (Room key : keySet) {
            stringList.add(key.getRoomString() + "," + roomMap.get(key));
        }
        Write(stringList, path, append);
    }

    public static Map<Room, Integer> getRoomMap(String path) {
        List<String> stringList = ReadCSVToString(path);
        Map<Room, Integer> roomMap = new LinkedHashMap<>();
        for (int i = 0; i < stringList.size(); i++) {
            String[] array = stringList.get(i).split(",");
            Room room = new Room(array[0], Double.parseDouble(array[1]), Integer.parseInt(array[2]), Integer.parseInt(array[3]), array[4], array[5]);
            roomMap.put(room, Integer.parseInt(array[6]));
        }
        return roomMap;
    }
}



