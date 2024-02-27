package map;

import java.util.HashMap;
import java.util.Map;

public class Hashmap1 {

	public static void main(String[] args) {
		
		
		Map<String, Integer> map=new HashMap<>();
		map.put("akshay", 1);
		map.put("santosh", 2);
		map.put("rushi", 3);
		System.out.println(map.get("akshay"));
		System.out.println(map.get("santosh"));
		System.out.println(map.get("rushi"));
		
		

	}

}
