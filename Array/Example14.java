//
//Write a program to count how many elements appear exactly 2 times
// in an array {1, 2, 2, 3, 4, 4, 5, 5}.
// Example: 2, 4, and 5 each appear exactly twice.
// If k time elements are not found then print "No element found".
package Array;


public class Example14 {

	public static void createApperence(int[] arr)
	{
		int k=2;
		for(int i=0;i<arr.length;i++)
		{
			int count =1;
			int found=0;
			for(int j=0; j<arr.length; j++)
			{
				if(arr[i]==arr[j] && i<j)
				{
					count++;
				}
				if(arr[i]==arr[j] && i>j)
				{
					found++;
				}
				
			}
			if(found==0 && count==k)
			{
				System.out.println(" Frequncy are"+arr[i]+" :"+count);
			}
		}

	}
	public static void main(String[] args) {
		int[] arr= {1, 2, 2, 3, 4, 4, 5, 5};
		Example14.createApperence(arr);
	}

}
