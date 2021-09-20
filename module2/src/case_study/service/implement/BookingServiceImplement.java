package case_study.service.implement;

import case_study.models.*;
import case_study.service.IBooking;
import case_study.service.IFacility;
import case_study.utils.ReadAndWrite;
import case_study.models.Booking;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class BookingServiceImplement implements IBooking {
    String customerFilePath = "src\\case_study\\data\\customer.csv";
    static String villaFilePath = "src\\case_study\\data\\villa.csv";
    static String houseFilePath = "src\\case_study\\data\\house.csv";
    static String roomFilePath = "src\\case_study\\data\\room.csv";
    static String bookingQueueFilePath = "src\\case_study\\data\\bookingqueue.csv";
    static String bookingFilePath = "src\\case_study\\data\\booking.csv";
    static String booking1FilePath = "src\\case_study\\data\\booking1.csv";
    IFacility iFacility = new FacilityServiceImplement();

    @Override
    public void addService() {
        TreeSet<Booking> bookingTreeSet = ReadAndWrite.getBookingTreeSet(booking1FilePath);
        Queue<Booking> bookingQueue = ReadAndWrite.getBookingQueue(bookingQueueFilePath);
        String iDNameOfService = iDNameOfService();
        String customerCode = customerCodeList();
        Scanner sc = new Scanner(System.in);
        String bookingId = "";
        boolean flag = true;
        while (flag) {
            try {
                System.out.println("Enter Booking's ID");
                bookingId = sc.nextLine();
                flag = false;
            } catch (Exception e) {
                e.printStackTrace();
            }
            for (Booking booking : bookingTreeSet) {
                if (booking.getIdBooking().equals(bookingId)) {
                    System.out.println("The booking iD is exist! \n Please enter again");
                }
            }
        }
        try {
            System.out.println("Enter Booking's day start: ");
            String bookingStart = sc.nextLine();
            System.out.println("Enter Booking's day end: ");
            String bookingEnd = sc.nextLine();
            System.out.println("Enter Booking's type of service: ");
            String bookingTypeService = chooseTypeOfService();
            Booking booking = new Booking(bookingId, bookingStart, bookingEnd, customerCode, iDNameOfService, bookingTypeService);
            bookingTreeSet.add(booking);
            ReadAndWrite.WriteBookingTreeSetToCSV(bookingTreeSet, booking1FilePath, false);
            iFacility.addTimesOfUsing(iDNameOfService);
            displayService();
            if (booking.getTypeOfService().equals("Villa") || booking.getTypeOfService().equals("House")) {
                bookingQueue.add(booking);
            }
            ReadAndWrite.WriteBookingTreeSetToQueue(bookingQueue, bookingQueueFilePath, false);
            displayService();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void displayService() {
        TreeSet<Booking> bookingTreeSet = ReadAndWrite.getBookingTreeSet(booking1FilePath);
        for (Booking booking : bookingTreeSet) {
            System.out.println(booking.toString());
        }
    }

    @Override
    public void editService() {
    }

    public String iDNameOfService() {
        Scanner sc = new Scanner(System.in);
        Map<Villa, Integer> villaMap = ReadAndWrite.getVillaMap(villaFilePath);
        Map<House, Integer> houseMap = ReadAndWrite.getHouseMap(houseFilePath);
        Map<Room, Integer> roomMap = ReadAndWrite.getRoomMap(roomFilePath);
        Set<Villa> villaSet = villaMap.keySet();
        Set<House> houseSet = houseMap.keySet();
        Set<Room> roomSet = roomMap.keySet();
        List<String> IDOfService = new ArrayList<>();
        System.out.println("List of villa's name service: ");
        for (Villa villaKey : villaSet) {
            System.out.println(villaKey.getIdNameOfService());
            IDOfService.add(villaKey.getIdNameOfService());
        }
        System.out.println("List of house's name service: ");
        for (House houseKey : houseSet) {
            System.out.println(houseKey.getIdNameOfService());
            IDOfService.add(houseKey.getIdNameOfService());
        }
        System.out.println("List of room's name service: ");
        for (Room roomKey : roomSet) {
            System.out.println(roomKey.getIdNameOfService());
            IDOfService.add(roomKey.getIdNameOfService());
        }
        boolean flag = true;
        boolean check = true;
        String inputIdNameOfService = "";
        try {
            while (flag) {
                System.out.println("Please enter name of service: ");
                inputIdNameOfService = sc.nextLine();
                for (String string : IDOfService) {
                    if (string.equals(inputIdNameOfService)) {
                        flag = false;
                        check = false;
                        break;
                    }
                }
                if (check) {
                    System.out.println("Cannot find name of service! Please enter again");
                }
            }
            return inputIdNameOfService;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return inputIdNameOfService;
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
        try {
            while (flag) {
                System.out.println("Please enter customer's code: ");
                inputCustomerCode = sc.nextLine();
                for (Customer customer : customerList) {
                    if (customer.getCustomerCode().equals(inputCustomerCode)) {
                        flag = false;
                        check = false;
                        break;
                    }
                }
                if (check) {
                    System.out.println("Cannot find customer's code! Please enter again");
                }
            }
            return inputCustomerCode;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return inputCustomerCode;
    }

    private String chooseTypeOfService() {
        String serviceType = "";
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Choose type of service: ");

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
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }

        return serviceType;
    }

}
