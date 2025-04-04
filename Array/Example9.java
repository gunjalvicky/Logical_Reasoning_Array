package Array;
import java.util.Scanner;
public class Example9 
{
	
		public static int[] createArray()
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the array size:");
			int size=sc.nextInt();
			int[]arr=new int[size];
			System.out.println("Enter the array element:");
			for(int i=0;i<arr.length;i++)
			{
				arr[i]=sc.nextInt();
				
			}
			return arr;
		}
		public static void prinArray(int[] arr)
		{
			//System.out.println("Array is :");
			
			for(int w:arr)
			{
				System.out.print(w+" ");
			}
		}
		public static  void additionArray(int[] arr)
		{int sum1=0;
			for(int sum:arr)
			{
				sum1+=sum;
			}
			System.out.println("addition of array Is:"+sum1);
			System.out.println("Average of array element Is:"+(sum1/(arr.length-1)));
		}
		public static void main(String[] args)
		{
			int[] res=createArray();
			prinArray(res);	
			additionArray(res);
		}

	}



