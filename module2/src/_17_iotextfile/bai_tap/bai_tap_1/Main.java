package _17_iotextfile.bai_tap.bai_tap_1;

import java.io.BufferedReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào đường dẫn file ghi: ");
        String fileWrite = sc.nextLine();
        System.out.println("Nhập vào đường dẫn file đọc: ");
        String fileRead = sc.nextLine();

        String read = ReadAndWriteFile.readFile(fileRead);
        ReadAndWriteFile.writeFile(fileWrite, read);
    }
}
