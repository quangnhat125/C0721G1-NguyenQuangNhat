package _check_bai_tap;


public class Rectangle extends Shape2 implements resize{
    private double width=1;
    private double height=1;
    public  Rectangle(){
    }
    public Rectangle(double width,double height){
        this.width=width;
        this.height=height;
    }
    public Rectangle(double width,double height,String color,boolean filled){
        super(color, filled);
        this.width=width;
        this.height=height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getArea(){
        return width*height;
    }
    public double getPerimeter(){
        return 2*(width*height);
    }
    @Override
    public String toString(){
        return "Rectangle with width= "+getWidth()+" and Height= "+getHeight()+" Area= "+getArea()+" Perimeter= "+getPerimeter()+" ,which í a subclass of "+super.toString();
    }

    @Override
    public double resize(double percent) {
        return percent;
    }
}