package _01_Introduction_To_Java.Bai_tap;

import java.util.Scanner;

public class BaiTap2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        int donVi = number % 10;
        int chuc = number / 10;
        String a = "";
        String b = "";
        if (number < 10) {
            switch (number) {
                case 1:
                    a = "One";
//                    System.out.print("One");
                    break;
                case 2:
                    a = "Two";
//                    System.out.print("Two");
                    break;
                case 3:
                    a = "Three";
//                    System.out.print("Three");
                    break;
                case 4:
                    a = "Four";
//                    System.out.print("Four");
                    break;
                case 5:
                    a = "Five";
//                    System.out.print("Five");
                    break;
                case 6:
                    a = "Six";
//                    System.out.print("Six");
                    break;
                case 7:
                    a = "Seven";
//                    System.out.print("Seven");
                    break;
                case 8:
                    a = "Eight";
//                    System.out.print("Eight");
                    break;
                case 9:
                    a = "Nine";
//                    System.out.print("Nine");
                    break;
            }
        }
            if (number <= 12) {
                switch (number) {
                    case 10:
                        a = "Ten";
//                        System.out.println("Ten");
                        break;
                    case 11:
                        a = "Eveven";
//                        System.out.println("Eleven");
                        break;
                    case 12:
                        a = "Twelve";
//                        System.out.println("Twelve");
                        break;
                }
            }
                if (number < 20) {
                    switch (donVi) {
                        case 3:
                            b = "Thirteen";
//                            System.out.println("Thirteen");
                            break;
                        case 4:
                            b = "Fourteen";
//                            System.out.println("Fourteen");
                            break;
                        case 5:
                            b = "Fifteen";
//                            System.out.println("Fifteen");
                            break;
                        case 6:
                            b = "Sixteen";
//                            System.out.println("Sixteen");
                            break;
                        case 7:
                            b = "Seventeen";
//                            System.out.println("Seventeen");
                            break;
                        case 8:
                            b = "Eighteen";
//                            System.out.println("Eighteen");
                            break;
                        case 9:
                            b = "Nineteen";
//                            System.out.println("Nineteen");
                            break;
                    }
                }
                if (number >= 20 && number < 100) {
                    switch (chuc) {
                        case 2:
                            System.out.println("Twenty");
                            break;
                        case 3:
                            System.out.println("Thirty");
                            break;
                        case 4:
                            System.out.println("Forty");
                            break;
                        case 5:
                            System.out.println("Fifty");
                            break;
                        case 6:
                            System.out.println("Sixty");
                            break;
                        case 7:
                            System.out.println("Seventy");
                            break;
                        case 8:
                            System.out.println("Eighty");
                            break;
                        case 9:
                            System.out.println("Ninety");
                            break;
                    }
                }
        System.out.println();

        }

    }

