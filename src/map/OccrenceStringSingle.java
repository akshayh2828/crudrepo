package map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class OccrenceStringSingle
{

	public static void main(String[] args) {
		Object Obj="java";
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
		System.out.println("keys::::"+set);
		System.out.println("values:::"+map.values());
		System.out.println(map.containsKey("java"));
		for(Object key:set)
		{
			if(key==Obj)
			{
				System.out.println("number "+key+"  key is occured in list "  +map.get(key)+  "  times");

			}
		}
		
		}
}
