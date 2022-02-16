package Collections;

import java.util.Deque;
import java.util.Iterator;
import java.util.ArrayDeque;

public class DequeDemo {

	public static void main(String[] args) {
		
		Deque<Integer> deq=new ArrayDeque<>();
		Deque<Integer> deq1=new ArrayDeque<>();
		
		// Insert elements
		
		deq.add(1);
		deq.add(2);
		deq.add(3);
		deq.add(11);
		deq.add(5);
		
		// Insert at first and last in deque
		
		deq.addFirst(0);
		deq.addLast(6);
		
		// Append a deque to another
		
		deq1.add(7);
		deq1.add(8);
		deq1.add(9);
		
		deq.addAll(deq1);
		
		// accessing through Iterator
		
		Iterator it=deq.iterator();
		
		while(it.hasNext()) {
			System.out.print(it.next()+"\t");
		}
		
		System.out.println("\nSize of deq : "+deq.size());
		
		// pop,remove(),removeLast(),removeFirst(),removeAll()
		
		deq.pop();
		deq.remove(3);
		deq.removeAll(deq1);
		deq.removeLast();
		deq.removeFirst();
		
		System.out.println(deq);
		
		//contains()
		
		System.out.println("deq1 in deq or not : "+deq.contains(deq1));
		
		
		//descendingIterator()
		
		Iterator it1=deq.descendingIterator();
		
		System.out.println("Deque in reverse order :");
		
		while(it1.hasNext()) {
			System.out.print(it1.next()+"\t");
		}
		
		// element(),peek()
		
		System.out.println("\nHead of deq using element() : "+deq.element());
		System.out.println("Head of deq using peek() : "+deq.peek());
		
		//offer(),offerFirst(),offerLast()
		
		deq.offer(20);
		deq.offer(30);
		deq.offerFirst(40);
		deq.offerLast(50);
		
		for(Integer i : deq) {
			System.out.print(i+"\t");
		}
		
		// peekFirst(),peekLast()
		
		System.out.println("\nDeq peekFirst() : "+deq.peekFirst());
		System.out.println("Deq peekLast() : "+deq.peekLast());
		
		//poll(),pollFirst(),pollLast()
		
		System.out.println("Poll() :"+deq.poll());
		
		for(Integer i : deq) {
			System.out.print(i+"\t");
		}
		
		
		System.out.println("\nPollFirst() :"+deq.pollFirst());
		System.out.println("PollLast() :"+deq.pollLast());
		
		for(Integer i : deq) {
			System.out.print(i+"\t");
		}
	}
}

/*

0	1	2	3	11	5	6	7	8	9	
Size of deq : 10
[2, 11, 5]
deq1 in deq or not : false
Deque in reverse order :
5	11	2	
Head of deq using element() : 2
Head of deq using peek() : 2
40	2	11	5	20	30	50	
Deq peekFirst() : 40
Deq peekLast() : 50
Poll() :40
2	11	5	20	30	50	
PollFirst() :2
PollLast() :50
11	5	20	30	

*/
