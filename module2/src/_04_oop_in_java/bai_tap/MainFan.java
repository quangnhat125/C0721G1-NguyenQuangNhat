package _04_oop_in_java.bai_tap;

public class MainFan {
    public static void main(String[] args) {
        Fan fan1 = new Fan();
        fan1.setSpeed(3);
        fan1.setOn(true);
        fan1.setRadius(10);
        fan1.setColor("Yellow");
        Fan fan2 = new Fan();
        fan2.setSpeed(2);
        fan2.setOn(false);
        fan2.setRadius(5);
        fan2.setColor("Blue");
        System.out.println("Fan1 has the information is: " + fan1.toString());
        System.out.println("Fan2 has the information is: " + fan2.toString());
    }
}
