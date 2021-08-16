package _01_Introduction_To_Java.Bai_tap;

import java.util.Scanner;

public class BaiTap2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        int donVi = number % 10;
        int chuc = number / 10;
        if (number < 10) {
            switch (number) {
                case 1:
                    System.out.print("One");
                    break;
                case 2:
                    System.out.print("Two");
                    break;
                case 3:
                    System.out.print("Three");
                    break;
                case 4:
                    System.out.print("Four");
                    break;
                case 5:
                    System.out.print("Five");
                    break;
                case 6:
                    System.out.print("Six");
                    break;
                case 7:
                    System.out.print("Seven");
                    break;
                case 8:
                    System.out.print("Eight");
                    break;
                case 9:
                    System.out.print("Nine");
                    break;
            }
        }
            if (number <= 12) {
                switch (number) {
                    case 10:
                        System.out.println("Ten");
                        break;
                    case 11:
                        System.out.println("Elevent");
                        break;
                    case 12:
                        System.out.println("Twelve");
                        break;
                }
            }
                if (number < 20) {
                    switch (donVi) {
                        case 3:
                            System.out.println("Thirdteen");
                            break;
                        case 4:
                            System.out.println("Fourteen");
                            break;
                        case 5:
                            System.out.println("Fifteen");
                            break;
                        case 6:
                            System.out.println("Sixteen");
                            break;
                        case 7:
                            System.out.println("Seventeen");
                            break;
                        case 8:
                            System.out.println("Eighteen");
                            break;
                        case 9:
                            System.out.println("Nineteen");
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
                            System.out.println("Fourty");
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

        }

    }

