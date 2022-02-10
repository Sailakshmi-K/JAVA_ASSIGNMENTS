package JavaInputTypes;
import java.util.Scanner;
public class ScannerAssignment {
    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);

        System.out.println("**************************CASE 1***************************");
        System.out.println("Enter name of student::");
        String name=cin.nextLine();
        System.out.println("Name is::"+name);

        System.out.println("Enter Id of student::");
        int id=cin.nextInt();
        System.out.println("Id are::"+id);

        System.out.println("Enter marks of student::");
        float percentage=cin.nextFloat();
        System.out.println("Marks are::"+percentage);


        System.out.println("*************************CASE 2***************************");
        System.out.println("Enter Id of student::");
        int id1=cin.nextInt();
        System.out.println("Id are::"+id1);

        System.out.println("Enter marks of student::");
        float percentage1=cin.nextFloat();
        System.out.println("Marks are::"+percentage1);

        cin.nextLine();

        System.out.println("Enter name of student::");
        String name1=cin.nextLine();
        System.out.println("Name is::"+name1);


    }
}
/*
OUTPUT::::::::

**************************CASE 1***************************
Enter name of student::
sailakshmi
Name is::sailakshmi
Enter Id of student::
1
Id are::1
Enter marks of student::
87
Marks are::87.0
*************************CASE 2***************************
Enter Id of student::
1
Id are::1
Enter marks of student::
87
Marks are::87.0
Enter name of student::
lahari
Name is::lahari

Process finished with exit code 0

 */
