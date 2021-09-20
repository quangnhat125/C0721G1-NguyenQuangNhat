package case_study.utils;

public class IDNotFoundException extends Exception {
    String errorMessage;
    public IDNotFoundException(String message){
        super(message);
    }
    @Override
    public String getMessage(){
        return "Wrong format: " + super.getMessage();
    }
}
