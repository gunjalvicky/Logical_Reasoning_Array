package Array;
import java.util.Scanner;
public class Example12 {

	
//		public static  int[] createArray()
//		{
//			Scanner sc=new Scanner (System.in);
//			System.out.println("Enter the array size");
//			int size=sc.nextInt();
//			int[] arr=new int[size];
//			System.out.println("Enter the array element:");
//			for(int i=0;i<arr.length;i++)
//			{
//				arr[i]=sc.nextInt();
//			}
//					return arr;
//		}
		public static void printArray(int[] arr)
		{
			int count=0;
			System.out.println("Count of the array:");
			for(int i=0;i<arr.length;i++)
			{
				
				count++;
			}
			System.out.println("Count : "+count);
		}
		public static double createaverage(int[] arr)
		{
			int sum=0;
			for(int i=0;i<arr.length;i++)
			{
			sum+=arr[i];
			}
			System.out.println("Sum of the array"+sum);
			return (double)sum/arr.length;
		}

		public static void main(String[] args) 
		{
			int[] arr= {10,20,30,40,50};
			
			printArray(arr);
			double average=createaverage(arr);
			System.out.println("average Is :"+average);

		}
}

