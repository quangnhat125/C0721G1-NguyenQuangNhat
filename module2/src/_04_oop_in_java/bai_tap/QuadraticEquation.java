package _04_oop_in_java.bai_tap;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;
    double delta;

    public QuadraticEquation() {
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getDiscriminant() {
        return delta = (2 * this.b) - (4 * this.a * this.c);
    }

    public double getRoot1() {
        if (this.getDiscriminant() < 0) {
            return 0;
        } else {
            return (-this.b + Math.sqrt(this.getDiscriminant())) / (2 * this.a);
        }
    }
    public double getRoot2() {
        if (this.getDiscriminant() < 0) {
            return 0;
        } else {
            return (-this.b - Math.sqrt(this.getDiscriminant())) / (2 *this.a);
        }
    }
    public void getRoot() {
        if (this.getDiscriminant() < 0 ){
            System.out.println("Phương trình vô nghiệm!");
        } else if (this.getDiscriminant() == 0) {
            System.out.println("Phương trình có nghiệm kép là: x = " + this.getRoot1());
        } else {
            System.out.println("Phương trình có 2 nghiệm là: x1 = " + this.getRoot1() + " và x2 = " + this.getRoot2());
        }
    }
}
