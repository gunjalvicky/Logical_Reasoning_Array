package Array;

import java.util.Scanner;

public class Example6 
{
	public static int[] createArray()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of Array:");
		int size=sc.nextInt();
		int[] arr=new int[size];
		System.out.println("Enter the array :");
		for(int i=0;i<arr.length;i++)
		{
			
			arr[i]=sc.nextInt();
		}
		return arr;
	}
	public static void last_and_first(int[] arr)
	{
		System.out.println("Sum of the element :"+" "+(arr[0]+arr[arr.length-1]));
	}

	public static void main(String[] args) 
	{
			int[] res=createArray();
			last_and_first(res);
			
	}

}
