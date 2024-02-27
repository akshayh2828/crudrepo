package map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class OccurenceSingleNum
{
	//WAP to find the occurence(times) of sigle number from list?

	public static void main(String[] args) {
		Object numb=2;
		
		List<Integer> ls=new ArrayList<>();
		ls.add(1);
		ls.add(2);
		ls.add(3);
		ls.add(4);
		ls.add(1);
		ls.add(2);
		Object [] numbers=ls.toArray();
		Map<Object, Integer>map=new HashMap<>();
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
		System.out.println("keys::::"+set);
		System.out.println("values:::"+map.values());
		System.out.println(map.containsKey(2));
		for(Object key:set)
		{
			if(key==numb)
			{
				System.out.println("number "+key+"  key is occured in list "  +map.get(key)+  "  times");
			}
		}
	}

}
