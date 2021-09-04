package case_study.models;

public class House extends Facility{
    private String extendedKitchen;
    private String kidsPlayground;
    private String serviceIncluded;

    public House(String extendedKitchen, String kidsPlayground) {
        this.extendedKitchen = extendedKitchen;
        this.kidsPlayground = kidsPlayground;
    }

    public House(double area, int roomNumber, int numberOfBedroom, String extendedKitchen, String kidsPlayground) {
        super(area, roomNumber, numberOfBedroom);
        this.extendedKitchen = extendedKitchen;
        this.kidsPlayground = kidsPlayground;

    }
    public House(){}

    public String getExtendedKitchen() {
        return extendedKitchen;
    }

    public void setExtendedKitchen(String extendedKitchen) {
        this.extendedKitchen = extendedKitchen;
    }

    public String getKidsPlayground() {
        return kidsPlayground;
    }

    public void setKidsPlayground(String kidsPlayground) {
        this.kidsPlayground = kidsPlayground;
    }

    public String getServiceIncluded() {
        return serviceIncluded;
    }

    public void setServiceIncluded(String serviceIncluded) {
        this.serviceIncluded = serviceIncluded;
    }
}
