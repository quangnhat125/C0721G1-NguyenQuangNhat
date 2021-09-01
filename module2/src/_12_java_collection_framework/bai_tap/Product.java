package _12_java_collection_framework.bai_tap;

public class Product {
    private int id;
    private String company;
    private String nameCar;
    private double price;

    public Product() {
    }

    public Product(int id, String company, String nameCar, double price) {
        this.id = id;
        this.company = company;
        this.nameCar = nameCar;
        this.price = price;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
//    public Product(String newNameCar, double newPrice) {
//    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
        return "ID: " + getId() +" Car: " + getNameCar() + ", company: " + getCompany() + " with the price $" + getPrice();
    }
}
