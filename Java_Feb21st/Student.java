package Jdk8;

/**
        * OBJECT CLASS METHODS
        * toString(),getClass(),hashCode(),equals(),clone(),finalize(),wait(),notify(),notifyAll()
 */

public class Student implements Cloneable {
    int id;
    String name;
    String address;

    Student(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() {
        //returns string representation of object
        return ("Student name : " + name + " id : " + id);
    }

    @Override
    public int hashCode() {
        return id;// over rided to get id as hashcode
    }

    public static void main(String[] args) throws Throwable {

        Student s1 = new Student(1, "Sai", "AP");
        Student s2 = new Student(2, "Kusuma", "MP");
        Student s3 = s1;

        System.out.println(s1);//internally toString() method implemented

        System.out.println(s1.hashCode());//returns hashcode i.e,Unique Id of object

        System.out.println(s1.getClass());//returns runtime class of this object
        System.out.println(s1.getClass().getSuperclass());//returns parent class of present runtime class

        System.out.println(s3.equals(s1));//compares the objects & returns true as references are same to both objects
        System.out.println(s2.equals(s1));//returns false as reference is not same.


        //creates and returns exact copy of object
        //it throws exception as it is not cloneable
        // To make it cloneable class must implement cloneable interface
        Student s4 = (Student) s1.clone();
        System.out.println(s4.hashCode());//both s1 and s4 ids are same as it is the copy of it.

    }
}

/*
Student name : Sai id : 1
1
class Jdk8.Student
class java.lang.Object
true
false
1

Process finished with exit code 0
 */