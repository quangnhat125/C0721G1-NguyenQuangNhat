package _11_dsa_stack_queue.thuc_hanh;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;
import java.util.LinkedList;

public class PalindromeQueue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào một chuỗi bất kì: ");
        String palindrome = sc.nextLine();
        Queue myQueue = new LinkedList<>();
        for (int i = palindrome.length() -1 ; i >= 0; i-- ) {
            myQueue.add(palindrome.charAt(i));
        }
        String reversePalindrome = "";
        while (!myQueue.isEmpty()){
            reversePalindrome += myQueue.remove();
        }
        if (palindrome.equals(reversePalindrome)) {
            System.out.println("Đây là chuỗi Palindrome!");
        } else {
            System.out.println("Không là chuỗi Palindrome!");
        }
    }
}
