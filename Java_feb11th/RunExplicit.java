package Multithreading;

public class RunExplicit  extends Thread{
    @Override
    public void run() {
        System.out.println("run by :"+Thread.currentThread().getName());
    }

    public static void main(String[] args) {

        RunExplicit obj_r1=new RunExplicit();
        RunExplicit obj_r2=new RunExplicit();

        obj_r1.run();
        obj_r2.run();
    }
}
/*
run by :main
run by :main

Process finished with exit code 0

Reason :::

If we explicitly call run() without start() ,it will just act as normal method.
No multithreading happens.
So,in output we get only main thread as executing the run() method

 */
