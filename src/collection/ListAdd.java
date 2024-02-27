package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListAdd {
	public static void main(String[] args) {
		/*List<Integer> ls=Arrays.asList(1,1,1,1);
		List<Integer> newList=new ArrayList<>();
		for(int deptId:ls)
		{
			newList.add(deptId);
		}
		System.out.println(newList);
	}*/
		
		List<Integer> ls=Arrays.asList(1,2,3,100,500,70,80,500);
		Set<Integer> st=new HashSet<>();
		for(int deptId:ls)
		{
			st.add(deptId);
		}
		System.out.println(st);

}
}
