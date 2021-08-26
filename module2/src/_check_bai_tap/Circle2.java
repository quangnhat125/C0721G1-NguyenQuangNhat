package _check_bai_tap;
public class Circle2 extends Circle implements resize {
    public Circle2(double v){}


    @Override
    public double resize(double percent) {
        return percent;
    }
}