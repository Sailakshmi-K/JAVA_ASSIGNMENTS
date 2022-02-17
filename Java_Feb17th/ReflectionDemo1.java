package Reflections;

import java.lang.reflect.*;

class Coditas{

    // field
    String Domain;

    // constructors no-arg & args
    Coditas(){
        System.out.println("No-arg coditas class");
    }
    Coditas(String d){
        this.Domain=d;
    }

    //methods
    public void show(){
        System.out.println("Domain : "+Domain);
    }
    public void show(String s){
        System.out.println("Coditas Domain : "+s);
    }

}

public class ReflectionDemo1 {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException, NoSuchFieldException {

        Coditas obj_coditas = new Coditas();
        Coditas obj_coditas1 = new Coditas("JAVA ELTP PROGRAM");

        // Class object
        Class obj = obj_coditas.getClass();

        // Getting class name
        System.out.println("Class name : "+obj.getName());
        System.out.println("Canonical name : "+obj.getCanonicalName());
        System.out.println("Simple name : "+obj.getSimpleName());
        System.out.println("super class name : "+obj.getSuperclass());

        //Getting class modifier
        int mod= obj.getModifiers();
        String s=Modifier.toString(mod);
        System.out.println("Class modifier : "+s);
        // For default, it prints empty string as it's val is 0

        Constructor[] constructors=obj.getDeclaredConstructors();
        for(Constructor c:constructors){
            int mod1= c.getModifiers();
            String s1=Modifier.toString(mod1);
            System.out.println("Constructor name : "+c.getName()+" , modifier : "+s1+" , parameters count : "
                    +c.getParameterCount());
            // For any calss,method,constructor modifier is default if we haven't declared anything
        }

        Method[] methods=obj.getDeclaredMethods();
        for(Method m : methods){
            System.out.println("Methods name : "+m.getName()+" ,paramenters : "+m.getParameterCount());
        }
        // we can invoke methods using reflections externally at run time

        Method m1=obj.getDeclaredMethod("show");
        Method m2=obj.getDeclaredMethod("show",String.class);
        m1.invoke(obj_coditas1);
        m2.invoke(obj_coditas,"Sailakshmi");

        // Feilds
        Field fields= obj.getField("Domain");
        fields.set(obj_coditas,"PUNE ELTP CODITAS");

        String f= (String) fields.get(obj_coditas);
        System.out.println(f);


    }

}
/*

No-arg coditas class
Class name : Reflections.Coditas
Canonical name : Reflections.Coditas
Simple name : Coditas
super class name : class java.lang.Object
Class modifier : 
Constructor name : Reflections.Coditas , modifier :  , parameters count : 1
Constructor name : Reflections.Coditas , modifier :  , parameters count : 0
Methods name : show ,paramenters : 1
Methods name : show ,paramenters : 0
Domain : JAVA ELTP PROGRAM
Coditas Domain : Sailakshmi
Exception in thread "main" java.lang.NoSuchFieldException: Domain
	at java.lang.Class.getField(Class.java:1703)
	at Reflections.ReflectionDemo1.main(ReflectionDemo1.java:70)

Process finished with exit code 1


*/
