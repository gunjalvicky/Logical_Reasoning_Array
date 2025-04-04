package Array;

import java.util.Scanner;

public class Example10 {

	public static int[] createarray()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int size=sc.nextInt();
		int[] arr=new int[size];
		
		System.out.println("Enter the array:");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		return arr;
	}
	public static void reverseArray(int[] arr)
	{
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.print(arr[i]+" ");
		}
		
	}
	public static void main(String[] args) {
		int[] res=createarray();
		reverseArray(res);
	}

}
