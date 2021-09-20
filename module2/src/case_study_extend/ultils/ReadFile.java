package case_study_extend.ultils;

import case_study.models.Employee;
import case_study_extend.models.Bike;
import case_study_extend.models.Car;
import case_study_extend.models.CompanyName;
import case_study_extend.models.Truck;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

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
    public static List<Car> getListCar(String path) {
        List<String> stringList = ReadCSVToString(path);
        List<Car> carList = new ArrayList<>();
        for (int i = 0; i < stringList.size(); i++) {
            String[] array = stringList.get(i).split(",");
            Car car = new Car(array[0],array[1], Integer.parseInt(array[2]), array[3],Integer.parseInt(array[4]), array[5]);
            carList.add(car);
        }
        return carList;
    }
    public static List<Truck> getListTruck(String path) {
        List<String> stringList = ReadCSVToString(path);
        List<Truck> truckList = new ArrayList<>();
        for (int i = 0; i < stringList.size(); i++) {
            String[] array = stringList.get(i).split(",");
            Truck truck= new Truck(array[0],array[1], Integer.parseInt(array[2]), array[3],array[4]);
            truckList.add(truck);
        }
        return truckList;
    }
    public static List<Bike> getListBike(String path) {
        List<String> stringList = ReadCSVToString(path);
        List<Bike> bikeList = new ArrayList<>();
        for (int i = 0; i < stringList.size(); i++) {
            String[] array = stringList.get(i).split(",");
            Bike bike = new Bike(array[0],array[1], Integer.parseInt(array[2]), array[3],array[4]);
            bikeList.add(bike);
        }
        return bikeList;
    }
    public static List<CompanyName> getListCompany(String path) {
        List<String> stringList = ReadCSVToString(path);
        List<CompanyName> companyNameList = new ArrayList<>();
        for (int i = 0; i < stringList.size(); i++) {
            String[] array = stringList.get(i).split(",");
           CompanyName companyName = new CompanyName(array[0], array[1], array[2]);
            companyNameList.add(companyName);
        }
        return companyNameList;
    }
}
