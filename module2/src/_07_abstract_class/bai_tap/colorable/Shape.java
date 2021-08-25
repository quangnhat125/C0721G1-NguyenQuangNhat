package _07_abstract_class.bai_tap.colorable;

public class Shape {
    public String color = "green";
    public boolean filled = true;

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = true;
    }

    ;

    public Shape() {
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
        return " A shape with color of " + getColor() + " and " + (isFilled() ? "filled" : "not filled");
    }
//
//
}
