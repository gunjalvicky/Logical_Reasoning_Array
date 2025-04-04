package Array;
import java.util.Scanner;
public class Example7 
{
//	public static int[]CreateTable ()
//	{
//		Scanner sc=new Scanner("enter the Element Size");
//		int size=sc.nextInt();
//		int[] arr=new int[size];
//		for(int i=0;i<arr.length;i++)
//		{
//			arr[i]=sc.nextInt();
//		}
//		return arr;
		public static void printArray(int[]arr)
		{
			int even=0, odd=0;
			Scanner sc =new Scanner(System.in);
			System.out.println("Even Number:");
			for(int w: arr)
			{
				if(w%2==0)
				{
					System.out.print(w+" ");
				}
//				System.out.println();
			}
			
			System.out.println("\nOdd Number:");
			for(int w:arr)
			{
				if(w%2!=0)
				{
					System.err.print(w+" ");
				}
//				System.out.println();
			}
//		
	}
	
	public static void main(String[] args)
	{
		int [] arr= {1,2,3,4,5,6,7};
		printArray(arr);
//		int[] res=CreateTable();
		
		
	}

}
