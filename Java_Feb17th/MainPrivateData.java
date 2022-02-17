package Reflections;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

class CatPrivate
{
    private String color;
}
public class MainPrivateData {

    public static void main(String[] args) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {

        CatPrivate d1=new CatPrivate();
        Class obj=d1.getClass();

        //access fields of class and print details
       Field field1=obj.getDeclaredField("color");
        field1.setAccessible(true);
        field1.set(d1, "frawn");

        String s= (String) field1.get(d1);
        System.out.println("Accessing Private variable : "+s);


        //modifier
        int modifier=field1.getModifiers();
        String mod=Modifier.toString(modifier);
        System.out.println("Modifier is::"+mod);


    }

}
/*
Accessing Private variable : frawn
Modifier is::private

Process finished with exit code 0
*/
