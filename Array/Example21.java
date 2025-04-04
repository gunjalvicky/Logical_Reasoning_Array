package Array;

public class Example21 
{
	public static void findEvenOddIndex(int[] arr)
	{

	    System.out.print("even element");
		for(int i=0;i<arr.length;i++)
		{
			if(i%2==0)
			{
				 System.out.print(arr[i] + " \n");
			}
			

		}
		System.out.print( "Odd element");
		for(int i=0;i<arr.length;i++)
		{
		   if(i%2!=0)
			{
			   System.out.print(arr[i] + " \n");
			}
			
		}
	}
	public static void main(String[] args) 
	{
		int[] arr= {1,2,3,4,5,6,7,8};
		findEvenOddIndex(arr);
	}

}
