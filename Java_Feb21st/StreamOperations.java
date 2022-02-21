package Jdk8;

import java.util.ArrayList;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamOperations {
    public static void main(String[] args) {
        ArrayList<Integer> al=new ArrayList<>();

        for(int i=1;i<=10;i++){
            al.add(i);
        }
        System.out.println("*****Filtering*****");
        Stream<Integer> s=al.stream().filter(i -> i % 2 == 0);
        s.forEach(i -> System.out.print(i+" "));

        System.out.println("\n********MAPPING***********");
        Stream<Integer> s1=al.stream().map(x -> x+10);
        s1.forEach(x -> System.out.print(x+" "));

        System.out.println("\n**********REDUCING*********");
        Integer sum=al.stream().reduce(0,(a, b) ->(a+b));
        System.out.println("sum : "+sum);

        System.out.println("***********COLLECTION***********");
        Stream<Integer> s2=al.stream();
        ArrayList<Integer> al1= (ArrayList<Integer>) s2.collect(Collectors.toList());
        System.out.println("Stream to Collection : "+al1);

    }
}

/*
*****Filtering*****
2 4 6 8 10
********MAPPING***********
11 12 13 14 15 16 17 18 19 20
**********REDUCING*********
sum : 55
***********COLLECTION***********
Stream to Collection : [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

Process finished with exit code 0
 */