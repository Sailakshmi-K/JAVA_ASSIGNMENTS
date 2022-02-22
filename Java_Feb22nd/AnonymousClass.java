package JavaFeb22;

/**
 * 
 *Till JDK 7 , In Diamond operator was not allowed with anonymous classes.
 * If we try to use it returns errors.
 * From JDK 9 onwards , a new feature is developed to use Diamond Operator with anonymous inner classes.
 * Classes can be anonymous only if they are inner and subclass to another class.
 * So,Anonymous classes are referred as Anonymous Inner Classes.
 * As Anonymous indicates no name,To create object for anonymous classes we use the parent reference
 * at the time of inner anonymous class creations.
 * <T> It is a type-variable which infers the type of object.
 *
 */

abstract class Location<T>{
    abstract void show();
}

public class AnonymousClass {
    public static void main(String[] args) {

        Location<String> l=new Location<String>() {
            @Override
            void show() {
                System.out.println("Andhra Pradesh");
            }
        };
        l.show();
    }
}

/*
Andhra Pradesh

Process finished with exit code 0
 */
