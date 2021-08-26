package _check_bai_tap;

public class Circle {
    private double radius=1;
    private String color="red";

    Circle(double radius, String color){
        this.radius=radius;
        this.color=color;
    }
    public Circle(){
//        radius=1;
//        color="red";
    }

    public double getRadius() {
        return radius;
    }

    public double getArea(){
        return (radius*radius*Math.PI);
    }
}