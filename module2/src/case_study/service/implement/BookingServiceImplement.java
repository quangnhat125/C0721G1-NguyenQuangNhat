package case_study.service.implement;

import case_study.models.*;
import case_study.service.IBooking;
import case_study.service.IFacility;
import case_study.utils.ReadAndWrite;

import java.time.LocalDate;
import java.util.*;

public class BookingServiceImplement implements IBooking {
    String customerFilePath = "src\\case_study\\data\\customer.csv";
    static String villaFilePath = "src\\case_study\\data\\villa.csv";
    static String houseFilePath = "src\\case_study\\data\\house.csv";
    static String roomFilePath = "src\\case_study\\data\\room.csv";
    String bookingQueueFilePath = "src\\case_study\\data\\bookingqueue.csv";
    String bookingFilePath = "src\\case_study\\data\\booking.csv";
    IFacility iFacility = new FacilityServiceImplement();

    @Override
    public void addService() {
        Scanner sc = new Scanner(System.in);
        TreeSet<Booking> bookingTreeSet = ReadAndWrite.getBookingTreeSet(bookingFilePath);
        Queue<Booking> bookingQueue = ReadAndWrite.getBookingQueue(bookingQueueFilePath);
        System.out.println("Enter Booking's ID: ");
        String bookingId = sc.nextLine();
        System.out.println("Enter Booking's day start: ");
        String bookingStart = sc.nextLine();
        System.out.println("Enter Booking's day end: ");
        String bookingEnd = sc.nextLine();
        System.out.println("Enter Booking's customer ID: ");
        String bookingCustomerID = customerCodeList();
        System.out.println("Enter Booking's name of service: ");
        String bookingNameService = nameOfService();
        System.out.println("Enter Booking's type of service: ");
        String bookingTypeService = chooseTypeOfService();
        Booking booking = new Booking(bookingId, bookingStart, bookingEnd, bookingCustomerID, bookingNameService, bookingTypeService);
        bookingTreeSet.add(booking);
        ReadAndWrite.WriteBookingTreeSetToCSV(bookingTreeSet, bookingFilePath, false);
        iFacility.addTimesOfUsing(bookingNameService);
        displayService();
        for (Booking b : bookingTreeSet) {
            if (b.getTypeOfService().equals("Villa") || b.getTypeOfService().equals("House")) {
                bookingQueue.add(b);
            }
        }
        ReadAndWrite.WriteBookingTreeSetToQueue(bookingQueue, bookingQueueFilePath, false);
    }

    @Override
    public void displayService() {
        TreeSet<Booking> bookingTreeSet = ReadAndWrite.getBookingTreeSet(bookingFilePath);
        for (Booking booking : bookingTreeSet) {
            System.out.println(booking.toString());
        }
    }

    @Override
    public void editService() {
    }

    public String nameOfService() {
        Scanner sc = new Scanner(System.in);
        Map<Villa, Integer> villaMap = ReadAndWrite.getVillaMap(villaFilePath);
        Map<House, Integer> houseMap = ReadAndWrite.getHouseMap(houseFilePath);
        Map<Room, Integer> roomMap = ReadAndWrite.getRoomMap(roomFilePath);
        Set<Villa> villaSet = villaMap.keySet();
        Set<House> houseSet = houseMap.keySet();
        Set<Room> roomSet = roomMap.keySet();
        List<String> nameOfService = new ArrayList<>();
        System.out.println("List of villa's name service: ");
        for (Villa villaKey : villaSet) {
            System.out.println(villaKey.getNameOfService());
            nameOfService.add(villaKey.getNameOfService());
        }
        System.out.println("List of house's name service: ");
        for (House houseKey : houseSet) {
            System.out.println(houseKey.getNameOfService());
            nameOfService.add(houseKey.getNameOfService());
        }
        System.out.println("List of room's name service: ");
        for (Room roomKey : roomSet) {
            System.out.println(roomKey.getNameOfService());
            nameOfService.add(roomKey.getNameOfService());
        }
        boolean flag = true;
        boolean check = true;
        String inputNameOfService = "";
        while (flag) {
            System.out.println("Please enter name of service: ");
            inputNameOfService = sc.nextLine();
            for (String string : nameOfService) {
                if (string.equals(inputNameOfService)) {
                    flag = false;
                    check = false;
                    break;
                }
            }
            if (!check) {
                System.out.println("Cannot find name of service! Please enter again");
            }
        }
        return inputNameOfService;
    }

    public String customerCodeList() {
        Scanner sc = new Scanner(System.in);
        List<Customer> customerList = ReadAndWrite.getListCustomer(customerFilePath);
        System.out.println("List of customer's code: ");
        for (Customer customer : customerList) {
            System.out.println(customer.getCustomerCode());
        }
        boolean flag = true;
        boolean check = true;
        String inputCustomerCode = "";
        while (flag) {
            System.out.println("Please enter customer's code: ");
            inputCustomerCode = sc.nextLine();
            for (Customer customer : customerList) {
                if (customer.equals(customerList)) {
                    flag = false;
                    check = false;
                    break;
                }
            }
            if (!check) {
                System.out.println("Cannot find customer's code! Please enter again");
            }
        }
        return inputCustomerCode;

    }
    private String chooseTypeOfService() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose type of service: ");
        String serviceType;

        System.out.println("Choose type of service: "
                + "1.Villa \n"
                + "2.House \n"
                + "3.Room \n"
        );
        String choose = sc.nextLine();
        switch (choose) {
            case "1":
                serviceType = "Villa";
                break;
            case "2":
                serviceType = "House";
                break;
            case "3":
                serviceType = "Room";
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + choose);
        }
        return serviceType;
    }
}
