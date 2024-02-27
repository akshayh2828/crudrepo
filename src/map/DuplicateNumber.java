package map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class DuplicateNumber 
{
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
		Object [] numbers=ls.toArray();
		Map<Object, Integer> map=new HashMap<>();
		for(Object num:numbers)
		{
			if(map.get(num)!=null)
			{
				map.put(num, map.get(num)+1);
			}
			else
			{
				map.put(num, 1);
			}
		}
		Set<Object> set=map.keySet();
		for(Object key:set)
		{
			if(map.get(key)>1)
			{
				System.out.println(key);
			}
		}
		
		
	}

}
