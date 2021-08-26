package _check_bai_tap;

public class Shape2 {
    private String color = "green";
    private boolean filled = false;

    public Shape2() {
    }

    public Shape2(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "A shape with color of " + getColor() + " and " + (isFilled() ? "filled" : "no filled");
    }
}