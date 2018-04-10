package classes;

import java.util.ArrayList;

public class SLL<E> {
	public static class Node<E> {
		private E element; 
		private Node<E> next;
		public Node(E element, Node<E> next) {
			super();
			this.element = element;
			this.next = next;
		}
		public Node(E element) { this(element, null); } 
		public Node() { this(null, null); }
		public E getElement() { return element; }
		public void setElement(E element) { this.element = element; }
		public Node<E> getNext() { return next; }
		public void setNext(Node<E> next) { this.next = next; }	
	}

	private Node<E> first = null; 
	private int size = 0; 	
	public void addFirst(E e) { 
		first = new Node<>(e, first); 
		size++; 
	}
	
	public void addNodeAfter(Node<E> target, E number) {
		Node<E> nuevo = new Node<>();
		nuevo.setElement(number);
		nuevo.setNext(target.getNext());
		target.setNext(nuevo);
		size++;
	}
	
	public void addNode(E e) {
        if (first==null)
            addFirst(e);
        else {
            Node<E> current = first;
            while (current.getNext()!=null)
                current=current.getNext();
            current.setNext(new Node<E>(e));
        }
        size++;
    }
	
	public Node<E> getFirstNode() {
	
		return first;
	}
	
              // returns string formed by elements in this list, separated by spaces
	public String toString() { 
		String s = ""; 
		Node<E> current = first; 
		while (current != null) { 
			s += " " + current.getElement(); 
			current = current.getNext(); 
		}
		return s; 
	}
	
	public void reverse() { 
   if (size > 1) 
      first = (Node<E>) recReverse(first).getFirst(); 
	}
	
	private Pair<Node> recReverse(Node<E> first){
		Node<E> originalFirst = first;
		Pair<Node> reverse = new Pair<Node>(recReverse(null,first),originalFirst);
		return reverse;
	}
	
	private Node<E> recReverse(Node<E> b, Node<E> c) { 
	       if  (c==null) return b;
	       Node<E> a=c.getNext(); 
	       c.setNext(b);
	       return recReverse(c, a);
	}
	
	public ArrayList<E> lessThan(E e) { 
		   ArrayList<E> result = new ArrayList<>();     // and empty ArrayList object
		   if (size > 0) 
		      recLessThan(first, e, result);   // passing only reference to result
		   return result; 
		}

	private void recLessThan(Node<E> fr, E e, ArrayList<E> result) { 
		   if (fr != null) { 
		      if (((Comparable<E>) fr.getElement()).compareTo(e) < 0)
		         result.add(fr.getElement()); 
		      recLessThan(fr.getNext(), e, result);  // passing reference to result
		   }
		} 
	

public ArrayList<Pair<E>> consecutiveIncreasingPairs() { 
   ArrayList<Pair<E>> result = new ArrayList<>();     // and empty ArrayList object
   if (size > 0) 
      recCIP(first, result); 
   return result; 
}

public void recCIP(Node<E> node, ArrayList<Pair<E>> result) {
	if(first==null || first.getNext()==null) {
		return ;
	}
	Node<E> current = first;
	
		if((current.getNext()==null) || (current.getNext().getNext()==null)) {
			
		}
		
		current.getNext(); 
	
	
	
	
}


	
}
