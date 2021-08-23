package _06_inheritance.bai_tap;

public class MovablePointTest {
    public static void main(String[] args) {


        MovablePoint movablePoint = new MovablePoint();
        System.out.println(movablePoint);

        movablePoint = new MovablePoint(3.5f, 5.4f);
        System.out.println(movablePoint);
        movablePoint.move();
        System.out.println(movablePoint);
    }
}
