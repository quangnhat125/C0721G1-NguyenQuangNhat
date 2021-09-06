//package bai_lam_them_fix_bug;
//
//import java.util.Stack;​
//public class FixBugTuan3 {
//    public static void main(String[] args) {
//        Stack<Integer> stack = new Stack<>();
//        int num = 0;
//        int count = 0;
//        while (count < 20) {
//            boolean flag = true;
//            if (num < 2) {
//                flag = false;
//                break;
//            } else {
//                for (int i = 2; i < num; i++) {
//                    if (num % i == 0) {
//                        flag = false;
//                        break;
//                    }
//                }
//                if (!flag) {
//                    stack.push(num);
//                    count++;
//                }
//            }
//            num++;
//        }
//        for (int i = 0; i < stack.size(); i++) {
//            System.out.println(stack.peek());
//            stack.pop();
//        }
//    }
//}