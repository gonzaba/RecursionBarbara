package testers;

import java.util.ArrayList;

import classes.ArrayQueue;
import interfaces.Queue;

public class Exercise4 {

	public static <E> void main(String[] args) {
	ArrayList<Integer> list = new ArrayList<Integer>();
	
	list.add(3);
	list.add(4);
	list.add(8);
	list.add(1);
	list.add(7);
	list.add(3);
	list.add(5);
	list.add(4);
	
	System.out.println(list);

	ArrayQueue<E> q = new ArrayQueue<>();
	
	
	int i=0;
	while(i<list.size()-1) {
		q.enqueue((E) list.get(i));
	i++;
	}
	
	q.sort(q);
	
	System.out.println(q);
	
	
	
	
	
	}

	
}
