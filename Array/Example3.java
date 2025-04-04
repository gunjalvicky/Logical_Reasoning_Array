package Array;
import java.util.Scanner;
import java.util.Random;
public class Example3
{
	 
	public static  int[] createArray()
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Size of the Array:");
		int size =sc.nextInt();
		int[] arr=new int[size];
		Random r=new Random();
		for(int i=0;i<arr.length;i++)
		{
			arr[i] =r.nextInt(1,100);
		}
		
		
		return arr;
	}
		public static void printArray(int[] arr)
		{
			System.out.println("Random Array Is:");
			for(int i=0;i<arr.length;i++)
			{
				System.out.print(arr[i]+" ");
			}
			System.out.println();
		}

	
	public static void main(String[] args) 
	{
		int[] res=createArray();
		printArray(res);
	}

}
