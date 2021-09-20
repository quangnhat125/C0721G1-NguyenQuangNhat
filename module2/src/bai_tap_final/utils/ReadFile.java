package bai_tap_final.utils;

import bai_tap_final.models.*;
import case_study_extend.models.Car;

import java.io.*;
import java.util.*;

public class ReadFile {
    public static List<String> ReadCSVToString(String path) {
        List<String> stringList = new ArrayList<>();
        File file = new File(path);
        try {
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                stringList.add(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return stringList;
    }
//    public static List<Customer> getCustomerList(String path) {
//        List<String> stringList = ReadCSVToString(path);
//        List<Customer> customerList = new ArrayList<>();
//        for (int i = 0; i < stringList.size(); i++) {
//            String[] array = stringList.get(i).split(",");
//            Customer customer = new Customer()
//
//        }
//        return carList;
//    }
public static List<TypeOfCustomer> getListTypeOfCustomer(String path){
    List<String > stringList =ReadCSVToString(path);
    List<TypeOfCustomer> typeOfCustomers = new LinkedList<>();
    for(String string : stringList){
        String [] array= string.split(",");
        TypeOfCustomer typeOfCustomer = new TypeOfCustomer(array[0],array[1]);
        typeOfCustomers.add(typeOfCustomer);
    }
    return typeOfCustomers;
}
    public static Map<Customer,Integer> getCustomerMap(String path){
        List<String> stringList = ReadCSVToString(path);
        Map<Customer,Integer> customerMap = new LinkedHashMap<>();
        for(String string : stringList){
            String[] arrayString = string.split(",");
            if(arrayString[0].equals("VietnameseCustomer")){
                Customer customer = new VietnameseCustomer(arrayString[1],arrayString[2],arrayString[3],Integer.parseInt(arrayString[4]));
                customerMap.put(customer,Integer.parseInt(arrayString[5]));
            }
            if(arrayString[0].equals("ForeignerCustomer")){
                Customer customer = new ForeignerCustomer(arrayString[1],arrayString[2],arrayString[3]);
                customerMap.put(customer,Integer.parseInt(arrayString[4]));
            }
        }
        return customerMap;
    }
    public static List<Bill> getBillList(String path) {
        List<String > stringList =ReadCSVToString(path);
        List<Bill> billList = new ArrayList<>();
        for(String string : stringList){
            String [] array= string.split(",");
            Bill bill = new Bill (array[0],array[1],array[2],
                    Integer.parseInt(array[3]),array[4],Integer.parseInt(array[5]));
            billList.add(bill);
        }
        return billList;
    }
//    Ham doc bang list:
//    public static List<Customer> getListCustomer(String path){
//        List<String> stringList = readFromCSV(path);
//        List<Customer> customerList = new ArrayList<>();
//        for(String string:stringList){
//            String[] array = string.split(",");
//            if(array[0].equals("Country")){
//                CountryCustomer customer = new CountryCustomer(array[1],array[2],array[3],array[4]);
//                customerList.add(customer);
//            }
//            if(array[0].equals("Other")){
//                OtherCustomer customer=new OtherCustomer(array[1],array[2],array[3]);
//                customerList.add(customer);
//            }
//        }
//        return customerList;
//    }

}

