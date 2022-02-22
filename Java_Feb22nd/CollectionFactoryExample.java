package JavaFeb22;

import java.util.*;

public class CollectionFactoryExample {

    public static void main(String[] args) {

        System.out.println("========LIST=========");
        List<Integer> l=List.of(1,2,3,4);
        for (Integer i:l) {
            System.out.print(i+" ");
        }
        System.out.println("\n=============SET=============");
        Set<String> s=Set.of("Lahari","Venkat","Parvathi","Sailakshmi");
        System.out.println(s);

        System.out.println("===============MAP==============");
        Map<Integer,String> m=Map.of(1,"Sai",2,"Pavan",3,"Madatala");
        for(Map.Entry<Integer,String> m1 :m.entrySet()){
            System.out.println(m1.getKey()+" "+m1.getValue());
        }

    }
}

/*

These Collection factory methods are immutable(Which cannot be changed within same memory)
When we try to add after declaration,these results a runtime exception.

========LIST=========
1 2 3 4
=============SET=============
[Lahari, Sailakshmi, Parvathi, Venkat]
===============MAP==============
3 Madatala
2 Pavan
1 Sai

Process finished with exit code 0
 */