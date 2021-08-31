package _12_java_collection_framework.bai_tap;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductManager {
    static Scanner sc = new Scanner(System.in);
    public static ArrayList<Product> carList = new ArrayList<Product>(50);
static {
    carList.add(new Product("Honda", "Civic", 25000));
    carList.add(new Product("Honda", "CR-V", 45000));
    carList.add(new Product("Honda", "City", 20000));
    carList.add(new Product("Honda", "Accord", 30000));
}
    public static void add() {
        System.out.println("Nhập vào hãng xe: ");
        String newCompany = sc.nextLine();
        System.out.println("Nhập vào tên xe muốn thêm: ");
        String newNameCar = sc.nextLine();
        System.out.println("Nhập vào giá tiền của xe: ");
        double newPrice = Double.parseDouble(sc.nextLine());
        carList.add(new Product(newCompany, newNameCar, newPrice));
        ProductManager.display();
    }
    public static void display() {
    for (int i =0; i < carList.size(); i++) {
        if(carList.get(i) != null) {
            System.out.println(carList.get(i).toString());
        }
    }
    }
    public static void delete() {
        System.out.println("Nhập vào tên xe muốn xóa: ");
        String deleteCar = sc.nextLine();
    }
}
