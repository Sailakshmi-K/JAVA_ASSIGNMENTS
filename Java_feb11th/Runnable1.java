package Multithreading;

/*
USE THE RUNNABLE INTERFACE TO CONVERT THE FOLLOWING CLASS
INTO A THREAD.YOU WANT THE THREAD TO PRINT ALL THE ODD NUMBERS  U TO ITS BOUND
 */

import java.util.Scanner;

public class Runnable1 implements Runnable{

    Scanner cin=new Scanner(System.in);
    @Override
    public void run() {

        System.out.println("Enter range :");
        int n=cin.nextInt();

        System.out.println("Odd numbers upto "+n);

        for ( int i = 1 ; i <= n ; i++ ){

            if ( i % 2 != 0)
            System.out.print(i + "\t");

        }
    }

    public static void main(String[] args) {
        Runnable1 obj_r1=new Runnable1();
        Thread t1=new Thread(obj_r1);
        t1.start();
    }
}

/*
OUTPUT :::::::::

Enter range :
35
Odd numbers upto 35
1	3	5	7	9	11	13	15	17	19	21	23	25	27	29	31	33	35
Process finished with exit code 0

 */
