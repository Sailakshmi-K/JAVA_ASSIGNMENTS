package JavaInputTypes;

import java.io.Console;
public class ConsoleMethodsDemo {
    public static void main(String[] args) {
        Console c=System.console();
        System.out.println("Enter name : ");
        String name=c.readLine();
        String address=c.readLine("Adresss : ");// with string format text
        char pwd[]=c.readPassword();
        String upwd=new String(pwd);

        if(name.equalsIgnoreCase("Sai") && upwd.equalsIgnoreCase("AP")){
            c.format("%s ,Welcome .... from coditas and your address : %s",name,address);
        }
        else
            System.out.println("Sorry!!! password does not match :( ");
    }
}
/*
OUTPUT:::::::::::::
Enter name :
Sai
Address : Andhra Pradesh

Sai ,Welcome .... from coditas and your address : Andhra Pradesh


 */