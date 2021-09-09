package _18_binary_file_and_serializaiton.bai_tap;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class ProductFunction {
    public static Product[] productList= new Product[100];
    static {
        productList[0] = new Product(1, "Iphone11", "Apple", 20000000, "Sale off 10%");
        productList[1] = new Product(2, "Samsung S21", "Samsung", 18000000, "Sale off 20%");
        productList[2] = new Product(3, "Huawei 2", "Huawei", 10000000, "Sale off 30%");
    }
    public static void add() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Vui lòng nhập mã số sản phẩm: ");
        int newId = Integer.parseInt(sc.nextLine());
        System.out.println("Vui lòng nhập tên sản phẩm: ");
        String newName = sc.nextLine();
        System.out.println("Vui lòng nhập công ty sản xuất sản phẩm: ");
        String newCompany = sc.nextLine();
        System.out.println("Vui lòng nhập giá của sản phẩm: ");
        double newPrice = Double.parseDouble(sc.nextLine());
        System.out.println("Vui lòng nhập thông tin thêm của sản phẩm: ");
        String newInformation = sc.nextLine();
        Product product = new Product();
//        for (int i = 0; i < productList.length; i++) {
//            if(productList[i] != null) {
//                productList[i] = product;
//                break;
            }
//        }
//    }
//    public static void display() {
//        for (int i = 0; i < productList.length; i++) {
//            if (productList[i] != null) {
//                System.out.println(productList[i]);
//            }
//        }
//    }
    public void writeFile(Product[] productList) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("product_list.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
//        ObjectOutputStream.writeObject(productList);

    }
}
