package Collections;

import java.util.Queue;
import java.util.LinkedList;

public class LinkedListQueue {

	public static void main(String[] args) {
		
		Queue<String> que=new LinkedList<>();
		Queue<String> que1=new LinkedList<>();
		
		//insert elements
		
		que.add("Mango");
		que.add("Apple");
		que.add("Lichi");
		que.add("Banana");
		que.add("Kiwi");
		
		que1.add("Plum");
		que1.add("Tomato");
		
		//addAll() 
		
		que.addAll(que1);
		
		System.out.println("que : "+que);
		
		//contains(),containsAll()
		
		System.out.println("plum in que or not : "+que.contains("Plum"));
		System.out.println("que1 in que or not : "+que.containsAll(que1));
		
		//clear()
		
		que1.clear();
		System.out.println("que1 : "+que1);
		
		//element(),peek()
		System.out.println("que element() : "+que.element());
		System.out.println("que peek() : "+que.peek());
		
		//isempty(),offer(),poll()
		
		System.out.println("Que is empty or not : "+ que.isEmpty());
		que.offer("Dragon");
		System.out.println("Appending Dragon by offer() : "+que);
		que.poll();
		System.out.println("After poll() : "+ que);
	
		//hasCode()
		System.out.println("Hashcode : "+que.hashCode());
		
		//remove(),size()
		
		que.remove("Plum");
		System.out.println("After remove() : "+que);
		System.out.println("Que size :"+que.size());
		
	}
}
/*

que : [Mango, Apple, Lichi, Banana, Kiwi, Plum, Tomato]
plum in que or not : true
que1 in que or not : true
que1 : []
que element() : Mango
que peek() : Mango
Que is empty or not : false
Appending Dragon by offer() : [Mango, Apple, Lichi, Banana, Kiwi, Plum, Tomato, Dragon]
After poll() : [Apple, Lichi, Banana, Kiwi, Plum, Tomato, Dragon]
Hashcode : 1376937284
After remove() : [Apple, Lichi, Banana, Kiwi, Tomato, Dragon]
Que size :6

*/
