package testers;

import classes.SLL;

public class Excercise2 {

	
	public static void main(String[] args) {

	
		SLL<Integer> list = new SLL<Integer>();
		
		list.addFirst(3);
		
		list.addNodeAfter(list.getFirstNode(), 5);
		list.addNodeAfter(list.getFirstNode().getNext(), 7);
		
		System.out.println(list);
		
		list.reverse();
		
		System.out.println(list);
	}
}
