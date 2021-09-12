package _19_string_regex.bai_tap;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class ValidPhoneNumber {
    private static Pattern pattern;
    private static final String PHONE_NUMBER_REGEX = "^[(][0-9]{2}[)][-][(][0][0-9]{9}[)]$";

    public ValidPhoneNumber() {
    }

    public boolean validatePhoneNumber(String string) {
        Pattern pattern = Pattern.compile(PHONE_NUMBER_REGEX);
        Matcher matcher = pattern.matcher(string);
        return matcher.matches();
    }
}

class ValidPhoneNumberTest {
    public static void main(String[] args) {
        ValidPhoneNumber validPhoneNumber = new ValidPhoneNumber();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số điện thoại: ");
        String phoneNumber = sc.nextLine();
        boolean isValid = validPhoneNumber.validatePhoneNumber(phoneNumber);
        if (isValid) {
            System.out.println("Số điện thoại nhập vào hợp lệ!");
        } else {
            System.out.println("Số điện thoại không hợp lệ!");
        }
    }
}
