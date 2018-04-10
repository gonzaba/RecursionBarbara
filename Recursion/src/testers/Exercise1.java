package testers;

import classes.Pair;

/**
	 * 
	 * @author Bárbara P. González Rivera - 802-14-2976
	 *
	 */	


public class Exercise1 {
	
	public static void main(String[] args) {


	
	 long A1startTime = System.nanoTime();
	 long A1results = fib(50);
	 long A1endTime = System.nanoTime();
	 long A1totalTime =  (A1endTime-A1startTime);
	

	 long A2startTime = System.nanoTime();
	 Pair A2results = fib2(50);
	 long A2endTime = System.nanoTime();
	 long A2totalTime =   (A2endTime-A2startTime);
	 
	 
	 System.out.println("First Algorithm took: " + A1totalTime);
	 System.out.println("Second Algorithm took: " + A2totalTime);
	 
	}
	 
	 public static long fib(int n) {
		   if (n == 1 || n == 0) return 1; 
		   else return fib(n-1) + fib(n-2); 

	 }//end of lon fib
	 
	 
	public static Pair<Integer> fib2(int n) {
		 if (n==0 || n==1) { 
			 return new Pair(1, 1);
		 }
		 Pair<Integer> p = fib2(n-1); 
		 return new Pair(p.getFirst() + p.getSecond(), p.getFirst());

	 }
	 
	 
	 
	 
}//end of main


