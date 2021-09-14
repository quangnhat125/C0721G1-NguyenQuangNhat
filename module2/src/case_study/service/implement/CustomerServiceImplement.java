package case_study.service.implement;

import case_study.models.Customer;
import case_study.models.Employee;
import case_study.service.ICustomer;
import case_study.utils.ReadAndWrite;

import java.util.List;
import java.util.Scanner;

public class CustomerServiceImplement implements ICustomer {
    String customerFilePath = "src\\case_study\\data\\customer.csv";
    @Override
    public void addService() {
        List<Customer> customerList = ReadAndWrite.getListCustomer(customerFilePath);
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        String customerCode = "";

        while (flag) {
            System.out.println("Enter customer's code: ");
            customerCode = sc.nextLine();
            flag = false;
            for (int i = 0; i < customerList.size(); i++) {
                if (customerList.get(i).getCustomerCode().equals(customerCode)) {
                    System.out.println("Customer code is exist! \n Enter again: ");
                    flag = true;
                    break;
                }
            }
        }
        System.out.println("Enter customer's full name: ");
        String fullName = sc.nextLine();
        System.out.println("Enter customer's birthday: ");
        String dayOfBirth = sc.nextLine();
        System.out.println("Enter customer's id card: ");
        String idCard = sc.nextLine();
        System.out.println("Enter customer's gender: \n 1. Male \n 2. Female \n 3. Other");
        int choiceOfGender = Integer.parseInt(sc.nextLine());
        String gender = "";
        switch (choiceOfGender) {
            case 1:
                gender = "Male";
                break;
            case 2:
                gender = "Female";
                break;
            case 3:
                gender = "Other";
                break;
            default:
                System.out.println("Customer's gender not found!");
        }
        System.out.println("Enter customer's phone number: ");
        String phoneNumber = sc.nextLine();
        System.out.println("Enter customer's email: ");
        String email = sc.nextLine();
        System.out.println("Enter customer's type: \n 1. Diamond \n 2. Platinum \n 3. Gold \n 4. Silver \n 5. Member ");
        int choiceOfType = Integer.parseInt(sc.nextLine());
        String typeCustomer = "";
        switch (choiceOfType) {
            case 1:
                typeCustomer = "Diamond";
                break;
            case 2:
                typeCustomer = "Platinum";
                break;
            case 3:
                typeCustomer = "Gold";
                break;
            case 4:
                typeCustomer = "Silver";
                break;
            case 5:
                typeCustomer = "Member";
                break;
            default:
                System.out.println("Customer's type not found!");
                break;
        }
        System.out.println("Enter customer's address: ");
        String customerAddress = sc.nextLine();
        customerList.add(new Customer(fullName, dayOfBirth, idCard, gender, phoneNumber, email, customerCode, typeCustomer, customerAddress ));
        System.out.println("You have done added new customer!");
        ReadAndWrite.WriteStringCustomerToCSV(customerList, customerFilePath, false);
        displayService();
    }


    @Override
    public void displayService() {
        List<Customer> customerList = ReadAndWrite.getListCustomer(customerFilePath);
        for (int i = 0; i < customerList.size(); i++) {
            if (customerList.get(i) != null) {
                System.out.println(i + 1 + ". " +customerList.get(i).getString());
            }
        }
    }

    @Override
    public void editService() {

    }
}
