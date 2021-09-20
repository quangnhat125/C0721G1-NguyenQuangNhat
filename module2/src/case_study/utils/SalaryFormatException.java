package case_study.utils;

public class SalaryFormatException extends Exception{
    String errorMessage;
    public SalaryFormatException(String message){
        super(message);
    }
    public String getString() {
        return this.errorMessage;
    }
}
