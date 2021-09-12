package _19_string_regex.bai_tap;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class ValidateNameClass{
        private static Pattern pattern;

    private static final String CLASS_REGEX = "^[C,A,P][0-9]{4,}+[G-M]$";
    public ValidateNameClass() {
    }

    public boolean validateClass(String regex) {
        Pattern pattern = Pattern.compile(CLASS_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
class ValidateNameClassTest{
    public static void main(String[] args) {
    ValidateNameClass validateNameClass = new ValidateNameClass();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào tên lớp: ");
        String nameClass = sc.nextLine();
        boolean isValid = validateNameClass.validateClass(nameClass);
        if (isValid) {
            System.out.println("Tên lớp nhập vào đúng quy định!");
        } else {
            System.out.println("Tên lớp nhập sai quy định!");
        }
        
    }
}
