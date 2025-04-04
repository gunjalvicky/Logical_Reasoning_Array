// Implement a Java program to find the index number of an element 
// in an int array by using binary searching and display the results.
package Array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class BinarySearch {

	public static int binarySearch(int[] arr)
	{
			int start=0;
			int end=arr.length-1;
			int element=4;
			
		
		
		while(start<=end)
		{
			
			int mid=(start+end)/2;
			int middle=arr[mid];
			if(element>middle)
			{
				start=mid+1;
			}else if(element==middle)
			{
				return mid;
			}else
			{
				end=mid-1;
			}
				
		}
		return-1;
		
	}
	
	public static void main(String[] args) 
	{
		int[] arr= {1,3,4,5,6,7,8};
		Arrays.sort(arr);
		int index=binarySearch(arr);
		if(index!=-1)
		{
			System.out.println("Element are at index :"+index);
			
		}
		else {
			System.out.println("NOt a found");
		}
		
	}

}
