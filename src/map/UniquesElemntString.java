package map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class UniquesElemntString
{
	public static void main(String[] args) 
	{
		// to find the Unique numbers from list?

		String str="i am learning java java and also learning core java";
		Object [] word=str.split(" ");
		Map<Object, Integer> map=new HashMap<>();
		for(Object words:word)
		{
			if(map.get(words)!=null)
			{
				map.put(words, map.get(words)+1);
			}
			else
			{
				map.put(words, 1);
			}
		}
		Set<Object>set=map.keySet();
		for(Object key:set)
		{
			if(map.get(key)==1)
			{
				System.out.println(key);
			}
		}
			
		
	}

}
