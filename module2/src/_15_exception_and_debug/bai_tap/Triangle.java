package _15_exception_and_debug.bai_tap;

public class Triangle {
    private double side1;
    private double side2;
    private double side3;

    public Triangle(double side1, double side2, double side3) throws Exception {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        if (side1 < 0 || side1 > side2 +side3) {
            throw new IllegalTriangleException("Không thỏa mãn yêu cầu!");
        } else if (side2 < 0 || side2 > side1 + side3) {
            throw new IllegalTriangleException("Không thỏa mãn yêu cầu!");
        } else if (side3 < 0 || side3 > side1 + side2) {
            throw new IllegalTriangleException("Không thỏa mãn yêu cầu!");
        } else {
            System.out.println("Các cạnh của tam giác là: " + side1 + ", " + side2 + ", " + side3);
        }

    }
    public Triangle(){}

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }
}
