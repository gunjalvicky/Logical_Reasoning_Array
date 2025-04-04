package Array;

import java.util.Scanner;

public class BinarySearch2 {
	
	public static int[] createArray()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter  the Array size");
		int size=sc.nextInt();
		int[]arr=new int[size];
		System.out.println("Enter the Array element:");
		for(int i=0;i<arr.length;i++)
		{
			 arr[i]=sc.nextInt();
		}
		return arr;
	}
	public static int findMiddel(int[]arr)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the start position:");
		int start=sc.nextInt();
		System.out.println("Enter the end position:");
		int end=sc.nextInt();
		System.out.println("Enter the element");
		int elment=sc.nextInt();
		
		
		
		while(start<=end)
		{
			int mid=(start+end)/2;
			int middle=arr[mid];
		for(int i=start;i<end;i++)
		{
			if(elment>middle)
			{
				start=mid+1;
			}else if(elment==middle)
			{
				return mid;
			}
			else
			{
				end=mid-1;
			}
		}
		}return-1;
	}
	
	public static void main(String[] args) 
	{
		int[] arr = null;
		int index=findMiddel(arr);
		if(index!=-1)
		{
			System.out.println("Element found at index " + index);
		}else 
		{
			System.out.println("Not found");
		}

	}

}
