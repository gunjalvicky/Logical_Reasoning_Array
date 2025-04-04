//.Find Maximum Element in an Array.
// Input as: 6 3 2 1 5 5 4
// Output as: Max is: 6
package Array;

public class Example18 {

	public static void maximum(int[] arr)
	{
		int max=0,min=arr.length;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		System.out.println("Maximum Value "+max);
		for(int j=0;j<arr.length;j++)
		{
			if(arr[j]<min)
			{
				min=arr[j];
			}
		}
		System.out.println("Minimum element IS "+min);
	}
	
	public static void main(String[] args) {
		int[] arr={6, 3, 2 ,1, 0 ,5 ,4};
		maximum(arr);
	}

}
