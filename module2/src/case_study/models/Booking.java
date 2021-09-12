package case_study.models;

import java.time.LocalDate;

public class Booking {
    private int idBooking;
    private LocalDate dayStart;
    private LocalDate dayEnd;
    private int idCustomer;
    private String nameOfService;
    private String typeOfService;

    public Booking(int idBooking, LocalDate dayStart, LocalDate dayEnd, int idCustomer, String nameOfService, String typeOfService) {
        this.idBooking = idBooking;
        this.dayStart = dayStart;
        this.dayEnd = dayEnd;
        this.idCustomer = idCustomer;
        this.nameOfService = nameOfService;
        this.typeOfService = typeOfService;
    }
    public Booking(){
    }

    public int getIdBooking() {
        return idBooking;
    }

    public void setIdBooking(int idBooking) {
        this.idBooking = idBooking;
    }

    public LocalDate getDayStart() {
        return dayStart;
    }

    public void setDayStart(LocalDate dayStart) {
        this.dayStart = dayStart;
    }

    public LocalDate getDayEnd() {
        return dayEnd;
    }

    public void setDayEnd(LocalDate dayEnd) {
        this.dayEnd = dayEnd;
    }

    public int getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(int idCustomer) {
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
}
