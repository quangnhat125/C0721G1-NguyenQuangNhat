package _check_bai_tap;

public class Main {
    public static void main(String[] args) {
        Circle2 circle= new Circle2(10);
        Rectangle rectangle = new Rectangle(5,7);
        Square square = new Square(2,3);
        double[] shapeTests = new double[3];
        System.out.println("day la kich thuoc cua doi tuong khi chua thay doi hinhkich thuoc");
        shapeTests[0] = circle.getArea();
        shapeTests[1] = rectangle.getArea();
        shapeTests[2] = square.getArea();
        for (double shape : shapeTests
        ) {
            System.out.println(shape);
        }
        square.setSide(square.resize(Math.random()*100));
        System.out.println("day la kich thuoc cua doi tuong khi da thay doi hinh kich thuoc");
        for (double shape : shapeTests) {
            System.out.println(shape);
        }
    }
}