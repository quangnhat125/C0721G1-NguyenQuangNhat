package case_study.utils;

public class DateFormatException extends Exception {
    String errorMessage;

    public DateFormatException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return this.errorMessage;
    }
}
