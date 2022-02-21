package Jdk8;

class Notify extends Thread{
    @Override
    public void run() {
        synchronized (this){
            for(int i=0;i<5;i++){
                System.out.println(i);
            }
            System.out.println("Sending notification ... by"+Thread.currentThread());
            this.notifyAll();
        }
    }
}
public class Object_Wait_NotifyAll{

    public static void main(String[] args) throws InterruptedException {
        Notify n=new Notify();
        n.start();
        synchronized (n) {
            n.wait(100);
            System.out.println("Notification received by main method .." + Thread.currentThread());
        }
    }
}

/*
0
1
2
3
4
Sending notification ... byThread[Thread-0,5,main]
Notification received by main method ..Thread[main,5,main]
 */