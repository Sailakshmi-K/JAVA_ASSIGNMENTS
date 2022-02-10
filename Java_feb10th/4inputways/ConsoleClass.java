package JavaInputTypes;

import java.io.Console;

public class ConsoleClass {

    Console c=System.console();

    int id;
    String name;
    float salary;

    public void acceptDetails() {

        if (c == null) {
            System.out.println("Console not supported .");
            System.exit(1);
        }

        else {
            id = Integer.parseInt(c.readLine("Enter employee id : "));
            name = c.readLine("Enter employee name : ");
            salary = Float.parseFloat(c.readLine("Enter employee salary : "));
        }
    }

    public void displayDetails(){
        c.format("Employee id : %s  Employee name : %s  Employee salary %s ",id,name,salary);

    }

    public static void main(String[] args) {

        ConsoleClass obj_c=new ConsoleClass();

        obj_c.acceptDetails();
        obj_c.displayDetails();

    }
}
/*
OUTPUT WHEN PROGRAM EXECUTED IN IDE ::::::::

Console not supported .

ACTUAL OUTPUT :::::::::

Enter employee id : 1
Enter employee name : Sailakshmi
Enter employee salary : 45000

Employee id : 1  Employee name : Sailakshmi  Employee salary 45000.00

 */
