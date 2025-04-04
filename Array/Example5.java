package Array;

import java.util.Scanner;

public class Example5 
{
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
	public static void middelElement(int [] arr)
	{
//		String number=arr.length % 2!=0 ? "Middel element is:"+arr[arr.length/2]:"Middele element are:"+arr[arr.length/2-1]+""+arr[arr.length/2];
//		System.out.println(arr);
		String res = arr.length % 2 != 0 ? "Middle element is : " + arr[arr.length / 2]
				: "Middle elements are : " +(arr[arr.length / 2 - 1] + arr[arr.length / 2]) / 2.0;
		System.out.println(res);
	}

	public static void main(String[] args) 
	{
		int[] res=createarray();
		middelElement(res);


	}

}
