//Question 20:
//Find the median of a sorted array.
//    Test Case: 1
//  ----------------
//   Array size: 6
//   Elements are: 1, 2, 3, 4, 5, 6
//   Median is: 3.5
//  Test Case: 2
//  ----------------
//   Array size: 5
//   Elements are: 1, 2, 3, 4, 5
//   Median is: 3
package Array;


public class Example20 
{
	public static void median(int[] arr)
	{
		int n=arr.length;
		double median;
		
		
			if(n%2==0)
			{
				median=(arr[n/2-1]+arr[n/2])/2.0;
			}
			else {
				median=arr[n/2];
			}
			
			System.out.println("Middel alemenet :"+median);
		
		
		
	}
	public static void main(String[] args)
	{
		int[] arr= {1, 2, 3, 7, 8,9};
		median(arr);

	}

}
