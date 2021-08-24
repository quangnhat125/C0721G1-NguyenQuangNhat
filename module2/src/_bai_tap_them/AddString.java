package _bai_tap_them;


import java.util.Scanner;

public class AddString {

    public static void main(String[] args) {
        String string;
        int count;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao chuoi bat ki: ");
        string = sc.nextLine();
        find(string);

    }

    public static int find(String string) {
        String[] array = new String[string.length()];
        for (int i = 0; i < string.length() - 1; i++) {
            for (int j = i + 1; j < string.length() - 1; j++) {
                if (string.charAt(i) == string.charAt(j) && string.charAt(i) != ' ' && string.charAt(j) != ' ') {
                  array[i] = String.valueOf(string.charAt(i));
                  for(int k = i; k >= 0; k--) {
                      array[i] = String.valueOf(string.charAt(i));
                  }
                }
            }
            System.out.println(array[i]);
        }
        return 1;
    }
}