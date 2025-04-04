package Array;

import java.util.Scanner;

public class Example15 {

	public static int[] createArray()
	
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array.");
		int size=sc.nextInt();
		int[] arr=new int[size];
		System.out.println("Enter the array element:");
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		return arr;
	}
	public static void exactCount(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			boolean isPrime=true;
			for(int j=2;j<arr.length;j++)
			{
				if(arr[i]%j==0)
				{
					isPrime=false;
					break;
				}
			}
			if(isPrime)
			{
				Sem.out.println(arr[i]+"are the prime number");
			}
		}
	
	}
	public static void main(String[] args) 
	{
		
		int[]  res=createArray();
		exactCount(res);

	}

}
