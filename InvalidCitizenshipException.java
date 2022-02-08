package CustomExceptions;
//Unchecked/Runtime Exception
public class InvalidCitizenshipException extends RuntimeException{
    InvalidCitizenshipException(){
        System.out.println("Default Constructor==>InvalidCitizenshipException");
    }

    InvalidCitizenshipException(String msg){
        System.out.println("Parameter String:: Constructor==>"+msg);
    }

    InvalidCitizenshipException(Throwable cause){
        System.out.println("Parameter  Throwable:: Constructor==>InvalidCitizenshipException"+cause);
    }

    InvalidCitizenshipException(String msg,Throwable cause){
        System.out.println("Parameters String,Throwable:: Constructor==>InvalidCitizenshipException");
    }

}

