package classes;

public class Pair<E> {
	
	private E first; 
	private E second; 
	public E getFirst() { return first;}
	public void first(E first) {
		this.first = first;}
	public E getSecond() { return second;}
	public void second(E second) { this.second = second;}
	
	public Pair(E first, E second) {super();  this.first = first;  this.second = second; }
	
	public Pair() {}
	
	
}
