//Search for a given Element in an Array if present then print
//   "Element found at index : ", if not present print "Element not found"
//    Input as: 1 4 3 5 2 6 5
//    Enter searching element: 5
//    Output: Element found at index 6
// 
//     Input as: 1 4 3 5 2 6
//    Enter searching element: 7
//    Output: Element not found
package Array;

public class Example19 {

	
	public static void foundIndex(int[] arr)
	{
		int search=7;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==search)
			{
				System.out.println("Element are present at "+i);
			}else if(arr[i]!=search){
				System.out.println("Element not found");
				break;
			}
		}
		
	}
	public static void main(String[] args) 
	{
		int[] arr= {3 ,4, 3, 5 ,3, 6, 5};
		
		foundIndex(arr);
	}

}
