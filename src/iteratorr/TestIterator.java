package iteratorr;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class TestIterator 
{
	public static void main(String[] args) 
	{
		LinkedHashSet l = new LinkedHashSet() ;

	    // Add some items to the ArrayList
		
	    l.add(1);
	    l.add(2);
	    l.add(3);
	    l.add(4);
	    l.add(5);

	    Iterator i = l.iterator();

	    // Loop through ArrayList contents
	    while(i.hasNext()) {
	      int item = (Integer) i.next();
	      // If item is even remove the element
	      if (item % 2 == 0) {
	        i.remove();
	        }
	    }
	    
	    }
	
	

}












/*
 * LinkedHashSet linkedHashSet = new LinkedHashSet();
 * 
 * linkedHashSet.add(80); linkedHashSet.add("Test"); linkedHashSet.add(82);
 * 
 * Iterator iterator = linkedHashSet.iterator();
 * 
 * while (iterator.hasNext()) {
 * 
 * Object num = iterator.next(); // if (num % 2 == 0) { iterator.remove(); // }
 * }
 * 
 * for (Object num:
 * 
 *
 */