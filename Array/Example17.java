package Array;

public class Example17 {
	public static void duplicate(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			int count=1;
			int found=0;
			for(int j=0;j<arr.length;j++)
			{
				if(arr[i]==arr[j] && i<j)
				{
					count++;
				}
				if(arr[i]==arr[j] && i>j)
				{
					found++;
				}
			}if(found==0 && count==2)
			{
				System.out.println(arr[i]+"Duplicate element"+":"+count);
			}
		}
	}
	public static void main(String[] args)
	{
		int[] arr= {1, 2, 2, 3, 4, 4, 5};
		duplicate(arr);

	}

}
