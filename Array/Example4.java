package Array;
//print specific index array position
import java.util.Scanner;

public class Example4 {

	public static void printArrayForIndex(int[] arr,int index)
	
	{
		if(index<=0 || index>=arr.length)
		{
			throw new IndexOutOfBoundsException(index+"Is out of the range..");
		}
	System.out.println( arr[index]);
		
	}
	public static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) 
	{
		int[] arr= {100,200,300,400,500};
		Scanner sc=new Scanner(System.in);
		
		
		printArray(arr);
		System.out.println("Enter the index of array:");
		int index=sc.nextInt();
		printArrayForIndex(arr, index);
						

	}

}
