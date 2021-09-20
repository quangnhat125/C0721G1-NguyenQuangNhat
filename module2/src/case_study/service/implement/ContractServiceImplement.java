package case_study.service.implement;

import case_study.models.Booking;
import case_study.models.Contract;
import case_study.service.IContract;
import case_study.utils.ReadAndWrite;

import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class ContractServiceImplement implements IContract {
    static String bookingQueueFilePath = "src\\case_study\\data\\bookingqueue.csv";
    static String contractListPath = "src\\case_study\\data\\contract.csv";

    @Override
    public void addService() {
        Scanner sc = new Scanner(System.in);
        Queue<Booking> bookingQueue = ReadAndWrite.getBookingQueue(bookingQueueFilePath);
        List<Contract> contractList = ReadAndWrite.getContractList(contractListPath);
        System.out.println("This is the first contract: " + bookingQueue.peek());
        String bookingID = bookingQueue.peek().getIdBooking();
        String customerID = bookingQueue.peek().getIdCustomer();
        bookingQueue.remove();
        ReadAndWrite.WriteBookingTreeSetToQueue(bookingQueue, bookingQueueFilePath, false);
        String contractId = "";
        boolean flag = true;
        while (flag) {
            try {
                System.out.println("Enter contract's ID");
                contractId = sc.nextLine();
                flag = false;
            } catch (Exception e) {
                e.printStackTrace();
            }
            for (Contract contract : contractList) {
                if (contract.getIdContract().equals(contractId)) {
                    System.out.println("The contract ID is exist! \n Please enter again");
                }
            }
        }
        try {
            System.out.println("Enter amount of deposit: ");
            double amountOfDeposit = Double.parseDouble(sc.nextLine());
            System.out.println("Enter total pay: ");
            double totalPay = Double.parseDouble(sc.nextLine());
            Contract contract = new Contract(contractId, bookingID, amountOfDeposit, totalPay, customerID);
            contractList.add(contract);
            ReadAndWrite.WriteContractStringToCSV(contractList, contractListPath, false);
            displayService();
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }


    }


    @Override
    public void displayService() {
        List<Contract> contractList = ReadAndWrite.getContractList(contractListPath);
        for (int i = 0; i < contractList.size(); i++) {
            System.out.println(i + 1 + "." + contractList.get(i));
        }

    }

    @Override
    public void editService() {
        List<Contract> contractList = ReadAndWrite.getContractList(contractListPath);
        Scanner sc = new Scanner(System.in);
        displayService();
        try {
            System.out.println("Please enter contract's ID to edit: ");
            String contractIDEdit = sc.nextLine();
            for (int i = 0; i < contractList.size(); i++) {
                if (contractList.get(i).getIdContract().equals(contractIDEdit)) {
                    System.out.println("Please choose one of these options: \n 1. Edit amount of deposit \n 2. Edit total pay \n 3. Edit customer's ID \n 0. Return");
                    int choice = Integer.parseInt(sc.nextLine());
                    switch (choice) {
                        case 1:
                            System.out.println("Enter new amount of deposit: ");
                            Double amountOfDeposit = Double.parseDouble(sc.nextLine());
                            contractList.get(i).setAmountOfDeposit(amountOfDeposit);
                            ReadAndWrite.WriteContractStringToCSV(contractList, contractListPath, false);
                            break;
                        case 2:
                            System.out.println("Enter new total pay: ");
                            Double totalPay = Double.parseDouble(sc.nextLine());
                            contractList.get(i).setTotalPay(totalPay);
                            ReadAndWrite.WriteContractStringToCSV(contractList, contractListPath, false);
                            break;
                        case 3:
                            System.out.println("Enter new customer's ID: ");
                            String customerID = sc.nextLine();
                            contractList.get(i).setIdCustomer(customerID);
                            ReadAndWrite.WriteContractStringToCSV(contractList, contractListPath, false);
                            break;
                        case 0:
                            break;

                    }
                    System.out.println("List after updated: ");
                    displayService();
                } else {
                    System.out.println("Cannot find the customer's code for editting! \n Please enter again ");
                }
            }
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }
}

