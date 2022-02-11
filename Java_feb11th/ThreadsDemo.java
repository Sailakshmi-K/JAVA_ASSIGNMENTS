package Multithreading;

/*
WHAT IF WE RESTART ANY THREAD?
		=>t1.start();
		=>t1.start();
 */

public class ThreadsDemo  extends Thread{

    int c=1;

    public static void main(String[] args) {

        ThreadsDemo obj_t=new ThreadsDemo();

        obj_t.start();
        obj_t.start();

    }

    @Override
    public void run() {

        System.out.println("run by :"+Thread.currentThread().getName());

    }
}


/*
OUTPUT::::::

Exception in thread "main" java.lang.IllegalThreadStateException
	at java.lang.Thread.start(Thread.java:708)
	at Multithreading.ThreadsDemo.main(ThreadsDemo.java:19)
run by :Thread-0 count : 1

Reason :

Once a thread started, it cannot be started again.
If it is started again , it throws IllegalThreadStateException
Thread runs only one time and for 2nd time it  throws exception.

 */
