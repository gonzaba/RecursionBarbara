package testers;

import classes.SLL;

public class Excercise3 {

	
	public static void main(String[] args) {

	SLL<Integer> list = new SLL<Integer>();
		
		list.addFirst(3);
		
		list.addNode(4);
		list.addNode(8);
		list.addNode(1);
		list.addNode(7);
		list.addNode(3);
		list.addNode(5);
		list.addNode(4);
		
		System.out.println(list);
		System.out.println("List after using lessThan method");
		System.out.print(list.lessThan(6));
		
		System.out.println("List after using ConsecutiveIncreasingPairs method:");
		System.out.print(list.consecutiveIncreasingPairs());
	
		
	
	}
}
