package _06_inheritance.thuc_hanh;


public class Shape {
    public String color = "green";
    public boolean filled = true;
    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = true;
    };
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
    public class CircleTest{
    public void main(String[] args) {
    Circle circle = new Circle();
        System.out.println(circle);
    }
    }
}
