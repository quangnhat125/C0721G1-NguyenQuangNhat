package _17_iotextfile.bai_tap.bai_tap_2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

//public class ReadFileCSV {
////    public static void main(String[] args) {
////        try {
////            File file = new File("src\\_17_iotextfile\\bai_tap\\bai_tap_2\\countries");
////            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
////            String line = "";
////            while ((line = bufferedReader.readLine()) != null) {
////                String[] temp = line.split(",");
////                System.out.println(temp);
////
////            }
////        } catch (FileNotFoundException e) {
////            e.printStackTrace();
////        } catch (IOException e) {
////            e.printStackTrace();
////        }
////    }
//    public static void main(String[] args) {
//        try {
//
//            File file = new File("src\\_17_iotextfile\\bai_tap\\bai_tap_2\\countries");
//            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
//            String line = "";
//
//            while ((line = bufferedReader.readLine()) != null){
//                System.out.println(line);
//            }
//
//        }catch (Exception e){
//            System.err.println("Fie không tồn tại or nội dung có lỗi!");
//        }
//    }
//}
 class Main {
    public static void main(String[] args) {

        BufferedReader br = null;
        try {
            String line;
            br = new BufferedReader(new FileReader("src\\_17_iotextfile\\bai_tap\\bai_tap_2\\countries.csv"));

            while ((line = br.readLine()) != null) {
                printCountry(parseCsvLine(line));
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null)
                    br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static List<String> parseCsvLine(String csvLine) {
        List<String> result = new ArrayList<>();
        if (csvLine != null) {
            String[] splitData = csvLine.split(",");
            for (int i = 0; i < splitData.length; i++) {
                result.add(splitData[i]);
            }
        }
        return result;
    }

    private static void printCountry(List<String> country) {
        System.out.println(
                "Country [id= "
                        + country.get(0)
                        + ", code= " + country.get(1)
                        + " , name=" + country.get(2)
                        + "]");
    }
}

