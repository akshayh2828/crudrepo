package treeset;

import java.util.Iterator;
import java.util.TreeSet;


public class TreeSetExample 
{
	public static void main(String[] args) {
		TreeSet<Integer> ts=new TreeSet<>();
		ts.add(10);
		ts.add(5);
		ts.add(15);
		ts.add(25);
		ts.add(15);
		System.out.println("accesnding order");
		System.out.println(ts);
		System.out.println("decsending order");
		System.out.println(ts.descendingSet());
		/*
		 * Iterator<Integer> it=ts.descendingIterator();
		 * System.out.println("decsending order");
		 * 
		 * while(it.hasNext()) { System.out.println(it.next()); }
		 */		
		
		
	}

}
