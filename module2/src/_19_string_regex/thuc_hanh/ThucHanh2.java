package _19_string_regex.thuc_hanh;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

 class AccountExample {

        private static final String EMAIL_REGEX = "^[_a-z0-9]{6,}$";

        public AccountExample() {
        }


        public boolean validate(String regex) {
            Pattern pattern = Pattern.compile(EMAIL_REGEX);
            Matcher matcher = pattern.matcher(regex);
            return matcher.matches();
        }
    }
class AccountExampleTest {

        private static AccountExample accountExample;

        public static final String[] validAccount = new String[] { "123abc_", "_abc123", "______", "123456","abcdefgh" };
        public static final String[] invalidAccount = new String[] { ".@", "12345", "1234_", "abcde" };

        public static void main(String args[]) {
            accountExample = new AccountExample();
            for (String account : validAccount) {
                boolean isvalid = accountExample.validate(account);
                System.out.println("Account is " + account +" is valid: "+ isvalid);
            }
            for (String account : invalidAccount) {
                boolean isvalid = accountExample.validate(account);
                System.out.println("Account is " + account +" is valid: "+ isvalid);
            }
        }
    }

