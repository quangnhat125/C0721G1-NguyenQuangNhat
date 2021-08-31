package _12_java_collection_framework.bai_tap;

public class Product {
    private static String company = "Honda";
    private String nameCar;
    private double price;

    public Product() {
    }

    public Product(String company, String nameCar, double price) {
        this.company = company;
        this.nameCar = nameCar;
        this.price = price;
    }

//    public Product(String newNameCar, double newPrice) {
//    }

    public static String getCompany() {
        return company;
    }

    public static void setCompany(String company) {
        Product.company = company;
    }

    public String getNameCar() {
        return nameCar;
    }

    public void setNameCar(String nameCar) {
        this.nameCar = nameCar;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car: " + getNameCar() + " belong to company " + getCompany() + " with the price $" + getPrice();
    }
}
