package Multithreading;

/*
WRITE A PROGRAM OF 3THREAD OBJECTS USING Runnable INTERFACE.
	TRY TO ACCESS ALL THE METHODS OF Thread CLASS.
 */

public class RunnableInterfaceDemo implements Runnable {

    public static void main(String[] args) throws InterruptedException {

        //Getting current thread name

        System.out.println("Current thread : "+Thread.currentThread().getName());

        // Creating thread objects

        RunnableInterfaceDemo obj_r1=new RunnableInterfaceDemo();
        Thread t1=new Thread(obj_r1);

        RunnableInterfaceDemo obj_r2=new RunnableInterfaceDemo();
        Thread t2=new Thread(obj_r2);

        RunnableInterfaceDemo obj_r3=new RunnableInterfaceDemo();
        Thread t3=new Thread(obj_r3);

    // start

        t1.start();
        t2.start();
        t3.start();

    // Alive or not

        System.out.println("t1:"+ t1.isAlive());
        System.out.println("t2:"+ t2.isAlive());
        System.out.println("t3:"+ t3.isAlive());

    // set name for threads

        t1.setName("Abc thread");
        t2.setName("Pqr thread");
        t3.setName("Xyz thread");

    }

    @Override
    public void run() {

        // Get current running thread name

            System.out.println("Run by " + Thread.currentThread().getName());

            // suspension of thread
            try {
                Thread.sleep(100);
            }

            catch (InterruptedException ex) {
                ex.printStackTrace();
            }

            // State of thread

        System.out.println("Thread State of: "+ Thread.currentThread().getName()+
                " - "+Thread.currentThread().getState());
        System.out.println("Exit of Thread: " + Thread.currentThread().getName());

    }
}

/*
OUTPUT:::::

Current thread : main
t1:true
t2:true
t3:true
Run by Thread-2
Run by Thread-1
Run by Thread-0
Thread State of: Abc thread - RUNNABLE
Exit of Thread: Abc thread
Thread State of: Xyz thread - RUNNABLE
Exit of Thread: Xyz thread
Thread State of: Pqr thread - RUNNABLE
Exit of Thread: Pqr thread

 */
