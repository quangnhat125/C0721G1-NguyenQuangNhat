package _18_binary_file_and_serializaiton.bai_tap;

import java.util.Scanner;

public class Product {
    private int idOfProduct;
    private String nameOfProduct;
    private String company;
    private double price;
    private String additionalInformation;

    public Product() {
    }

    public Product(int idOfProduct, String nameOfProduct, String company, double price, String additionalInformation) {
        this.idOfProduct = idOfProduct;
        this.nameOfProduct = nameOfProduct;
        this.company = company;
        this.price = price;
        this.additionalInformation = additionalInformation;
    }

    public int getIdOfProduct() {
        return idOfProduct;
    }

    public void setIdOfProduct(int idOfProduct) {
        this.idOfProduct = idOfProduct;
    }

    public String getNameOfProduct() {
        return nameOfProduct;
    }

    public void setNameOfProduct(String nameOfProduct) {
        this.nameOfProduct = nameOfProduct;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getAdditionalInformation() {
        return additionalInformation;
    }

    public void setAdditionalInformation(String additionalInformation) {
        this.additionalInformation = additionalInformation;
    }

    @Override
    public String toString() {
        return "Product= {" + this.getIdOfProduct() + ", " + this.getNameOfProduct() + ", " + this.getCompany() + ", " + this.getPrice() + ", " + this.getAdditionalInformation() + "}";
    }

}
