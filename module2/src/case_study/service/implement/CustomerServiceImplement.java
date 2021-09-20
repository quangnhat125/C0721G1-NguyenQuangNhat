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
        try {
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
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
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
            customerList.add(new Customer(fullName, dayOfBirth, idCard, gender, phoneNumber, email, customerCode, typeCustomer, customerAddress));
            System.out.println("You have done added new customer!");
            ReadAndWrite.WriteStringCustomerToCSV(customerList, customerFilePath, false);
            displayService();
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void displayService() {
        List<Customer> customerList = ReadAndWrite.getListCustomer(customerFilePath);
        for (int i = 0; i < customerList.size(); i++) {
            if (customerList.get(i) != null) {
                System.out.println(i + 1 + ". " + customerList.get(i).toString());
            }
        }
    }

    @Override
    public void editService() {
        Scanner sc = new Scanner(System.in);
        displayService();
        try {
            List<Customer> customerList = ReadAndWrite.getListCustomer(customerFilePath);
            System.out.println("Please enter customer code to edit: ");
            String customerCodeEdit = sc.nextLine();
            for (int i = 0; i < customerList.size(); i++) {
                if (customerList.get(i).getCustomerCode().equals(customerCodeEdit)) {
                    System.out.println("Please choose one of these options: \n 1. Edit customer's full name \n 2. Edit customer's birthday \n 3. Edit customer's ID card \n 4. Edit customer's gender \n 5. Edit customer's phone number \n 6. Edit customer's email \n 7. Edit customer's type \n 8. Edit customer's address \n 0. Return");
                    int choice = Integer.parseInt(sc.nextLine());
                    switch (choice) {
                        case 1:
                            System.out.println("Enter new full name: ");
                            String fullName = sc.nextLine();
                            customerList.get(i).setFullName(fullName);
                            ReadAndWrite.WriteStringCustomerToCSV(customerList, customerFilePath, false);
                            break;
                        case 2:
                            System.out.println("Enter new birthday: ");
                            String birthday = sc.nextLine();
                            customerList.get(i).setDayOfBirth(birthday);
                            ReadAndWrite.WriteStringCustomerToCSV(customerList, customerFilePath, false);
                            break;
                        case 3:
                            System.out.println("Enter new ID card: ");
                            String idCard = sc.nextLine();
                            customerList.get(i).setId(idCard);
                            ReadAndWrite.WriteStringCustomerToCSV(customerList, customerFilePath, false);
                            break;
                        case 4:
                            System.out.println("Choose one of these options: \n 1. Male \n 2. Female \n 3. Other ");
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
                            }
                            customerList.get(i).setGender(gender);
                            ReadAndWrite.WriteStringCustomerToCSV(customerList, customerFilePath, false);
                            break;
                        case 5:
                            System.out.println("Enter new phone number: ");
                            String phoneNumber = sc.nextLine();
                            customerList.get(i).setPhoneNumber(phoneNumber);
                            ReadAndWrite.WriteStringCustomerToCSV(customerList, customerFilePath, false);
                            break;
                        case 6:
                            System.out.println("Enter new email: ");
                            String email = sc.nextLine();
                            customerList.get(i).setEmail(email);
                            ReadAndWrite.WriteStringCustomerToCSV(customerList, customerFilePath, false);
                            break;
                        case 7:
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
                            }
                            customerList.get(i).setTypeOfCustomer(typeCustomer);
                            ReadAndWrite.WriteStringCustomerToCSV(customerList, customerFilePath, false);
                            break;
                        case 8:
                            System.out.println("Enter new address: ");
                            String address = sc.nextLine();
                            customerList.get(i).setAddress(address);
                            ReadAndWrite.WriteStringCustomerToCSV(customerList, customerFilePath, false);
                            break;
                        case 0:
                            break;

                    }
                    System.out.println("List after updated: ");
                    displayService();
                } else {
                    System.out.println("Cannot find the customer's code for editing! \n Please enter again ");
                }
            }

        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }
}
