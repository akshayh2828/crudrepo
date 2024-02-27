package map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NumberOfOccrance {
	public static void main(String[] args) 
	{
		// to find the duplicates numbers from list?
		
		List<Integer> ls=new ArrayList<>();
		ls.add(10);
		ls.add(20);
		ls.add(30);
		ls.add(40);
		ls.add(10);
		ls.add(20);
		Object[] num=ls.toArray();
		Map<Object, Integer>map=new HashMap<>();
		for(Object numbers:num)
		{
			if(map.get(numbers)!=null)
			{
				map.put(numbers, map.get(numbers)+1);  // (key,values)  
			}
			else
			{
				map.put(numbers, 1);//this is check
			}
			
		}
		System.out.println(map);

		
		
	}

}
