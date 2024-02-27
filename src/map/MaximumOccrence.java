package map;

public class MaximumOccrence {
	public static void main(String[] args) {
		int [] arr= {1,2,3,4,5,3,8,3,9,3};
		int count=0;
		int compareCount=0;
		int maxOcc=0;
		int i;
		for( i =0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
				}
					
			}
		}
		if(count>compareCount)
		{
			compareCount=count;
			maxOcc=arr[i];
			
		}
		System.out.println(maxOcc);
	}

}
