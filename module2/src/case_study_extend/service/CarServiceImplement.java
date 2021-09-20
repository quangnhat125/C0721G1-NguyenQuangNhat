package case_study_extend.service;

import case_study_extend.models.Car;
import case_study_extend.models.CompanyName;
import case_study_extend.ultils.ReadFile;
import case_study_extend.ultils.Validate;
import case_study_extend.ultils.WriteFile;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class CarServiceImplement implements ITransportation {
    static String carFilePath = "src\\case_study_extend\\data\\Car.csv";
    static String companyFilePath = "src\\case_study_extend\\data\\company_name.csv";

    @Override
    public void add() {
        List<Car> carList = ReadFile.getListCar(carFilePath);
        Scanner sc = new Scanner(System.in);
        String licensePlate = "";
        boolean flag = true;
        while (flag) {
            do {
                try {
                    System.out.println("Enter license plate:");
                    licensePlate = sc.nextLine();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } while (!Validate.ValidateLicensePlateTruck(licensePlate));
            flag = false;
            for (Car car : carList) {
                if (car.getLicensePlate().equals(licensePlate)) {
                    System.out.println("Da bi trung!");
                    flag = true;
                    break;
                }
            }
        }

        List<CompanyName> companyNameList = ReadFile.getListCompany(companyFilePath);
        boolean flag1 = true;
        String iputCompanyName= "";
        while (flag1) {
            for (CompanyName companyName : companyNameList) {
                System.out.println(companyName.getCompanyName());
            }
            System.out.println("Enter company name: ");
            iputCompanyName = sc.nextLine();
            for (CompanyName companyName : companyNameList) {
                if (companyName.getCompanyName().equals(iputCompanyName)) {
                    flag1 = false;
                    break;
                }
            }
        }
            System.out.println("Enter year of manufacture: ");
            int yearOfCar = Integer.parseInt(sc.nextLine());
            System.out.println("Enter car owner:");
            String carOwner = sc.nextLine();
            System.out.println("Enter number of seats:");
            int numberOfSeat = Integer.parseInt(sc.nextLine());
            System.out.println("Enter type of car: ");
            String typeCar = sc.nextLine();
            Car car = new Car(licensePlate, iputCompanyName, yearOfCar, carOwner, numberOfSeat, typeCar);
            carList.add(car);
            WriteFile.WriteStringCarToCSV(carList, carFilePath, false);


        }



    @Override
    public void edit() {

    }

    @Override
    public void delete() {

    }
}

//    private String autoAdd(String path) {
//        List<Car> carList = ReadFile.getListCar(path);
//        List<String> stringList = new ArrayList<>();
//        for (Car car : carList) {
//            stringList.add(car.getLicensePlate());
//        }
//        String string = "";
//        Collections.sort(stringList);
////        43C-001,43C-002,43C-003
//        for (int i =0; i < stringList.size(); i++) {
//            String[] array = stringList.get(i).split("-");
//            String[] array1 = stringList.get(i + 1).split("-");
//            if (Integer.parseInt(array1[1]) - Integer.parseInt(array[1]) > 1) {
//                int temp = Integer.parseInt(array[1]) + 1;
//                string = "43C-" + temp;
//                return string;
//            }
//            }
//        String[] array2 = stringList.get(stringList.size() - 1).split("-");
//        int temp = Integer.parseInt(array2[1]) + 1;
//        string = "43C-" + temp;
//        return string;
//// if (){
////        stringlist.get(string.getsize() - 1) + 1;
//    }
//}

