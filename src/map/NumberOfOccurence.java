package map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class NumberOfOccurence {
	// to find the occurence(times) of each words from string?


	public static void main(String[] args) 
	{
		String str="i am learning java java and aslo learning core java";
		String [] word=str.split(" ");
		Map<String, Integer>map=new HashMap<>();
		for(String words:word)
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
		System.out.println(map);
		System.out.println(map.keySet());// to find key-element of  map..
		System.out.println(map.values());// to find values of map..
	}
	
}
