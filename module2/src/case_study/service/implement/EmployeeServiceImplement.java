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
        String idEmployee ="";

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
    }
    @Override
    public void displayService() {
        List<Employee> employeeList = ReadAndWrite.getListEmployee(employeeFilePath);
        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i) != null) {
                System.out.println(i + 1 + ". " +employeeList.get(i).toString());
            }
        }
    }

    @Override
    public void editService() {

    }
}
