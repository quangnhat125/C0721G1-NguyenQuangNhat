package case_study_extend.ultils;

import case_study.models.Employee;
import case_study_extend.models.Bike;
import case_study_extend.models.Car;
import case_study_extend.models.Truck;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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
    public static void WriteStringCarToCSV(List<Car> carList, String path, boolean append) {
        List<String> stringList = new ArrayList<>();
        for (Car car : carList) {
            stringList.add(car.getCarString());
        }
        Write(stringList, path, append);
    }
    public static void WriteStringTruckToCSV(List<Truck> truckList, String path, boolean append) {
        List<String> stringList = new ArrayList<>();
        for (Truck truck : truckList) {
            stringList.add(truck.getTruckString());
        }
        Write(stringList, path, append);
    }
    public static void WriteStringBikeToCSV(List<Bike> bikeList, String path, boolean append) {
        List<String> stringList = new ArrayList<>();
        for (Bike bike : bikeList) {
            stringList.add(bike.getBikeString());
        }
        Write(stringList, path, append);
    }

}
