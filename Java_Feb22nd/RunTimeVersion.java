package JavaFeb22;

public class RunTimeVersion {
    public static void main(String[] args){
        Runtime.Version rtv = Runtime.version();
        String version = String.valueOf(rtv.version());
        String minor=String.valueOf(rtv.minor());
        String major=String.valueOf(rtv.major());
        System.out.println("Minor version : "+minor);
        System.out.println("Major version : "+major);
        System.out.println("The current Version is "+version);
    }
}
/*
Minor version : 0
Major version : 17
The current Version is [17, 0, 2]

Process finished with exit code 0
 */