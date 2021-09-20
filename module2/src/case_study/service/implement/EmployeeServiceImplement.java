package case_study.service.implement;

import case_study.models.Employee;
import case_study.service.IEmployee;
import case_study.utils.ReadAndWrite;

import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImplement implements IEmployee {
    String employeeFilePath = "src\\case_study\\data\\employee.csv";

    @Override
    public void addService() {
        List<Employee> employeeList = ReadAndWrite.getListEmployee(employeeFilePath);
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        String idEmployee = "";
        try {
            while (flag) {
                System.out.println("Enter employee's ID: ");
                idEmployee = sc.nextLine();
                flag = false;
                for (int i = 0; i < employeeList.size(); i++) {
                    if (employeeList.get(i).getIdEmployee().equals(idEmployee)) {
                        System.out.println("Employee ID is exist! \n Enter again: ");
                        flag = true;
                        break;
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            System.out.println("Enter employee's full name: ");
            String fullName = sc.nextLine();
            System.out.println("Enter employee's birthday: ");
            String dayOfBirth = sc.nextLine();
            System.out.println("Enter employee's id card: ");
            String idCard = sc.nextLine();
            System.out.println("Enter employee's gender: \n 1. Male \n 2. Female \n 3. Other");
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
            System.out.println("Enter employee's phone number: ");
            String phoneNumber = sc.nextLine();
            System.out.println("Enter employee's email: ");
            String email = sc.nextLine();
            System.out.println("Enter employee's level of education: ");
            String levelEducation = sc.nextLine();
            System.out.println("Enter employee's title of position: ");
            String titlePosition = sc.nextLine();
            System.out.println("Enter employee's salary: ");
            double salary = Double.parseDouble(sc.nextLine());
            employeeList.add(new Employee(fullName, dayOfBirth, idCard, gender, phoneNumber, email, idEmployee, levelEducation, titlePosition, salary));
            System.out.println("You have done added new employee!");
            ReadAndWrite.WriteStringEmployeeToCSV(employeeList, employeeFilePath, false);
            displayService();
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void displayService() {
        List<Employee> employeeList = ReadAndWrite.getListEmployee(employeeFilePath);
        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i) != null) {
                System.out.println(i + 1 + ". " + employeeList.get(i).toString());
            }
        }
    }

    @Override
    public void editService() {
        displayService();
        Scanner sc = new Scanner(System.in);
        List<Employee> employeeList = ReadAndWrite.getListEmployee(employeeFilePath);
        try {
            System.out.println("Please enter number to edit: ");
            String idEmployeeEdit = sc.nextLine();
            for (int i = 0; i < employeeList.size(); i++) {
                if (employeeList.get(i).getIdEmployee().equals(idEmployeeEdit)) {
                    System.out.println("Please choose one of these options: \n 1. Edit employee's full name. \n 2. Edit employee's day of birth. \n 3. Edit employee's gender. \n 4. Edit employee's ID card. \n 5. Edit employee's phone number \n 6. Edit employee's email \n 7. Edit employee's level of education \n 8. Edit employee's position \n 0. Return  ");
                    int choice = Integer.parseInt(sc.nextLine());
                    switch (choice) {
                        case 1:
                            System.out.println("Enter new full name: ");
                            String fullName = sc.nextLine();
                            employeeList.get(i).setFullName(fullName);
                            ReadAndWrite.WriteStringEmployeeToCSV(employeeList, employeeFilePath, false);
                            break;
                        case 2:
                            System.out.println("Enter new day of birth: ");
                            String dayOfBirth = sc.nextLine();
                            employeeList.get(i).setDayOfBirth(dayOfBirth);
                            ReadAndWrite.WriteStringEmployeeToCSV(employeeList, employeeFilePath, false);
                            break;
                        case 3:
                            System.out.println("Please choose one of these options: \n 1. Male \n 2. Female \n 3. Other");
                            String gender = "";
                            int choiceOfGender = Integer.parseInt(sc.nextLine());
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
                                    throw new IllegalStateException("Unexpected value: " + choiceOfGender);
                            }
                            employeeList.get(i).setGender(gender);
                            ReadAndWrite.WriteStringEmployeeToCSV(employeeList, employeeFilePath, false);
                            break;
                        case 4:
                            System.out.println("Enter new ID card: ");
                            String idCard = sc.nextLine();
                            employeeList.get(i).setId(idCard);
                            ReadAndWrite.WriteStringEmployeeToCSV(employeeList, employeeFilePath, false);
                            break;
                        case 5:
                            System.out.println("Enter new phone number: ");
                            String phoneNumber = sc.nextLine();
                            employeeList.get(i).setPhoneNumber(phoneNumber);
                            ReadAndWrite.WriteStringEmployeeToCSV(employeeList, employeeFilePath, false);
                            break;
                        case 6:
                            System.out.println("Enter new email: ");
                            String email = sc.nextLine();
                            employeeList.get(i).setEmail(email);
                            ReadAndWrite.WriteStringEmployeeToCSV(employeeList, employeeFilePath, false);
                            break;
                        case 7:
                            System.out.println("Enter new level of education: ");
                            String educationLevel = sc.nextLine();
                            employeeList.get(i).setLevelOfEducation(educationLevel);
                            ReadAndWrite.WriteStringEmployeeToCSV(employeeList, employeeFilePath, false);
                            break;
                        case 8:
                            System.out.println("Enter new position: ");
                            String position = sc.nextLine();
                            employeeList.get(i).setTitleOfPosition(position);
                            ReadAndWrite.WriteStringEmployeeToCSV(employeeList, employeeFilePath, false);
                            break;
                        case 0:
                            break;

                    }
                }
            }
        } catch (NumberFormatException e) {
            e.printStackTrace();
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }
    }
}
