package Array;

import java.util.Scanner;

public class Example11 
{
	public static  int[] createArray()
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the array size");
		int size=sc.nextInt();
		int[] arr=new int[size];
		System.out.println("Enter the array element:");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
				return arr;
	}
	public static void printArray(int[] arr)
	{
		int even=0,odd=0;
		System.out.print("Array Element is:");
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				even++;
			}else if(arr[i]%2!=0)
			{
				odd++;
			}
		}
		System.out.println("Even element Are:"+even);
		System.out.println("Odd Element Are:"+odd);
		
		
	}
	


	public static void main(String[] args) 
	{
		int[] res=createArray();
		printArray(res);

	}
}


