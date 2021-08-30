package _11_dsa_stack_queue.thuc_hanh;

import java.util.Scanner;
import java.util.Stack;

public class ChuyenDoiTuHeThapPhanSangNhiPhan {
    public static void main(String[] args) {
        Stack<Integer> myStack = new Stack<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào một số thập phân: ");
        int n = Integer.parseInt(sc.nextLine());
        int nhiPhan;
        while (n != 0) {
            nhiPhan = n % 2;
            myStack.push(nhiPhan);
            n /= 2;
        }
        System.out.println("Giá trị nhị phân là: " + myStack);
        while (!(myStack.isEmpty())) {
            System.out.print(myStack.pop());
        }

    }

}
