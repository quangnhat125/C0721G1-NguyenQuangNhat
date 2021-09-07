package _15_exception_and_debug.bai_tap;

import java.util.Scanner;

public class IllegalTriangleException extends Exception {
  public IllegalTriangleException(String message){
      super(message);
  }
  @Override
    public String getMessage(){
      return "Nhập sai giá trị các cạnh của tam giác: " + super.getMessage();
  }
}
