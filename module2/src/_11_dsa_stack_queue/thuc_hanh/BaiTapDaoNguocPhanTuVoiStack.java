package _11_dsa_stack_queue.thuc_hanh;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class BaiTapDaoNguocPhanTuVoiStack {
    public static void main(String[] args) {
        Stack<Integer> myStack = new Stack<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào kích thước của mảng mong muốn: ");
        int N = Integer.parseInt(sc.nextLine());
        int[] mangSoNguyen = new int[N];
        for (int i = 0; i < N; i++) {
            System.out.println("Nhập vào phần tử thứ " + i + "là: ");
            mangSoNguyen[i] = Integer.parseInt(sc.nextLine());
        }
        System.out.println(Arrays.toString(mangSoNguyen));
        for (int i =0; i < mangSoNguyen.length; i++) {
            myStack.push(mangSoNguyen[i]);
        }
        int[] mangDaoNguoc = new int[N];
        for ( int i = 0; i < N; i++ ) {
            mangDaoNguoc[i] = myStack.pop();
        }
        System.out.println(Arrays.toString(mangDaoNguoc));
    }
}

