package Java_Feb23rd;

/**
 *    Optional class present in util package , it helps to reduce NULL checks in the program.
 *    ofNullable()-->It stores NULL
 *    isPresent()-->Returns true if element is not NULL otherwise False
 *    ifPresent()-->Executes the block if element present
 *    orElse()-->If element is NULL , it takes another value instead of NULL
 */
import java.util.Optional;

public class OptionalClassDemo {

    public static void main(String[] args) {

        String[] s=new String[4];
        String[] s1={"Sai","Lahari","Paru","Venkat",null};

        //ofNullable()
        Optional<String> op=Optional.ofNullable(s[2]);
        Optional<String> op1=Optional.of(s1[3]);
        Optional<String>op2=Optional.ofNullable(s1[4]);

        // isPresent()
        if(op.isPresent()){
            System.out.println(s[2]);
        }
        else{
            System.out.println("s[2] is NULL");
        }

        //ifPresent()
        op1.ifPresent(x-> System.out.println(x));

        //orElse()
        System.out.println(op2.orElse("Default"));


    }
}
/*
s[2] is NULL
Venkat
Default

Process finished with exit code 0
 */
