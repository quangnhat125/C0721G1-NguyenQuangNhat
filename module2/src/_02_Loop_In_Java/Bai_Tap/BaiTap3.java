package _02_Loop_In_Java.Bai_Tap;

public class BaiTap3 {
    public static void main(String[] args) {
        for (int i = 2; i < 100; i++) {
            int j;
            for (j = 2; j < i; j++) {
                if (i % j == 0) {
                    break;
                }
            }
            if (i == j) {
                System.out.print(j + " ");
            }
        }
    }
}
