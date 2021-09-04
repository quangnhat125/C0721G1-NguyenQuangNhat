package _13_searching_algorithms.bai_tap;

import java.util.LinkedList;
import java.util.Scanner;

public class BaiTap1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào một chuỗi bất kì: ");
        String string = sc.nextLine();
        LinkedList<Character> maxList = new LinkedList<>();

        for (int i =0; i < string.length(); i++ ){
            LinkedList<Character> normalList = new LinkedList<>();
            normalList.add(string.charAt(i));
            for(int j = i +1; j < string.length(); j++) {
                if (string.charAt(j) > normalList.getLast()) {
                    normalList.add(string.charAt(j));
                }
            }
            if (normalList.size() > maxList.size()) {
                maxList.clear();
                maxList.addAll(normalList);
            }
            normalList.clear();
        }
        for (Character ch : maxList) {
            System.out.println(ch);
        }
        System.out.println();
    }
}
