package _bai_tap_them._ngay_13_thang_9;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateName {
    private static Pattern pattern;

    private static final String NAME_REGEX = "^[][0-9]{4,}+[G-M]$";
    public ValidateName() {
    }
    public boolean validateName(String regex) {
        Pattern pattern = Pattern.compile(NAME_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }

}
