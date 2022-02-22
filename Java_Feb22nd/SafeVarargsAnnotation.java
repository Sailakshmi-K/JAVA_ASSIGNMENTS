package JavaFeb22;

/**
 * @SafeVarargs annotation is applied to final methods,constructors and static methods until java 7
 * From java 9 , it is applicable for private methods as well.
 */

import java.util.List;
import java.util.ArrayList;

public class SafeVarargsAnnotation {

    @SafeVarargs
    private void display(List<String>...names){
        for(List<String> s:names){
            System.out.println(s);
        }
    }
    public static void main(String[] args) {

        List<String> s=new ArrayList<String>();

        s.add("Lahari");
        s.add("Venkat");
        s.add("Parvathi");
        s.add("Sai");

        SafeVarargsAnnotation obj=new SafeVarargsAnnotation();
        obj.display(s);
    }
}
/*
[Lahari, Venkat, Parvathi, Sai]

Process finished with exit code 0

 */
