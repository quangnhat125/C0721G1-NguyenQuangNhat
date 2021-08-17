package _02_Loop_In_Java.Bai_Tap;

public class BaiTap3 {
    public static void main(String[] args) {
        int N = 2;
        while (N < 100) {
            int i = 2;
            boolean check = true;
            while (i <= Math.sqrt(N)) {
                if (N % i == 0) {
                    check = false;
                    break;
                }
                i++;
            }
            if (check) {
                System.out.println(N);
            }
            N++;
            }
        }
}
