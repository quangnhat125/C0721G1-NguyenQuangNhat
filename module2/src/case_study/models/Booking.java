package case_study.models;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Booking implements Comparable<Booking> {
    private String idBooking;
    private String dayStart;
    private String dayEnd;
    private String idCustomer;
    private String nameOfService;
    private String typeOfService;

    public Booking(String idBooking, String dayStart, String dayEnd, String idCustomer, String nameOfService, String typeOfService) {
        this.idBooking = idBooking;
        this.dayStart = dayStart;
        this.dayEnd = dayEnd;
        this.idCustomer = idCustomer;
        this.nameOfService = nameOfService;
        this.typeOfService = typeOfService;
    }

    public Booking() {
    }

    public String getIdBooking() {
        return idBooking;
    }

    public void setIdBooking(String idBooking) {
        this.idBooking = idBooking;
    }

    public String getDayStart() {
        return dayStart;
    }

    public void setDayStart(String dayStart) {
        this.dayStart = dayStart;
    }

    public String getDayEnd() {
        return dayEnd;
    }

    public void setDayEnd(String dayEnd) {
        this.dayEnd = dayEnd;
    }

    public String getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(String idCustomer) {
        this.idCustomer = idCustomer;
    }

    public String getNameOfService() {
        return nameOfService;
    }

    public void setNameOfService(String nameOfService) {
        this.nameOfService = nameOfService;
    }

    public String getTypeOfService() {
        return typeOfService;
    }

    public void setTypeOfService(String typeOfService) {
        this.typeOfService = typeOfService;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "idBooking=" + idBooking +
                ", dayStart=" + dayStart +
                ", dayEnd=" + dayEnd +
                ", idCustomer=" + idCustomer +
                ", nameOfService='" + nameOfService + '\'' +
                ", typeOfService='" + typeOfService + '\'' +
                '}';
    }

    public String getBookingString() {
        return getIdBooking() + "," + getDayStart() + "," + getDayEnd() + "," + getIdCustomer() + "," + getNameOfService() + "," + getTypeOfService();
    }



    @Override
    public int compareTo(Booking o) {
        LocalDate thisStartDate = LocalDate.now();
        LocalDate bookingStartDate = LocalDate.now();
        LocalDate thisEndDate = LocalDate.now();
        LocalDate bookingEndDate = LocalDate.now();

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        try {
            thisStartDate = LocalDate.parse(getDayStart(), dateTimeFormatter);

            bookingStartDate = LocalDate.parse(o.getDayStart(), dateTimeFormatter);

            thisEndDate = LocalDate.parse(getDayEnd(), dateTimeFormatter);

            bookingEndDate = LocalDate.parse(o.getDayEnd(), dateTimeFormatter);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (thisStartDate.compareTo(bookingStartDate) == 0) {
            if (thisEndDate.compareTo(bookingEndDate) > 0) {
                return 1;
            } else {
                return -1;
            }
        } else if (thisStartDate.compareTo(bookingStartDate) > 0) {
            return 1;
        } else {
            return -1;
        }
    }

}
