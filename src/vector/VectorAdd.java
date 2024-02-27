package vector;

import java.util.List;
import java.util.Vector;

public class VectorAdd 
{
	public static void main(String[] args) {
		Vector<Integer> vec=new Vector<>();
		vec.add(10);
		vec.add(30);
		vec.add(40);
		System.out.println(vec);
		System.out.println(vec.size());
		System.out.println(vec.contains(10));
		System.out.println(vec.capacity());
		System.out.println(vec.firstElement());
		System.out.println(vec.lastElement());
		System.out.println(vec.remove(2));
		System.out.println(vec);

		
		
	}

}
