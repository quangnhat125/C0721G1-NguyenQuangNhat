package case_study.utils;

import case_study.models.*;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

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

    public static void WriteStringVillaToCSV(List<Villa> villaList, String path, boolean append) {
        List<String> stringList = new ArrayList<>();
        for (Villa villa : villaList) {
            stringList.add(villa.getVillaString());
        }
        Write(stringList, path, append);
    }

    public static void WriteStringRoomToCSV(List<Room> roomList, String path, boolean append) {
        List<String> stringList = new ArrayList<>();
        for (Room room : roomList) {
            stringList.add(room.getRoomString());
        }
        Write(stringList, path, append);
    }

    public static void WriteStringHouseToCSV(List<House> houseList, String path, boolean append) {
        List<String> stringList = new ArrayList<>();
        for (House house : houseList) {
            stringList.add(house.getHouseString());
        }
        Write(stringList, path, append);
    }

    public static void WriteStringBookingToCSV(TreeSet<Booking> bookingTreeSet, String path, boolean append) {
        List<String> stringList = new ArrayList<>();
    }

    public static void WriteStringContractToCSV(TreeSet<Contract> bookingTreeSet, String path, boolean append) {
        List<String> stringList = new ArrayList<>();
    }

    public static List<String> ReadCSVToString(String path) {
        List<String> stringList = new ArrayList<>();
        File file = new File(path);
        try {
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
            Employee employee = new Employee(array[0], array[1], Integer.parseInt(array[2]),
                    array[3], Integer.parseInt(array[4]),array[5],Integer.parseInt(array[6]),array[7], array[8],Double.parseDouble(array[9]));
            employeeList.add(employee);
        }
        return employeeList;
    }
    public static List<Customer> getListCustomer(String path) {
        List<String> stringList = ReadCSVToString(path);
        List<Customer> customersList = new ArrayList<>();
        for (int i = 0; i < stringList.size(); i++) {
            String[] array = stringList.get(i).split(",");
            Customer customer = new Customer(array[0], array[1], Integer.parseInt(array[2]),
                    array[3], Integer.parseInt(array[4]),array[5],array[6],array[7]);
            customersList.add(customer);
        }
        return customersList;
    }
    public static List<House> getListHouse(String path) {
        List<String> stringList = ReadCSVToString(path);
        List<House> housesList = new ArrayList<>();
        for (int i = 0; i < stringList.size(); i++) {
            String[] array = stringList.get(i).split(",");
            House house = new House(array[0], Double.parseDouble(array[1]), Integer.parseInt(array[2]),
                    Integer.parseInt(array[3]),array[4],array[5],Integer.parseInt(array[6]));
           housesList.add(house);
        }
        return housesList;
    }
    public static List<Villa> getListVilla(String path) {
        List<String> stringList = ReadCSVToString(path);
        List<Villa> villasList = new ArrayList<>();
        for (int i = 0; i < stringList.size(); i++) {
            String[] array = stringList.get(i).split(",");
            Villa villa = new Villa(array[0], Double.parseDouble(array[1]), Integer.parseInt(array[2]),
                    Integer.parseInt(array[3]),array[4],array[5],array[6],Integer.parseInt(array[7]));
            villasList.add(villa);
        }
        return villasList;
    }
    public static List<Room> getListRoom(String path) {
        List<String> stringList = ReadCSVToString(path);
        List<Room> roomList = new ArrayList<>();
        for (int i = 0; i < stringList.size(); i++) {
            String[] array = stringList.get(i).split(",");
            Room room = new Room(array[0], Double.parseDouble(array[1]), Integer.parseInt(array[2]),
                    Integer.parseInt(array[3]),array[4],array[5]);
            roomList.add(room);
        }
        return roomList;
    }


}
