package _04_oop_in_java.bai_tap;

public class Fan {
    private final int SLOW = 1;
    private final int MEDIUM = 2;
    private final int FAST = 3;
    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    private String color = "Blue";

    public Fan() {
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        String status = " ";
        if (this.isOn()) {
            status = status + "fan is off";
            System.out.println("Color is: " + this.getColor() + " and radius is: " + this.getRadius() + " and the status is: off");
        } else {
            status = status + "fan is on";
            System.out.println("Speed is: " + this.getSpeed() + ", color is: " + this.getColor() + ", radius is: " + this.getRadius() + " and the status is: on ");
        }
        return status;
    }

}
