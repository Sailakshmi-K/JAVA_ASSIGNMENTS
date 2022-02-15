package Collections;


import java.util.Vector;


public class ListDemo2 {

	public static void main(String[] args) {

		Vector<String> vect1=new Vector<>();
		
		vect1.add("A");
		vect1.add("B");
		
		vect1.add(0,"C");
		vect1.addElement(null);
		vect1.add("A");
		System.out.println(vect1);
		
		Vector<String> vect2=new Vector<>();
		vect2.addAll(vect1);
		
		System.out.println(vect2);
		
		System.out.println("Element value at index 1 : "+vect1.get(1));
		
		vect1.remove(1);
		System.out.println("After removal element at index 1 : "+vect1);
		
		System.out.println("Vector size :"+vect1.size());
		
		System.out.println("C in vect1 or not : "+vect1.contains("C"));
		
		System.out.println("Vector last element : "+vect1.lastElement());
		System.out.println("Vector first element : "+vect1.firstElement());
		
		
	}

}
/*
 * VECTOR:::
 * NULL ==> Allowed
 * Duplicates ==>Allowed
 * Order ==>Insertion
 * 
 * 
 * OUTPUT:
 * [C, A, B, null, A]
[C, A, B, null, A]
Element value at index 1 : A
After removal element at index 1 : [C, B, null, A]
Vector size :4
C in vect1 or not : true
Vector last element : A
Vector first element : C

 * 
*/
