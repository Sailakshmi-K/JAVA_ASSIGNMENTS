package Collections;

/**

 *  ListIterator 
 *  Methods :::
 *  add, add(index,object),addAll(index,collection) 
 *  contains,isEmpty() 
 *  clear(),remove(index)
 *  get(index),set(index,element)
 *  getFirst(),getLast()
 *  

*/

	import java.util.List;
	import java.util.ListIterator;
	import java.util.LinkedList;
	import java.util.Iterator;

	public class ListDemo1 {

		public static void main(String[] args) {
			
			List<Integer> l=new LinkedList<Integer>();
			List<Integer> l1=new LinkedList<Integer>();
			
			// adding elements
			
			l.add(10);
			l.add(11);
			l.add(12);
			l.add(13);
			l.add(14);
			
			// adding null
			
			l.add(null);

			l1.add(20);
			l1.add(30);
			l1.add(40);
			l1.add(50);
			l1.add(60);
			l1.add(70);
			
			System.out.println("************* LIST **********");
			
			l.add(10);
			
			for(Integer i : l) {
				System.out.print(i+"\t");
			}
			
			
			System.out.println("\n************** LIST METHODS *************");
			System.out.println("Size of list : "+(l.size()));
			
			l.add(3, 15);
			
			ListIterator it=l.listIterator();
			
			System.out.println("After adding object at index 3 : ");
			
			while(it.hasNext()) {
				System.out.println("index:"+it.nextIndex()+" value:"+it.next());
			}
			
			
			System.out.println("Verifying elements with contains() method : ");
			
			System.out.println("5 in list or not : "+(l.contains(5)));
			System.out.println("15 in list or not : "+(l.contains(15)));
			System.out.println("List is empty or not :"+(l.isEmpty()));
		
			l.addAll(l1);
			
			System.out.println("After appending a collection :");
			
			for(Integer i : l) {
				System.out.print(i+"\t");
			
			}
			
			System.out.println("\nRemoving all elements from list : ");
			
			l1.clear();
			
			System.out.println("List is empty or not :"+(l1.isEmpty()));
			
			System.out.println("After removing element at index 3: ");
			
			l.remove(3);// Removing element at index 3
			
			for(Integer i : l) {
				System.out.print(i+"\t");
			}
			
			System.out.println("\nGetting element at index 8 : "+(l.get(8)));
			
			l.set(9, 500);
			System.out.println("After setting element 500 at index 9 : ");
			
			for(Integer i : l) {
				System.out.print(i+"\t");
				
			}
			
			System.out.println("\n1st element : "+((LinkedList<Integer>)l).getFirst());
			System.out.println("Last element : "+((LinkedList<Integer>)l).getLast());

			
		
		}
	}

/*

LinkedList :::::::

NULL ===>Allowed
Order ==>Insertion 
Duplicates ==> Allowed



************* LIST **********
10	11	12	13	14	null	10	
************** LIST METHODS *************
Size of list : 7
After adding object at index 3 : 
index:0 value:10
index:1 value:11
index:2 value:12
index:3 value:15
index:4 value:13
index:5 value:14
index:6 value:null
index:7 value:10
Verifying elements with contains() method : 
5 in list or not : false
15 in list or not : true
List is empty or not :false
After appending a collection :
10	11	12	15	13	14	null	10	20	30	40	50	60	70	
Removing all elements from list : 
List is empty or not :true
After removing element at index 3: 
10	11	12	13	14	null	10	20	30	40	50	60	70	
Getting element at index 8 : 30
After setting element 500 at index 9 : 
10	11	12	13	14	null	10	20	30	500	50	60	70	
1st element : 10
Last element : 70
*/
