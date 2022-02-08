package Exceptions;
public class InvalidAmountException extends RuntimeException{
    InvalidAmountException(String msg){
        System.out.println(msg);
    }
}
