package _06_inheritance.thuc_hanh;

public class RectangleTest {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);

        rectangle = new Rectangle(5.0, 8.0);
        System.out.println(rectangle);

        rectangle = new Rectangle(5.0, 8.0,"Orange", true);
        System.out.println(rectangle);
    }
}
