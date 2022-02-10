package JavaInputTypes;

import java.util.Scanner;

public class ScannerClass {

    int eid;
    float esal;
    String ename;

    Scanner cin=new Scanner(System.in);

    public void acceptDetails(){

        System.out.println("Enter employee id : ");
        eid=cin.nextInt();

        cin.nextLine();
        System.out.println("Enter employee name : ");
        ename=cin.nextLine();

        System.out.println("Enter Employee salary : ");
        esal=cin.nextFloat();
    }
    public void displayDetails(){

        System.out.println("Employee details :: \n" +
                "Employee id : "+eid+" Employee name : "+ename+" Employee salary : "+esal);
    }

    public static void main(String[] args) {

        ScannerClass obj_sc=new ScannerClass();

        obj_sc.acceptDetails();
        obj_sc.displayDetails();

    }
}

/*
Enter employee id :
1
Enter employee name :
sailakshmi
Enter Employee salary :
55000
Employee details ::
Employee id : 1 Employee name : sailakshmi Employee salary : 55000.0

Process finished with exit code 0

 */