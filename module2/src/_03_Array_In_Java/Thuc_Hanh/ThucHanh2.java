package _03_Array_In_Java.Thuc_Hanh;

import java.util.Scanner;

public class ThucHanh2 {
    public static void main(String[] args) {
        String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a name's student: ");
        String inputName = sc.nextLine();
        boolean isExist = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(inputName)) {
                System.out.println("Position of the students in the list " + inputName + " is: " + i);
                isExist = true;
                break;
            }
            }
            if (isExist) {
                System.out.println("Not found" + inputName + " in the list.");
        }
    }
}
