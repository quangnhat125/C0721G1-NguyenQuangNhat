package test_final.utils;

public class NotFoundStudentException extends Exception {
    String errorMessage;
    public NotFoundStudentException(String message){
        errorMessage = message;
    }

    public String getString() {
        return this.errorMessage;
    }
}
