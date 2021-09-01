package _12_java_collection_framework.bai_tap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ProductManager {
    static Scanner sc = new Scanner(System.in);
    public static ArrayList<Product> carList = new ArrayList<Product>(50);

    static {
        carList.add(new Product(1, "Honda", "Civic", 25000));
        carList.add(new Product(2, "Toyota", "Fortune", 55000));
        carList.add(new Product(3, "Porsche", "718 Boxster", 80000));
        carList.add(new Product(4, "Honda", "Accord", 30000));
    }

    public static void add() {
        int newId;
        int i = 0;
        System.out.println("Nhập vào ID: ");
        newId = Integer.parseInt(sc.nextLine());

//            System.out.println("Nhập vào ID: ");
//            newId = Integer.parseInt(sc.nextLine());
        if (newId == carList.get(i).getId()) {
            System.out.println("ID bị trùng, vui lòng nhập lại!");
            do {
                System.out.println("Nhập vào ID: ");
                newId = Integer.parseInt(sc.nextLine());
                System.out.println("Nhập vào hãng xe: ");
                String newCompany = sc.nextLine();
                System.out.println("Nhập vào tên xe muốn thêm: ");
                String newNameCar = sc.nextLine();
                System.out.println("Nhập vào giá tiền của xe: ");
                double newPrice = Double.parseDouble(sc.nextLine());
                carList.add(new Product(newId, newCompany, newNameCar, newPrice));
                display();
                break;
            } while (i < carList.size());
//        System.out.println("Nhập vào hãng xe: ");
//        String newCompany = sc.nextLine();
//        System.out.println("Nhập vào tên xe muốn thêm: ");
//        String newNameCar = sc.nextLine();
//        System.out.println("Nhập vào giá tiền của xe: ");
//        double newPrice = Double.parseDouble(sc.nextLine());
//        carList.add(new Product(newId, newCompany, newNameCar, newPrice));
//        display();
        }
    }

    public static void display() {
        for (int i = 0; i < carList.size(); i++) {
            if (carList.get(i) != null) {
                System.out.println(carList.get(i).toString());
            }
        }
    }

    public static void delete() {
        System.out.println("Nhập vào ID muốn xóa: ");
        int deleteId = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < carList.size(); i++) {
            if (carList.get(i).getId() == deleteId) {
                carList.remove(i);
            }
        }
        display();
    }

    public static void edit() {
        System.out.println("Nhập vào ID sản phẩm muốn sửa: ");
        int editId = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < carList.size(); i++) {
            if (carList.get(i).getId() == editId) {
                System.out.println("Nhập vào tên công ty mới: ");
                String newCompany = sc.nextLine();
                System.out.println("Nhập vào tên xe mới: ");
                String newCar = sc.nextLine();
                System.out.println("Nhập vào giá mới: ");
                double newPrice = Double.parseDouble(sc.nextLine());
                carList.get(i).setCompany(newCompany);
                carList.get(i).setNameCar(newCar);
                carList.get(i).setPrice(newPrice);
                display();
            }
        }
    }

    public static void search() {
        System.out.println("Nhập vào tên xe muốn tìm: ");
        String searchCar = sc.nextLine();
        int index = 0;
        for (int i = 0; i < carList.size(); i++) {
//            if (carList.get(i) == null) {
//                System.out.println("Error!");
//                break;
//            }
            if (carList.get(i).getNameCar().equals(searchCar)) {
                index = i;
            }
        }
        System.out.println("Thông tin xe muốn tìm = " + carList.get(index));
    }

    public static void sortUpByValue() {
        SortByValue sortByValue = new SortByValue();
        Collections.sort(carList, sortByValue);
        display();
    }
}
