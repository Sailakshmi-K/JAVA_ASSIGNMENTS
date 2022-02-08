package Exceptions;

public class InsufficientBalanceException extends RuntimeException{
    InsufficientBalanceException(String msg){
        System.out.println("Caution !! ....");
    }
}
