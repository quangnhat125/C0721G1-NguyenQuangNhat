package case_study.models;

public class Villa extends Facility {
    private String pool;
    private String promotionExclusive;
    private String breakfastIncluded;

    public Villa(String pool) {
        this.pool = pool;
    }

    public Villa(double area, int roomNumber, int numberOfBedroom, String pool) {
        super(area, roomNumber, numberOfBedroom);
        this.pool = pool;
    }
    public Villa() {

    }

    public String getPool() {
        return pool;
    }

    public void setPool(String pool) {
        this.pool = pool;
    }

    public String getPromotionExclusive() {
        return promotionExclusive;
    }

    public void setPromotionExclusive(String promotionExclusive) {
        this.promotionExclusive = promotionExclusive;
    }

    public String getBreakfastIncluded() {
        return breakfastIncluded;
    }

    public void setBreakfastIncluded(String breakfastIncluded) {
        this.breakfastIncluded = breakfastIncluded;
    }
}
