package _check_bai_tap;

public class Square implements resize {
    private double side;
    double width;
    double height;
    public Square() {
    }

    public Square(double width,double height) {
        this.width = width;
        this.height = height;
    }
    public double getSide(){
        return width;
    }

    public void setSide(double side) {
        setWidth(side);
        setHeight(side);
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getArea(){
        return width*height;
    }


    @Override
    public double resize(double percent) {
        return this.getSide()*Math.sqrt(1+percent/100);
    }
}