package bai_tap_final.utils;

import bai_tap_final.models.Bill;
import bai_tap_final.models.Customer;
import bai_tap_final.models.ForeignerCustomer;
import bai_tap_final.models.VietnameseCustomer;
import case_study_extend.models.Car;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class WriteFile {
    private static void Write(List<String> stringList, String path, boolean append) {
        File file = new File(path);
        try {
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (String line : stringList) {
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
//    public static void WriteStringCustomerToCSV(List<Customer> customerList, String path, boolean append) {
//        List<String> stringList = new ArrayList<>();
//        for (Customer customer : customerList) {
//            stringList.add(customer.getCustomerString());
//        }
//        Write(stringList, path, append);
//    }
//    public static void WriteStringVietnameseCustomerToCSV(List<VietnameseCustomer> vietnameseCustomerList, String path, boolean append) {
//        List<String> stringList = new ArrayList<>();
//        for (VietnameseCustomer vietnameseCustomer : vietnameseCustomerList) {
//            stringList.add(vietnameseCustomer.getVietnameseCustomerString());
//        }
//        Write(stringList, path, append);
//    }
//    public static void WriteStringForeignerCustomerToCSV(List<ForeignerCustomer> foreignerCustomerList, String path, boolean append) {
//        List<String> stringList = new ArrayList<>();
//        for (ForeignerCustomer foreignerCustomer : foreignerCustomerList) {
//            stringList.add(foreignerCustomer.getForeignerCustomerString());
//        }
//        Write(stringList, path, append);
//    }
//    public static void WriteStringBillToCSV(List<Bill> billList, String path, boolean append) {
//        List<String> stringList = new ArrayList<>();
//        for (Bill bill : billList) {
//            stringList.add(bill.getBillString());
//        }
//        Write(stringList, path, append);
//    }
public static void writeCustomerToCSV(Map<Customer, Integer> customerMap, String path ,boolean append) {
    List<String> stringList = new ArrayList<>();
    Set<Customer> customerSet = customerMap.keySet();
    for (Customer customer : customerSet) {
        if (customer instanceof VietnameseCustomer)
            stringList.add("Country" + "," + ((VietnameseCustomer) customer).getVietnameseCustomerString() + "," + customerMap.get(customer));
        if (customer instanceof ForeignerCustomer)
            stringList.add("Other" + "," + ((ForeignerCustomer) customer).getForeignerCustomerString() + "," + customerMap.get(customer));
    }
    Write(stringList, path, append);
}

    public static void writeBillToCSV(List<Bill> billList,String path, boolean append) {
        List<String> stringList = new ArrayList<>();
        for (Bill bill : billList) {
            stringList.add(bill.getBillString());
        }
        Write(stringList, path, append);
    }
//    Ham viet bang list:
//    public static void writeCustomerListToCSV(String path, List<Customer> customerList, boolean append) {
//        List<String> stringList = new ArrayList<>();
//        for (Customer customer : customerList) {
//            if (customer instanceof CountryCustomer) {
//                stringList.add("Country"+","+((CountryCustomer) customer).getCountryCustomerString() );
//            }
//            if(customer instanceof OtherCustomer){
//                stringList.add("Other"+","+(((OtherCustomer) customer).getOtherCustomerString()));
//            }
//            writeToFile(path, stringList, append);
//        }
//    }
}
