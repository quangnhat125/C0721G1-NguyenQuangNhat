package test_final.utils;

public class Validate {

    public static boolean validateDate(String date) {
        final String DATE_REGEX = "(([1-2]{1}+[\\d]{1})|(0+[1-9]{1})|(3+[0-1]))+(\\/)+((0+[1-9]{1})|(1+[0-2]{1}))+(\\/)+[\\d]{4}";
        if (date.matches(DATE_REGEX)) {
            return true;
        } else {
            System.err.println("Wrong format date (dd/mm/yyyy)!");
            return false;
        }
    }
    public static boolean validatePhoneNumber(String numberPhone) {
        final String PHONE_NUMBER_REGEX = "^(([0][9][0])|([0][9][1]))\\d{7}";
        if (numberPhone.matches(PHONE_NUMBER_REGEX)) {
            return true;
        } else {
            System.err.println("Please enter again, number of phone is 10-digit string ");
            return false;
        }
    }
    public static boolean validateName(String date) {
        final String DATE_REGEX = "([\\w]([\\s]*)){4,50}";
        if (date.matches(DATE_REGEX)) {
            return true;
        } else {
            System.err.println("Wrong format name!");
            return false;
        }
    }

}
