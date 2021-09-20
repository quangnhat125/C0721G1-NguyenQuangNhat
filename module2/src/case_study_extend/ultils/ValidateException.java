package case_study_extend.ultils;

public class ValidateException extends Exception {
    public ValidateException(String message){
        super(message);
    }
    @Override
    public String getMessage(){
        return "Nhập sai giá trị: " + super.getMessage();
    }
}
