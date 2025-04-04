package Array;

import java.util.Scanner;

public class Example23 {
	
	public static int[] createArray()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array size:");
		int size=sc.nextInt();
		int[] arr=new int[size];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
			
		}
		return arr;
	}
	public static void printArray(int []arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	public static void  Evenodd(int[] arr)
	{
		int even=0,odd=0;
		int[] evenNumbers=new int[even];
		int[] oddNumbers=new int[odd];
		
	System.out.println("Even No:");
	for(int num:arr)
		{
			if(num%2==0)
			{
			  even++;
				
			}else 
			{
				odd++;
			}
		}
	System.out.println("Even Number is :");
	for(int nu:arr)
	{
		System.out.println(num+" ");
	}
	System.out.println("Odd Number is :");
	for(int num:arr)
	{
		System.out.println(num+" ");
	}
	
	System.out.println("Odd element are :");
	for(int o:arr)
	{
		if(o%2!=0)
		{
			System.out.println(odd++);
		}
	}
	}
	public static void main(String[] args) 
	{
		
		int []res=createArray();
		printArray(res);
		Evenodd(res);
	}

}
