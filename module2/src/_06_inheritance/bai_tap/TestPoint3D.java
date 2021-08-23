package _06_inheritance.bai_tap;

public class TestPoint3D {
    public static void main(String[] args) {

        Point3D point3D = new Point3D();
        System.out.println(point3D.toString());

        point3D = new Point3D(3.5f, 4.1f,5.6f);
        System.out.println(point3D.toString());
    }
}
