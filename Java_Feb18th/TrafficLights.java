package Java_Feb18th;

enum COLORS{
    RED("STOP"),
    GREEN("GO"),
    YELLOW("DRIVE VERY SLOW");

    public String color;
    COLORS(String i) {
        this.color=i;
    }
}

public class TrafficLights {
    public static void main(String[] args) {
        for(COLORS c:COLORS.values()){
            System.out.println(c+" means "+c.color);
        }
    }
}

/*
RED means STOP
GREEN means GO
YELLOW means DRIVE VERY SLOW

Process finished with exit code 0
*/
