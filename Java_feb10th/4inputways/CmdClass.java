package JavaInputTypes;

public class CmdClass {

    public void displayDetails(String[] args){
        System.out.println("Employee details as name, id, salary in sequence");
        System.out.println("Name : " + args[0]);
        System.out.println("Id : " + args[1]);
        System.out.println("Salary : " + args[2]);


    }
    public static void main(String[] args) {

       CmdClass obj_c=new CmdClass();

        obj_c.displayDetails(args);

    }
}
/*
Employee details as name, id, salary in sequence
Name : 1
Id : sai
Salary : 500000
 */
