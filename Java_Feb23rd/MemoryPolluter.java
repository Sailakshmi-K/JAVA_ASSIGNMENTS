package Java_Feb23rd;

class MemoryPolluter {

    static final int MEGABYTE_IN_BYTES = 1024 * 1024;
    static final int ITERATION_COUNT = 1024 * 10;

    public static void main(String[] args) {
        System.out.println("Starting pollution");

        for (int i = 0; i < ITERATION_COUNT; i++) {
            byte[] array = new byte[MEGABYTE_IN_BYTES];
        }

        System.out.println("Terminating");
    }
}

/*
OUTPUT :

-XX:+UnlockExperimentalVMOptions -XX:+UseEpsilonGC  -Xmx4g

*************** Memory 4 gigabytes **************8
 It is not sufficient so it returns heapoutof memory like..

[0.018s][warning][gc,init] Consider setting -Xms equal to -Xmx to avoid resizing hiccups
[0.018s][warning][gc,init] Consider enabling -XX:+AlwaysPreTouch to avoid memory commit hiccups
Starting pollution
Terminating due to java.lang.OutOfMemoryError: Java heap space

Process finished with exit code 3

********Memory 12 gigabytes***************8
-XX:+UnlockExperimentalVMOptions -XX:+UseEpsilonGC  -Xmx12g

[0.023s][warning][gc,init] Consider setting -Xms equal to -Xmx to avoid resizing hiccups
[0.023s][warning][gc,init] Consider enabling -XX:+AlwaysPreTouch to avoid memory commit hiccups
Starting pollution
Terminating

Process finished with exit code 0


 */