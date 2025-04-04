package Array;

public class Example24 {

	public static int[] indexRange(int[]arr)
	{
		int start=2;
		int end=4;
		int newLength=end-start;
		int[] res=new int [newLength];
		int index=0;
		for(int i=start;i<end;i++)
		{
			
				res[index]=arr[i];
		index++;
				
		}
		return res;
	}
	public static  int[] printArray(int[] res)
	{
		for(int i=0;i<res.length;i++)
		{
			System.out.println(res[i]);
		}
		return res;
	}
	public static void main(String[] args) 
	{
		int[] arr= {1,2,3,4,5};
		int[] res=indexRange(arr);
		printArray(res);
	}

}

//public class Example24 {
//	public static void printArray(int[] arr) {
//		for (int x : arr) {
//			System.out.print(x + " ");
//		}
//		System.out.println();
//	}
//	public static int[] copyRange(int[] original, int from, int to) { // f = 2, t = 4
//		// 0 1 2 3 4 from = 2 to = 4
//		// 1,2,3,4,5
//		
//		int newLength = to - from;
//		if (newLength < 0) {
//			throw new IllegalArgumentException("From = " + from + " > " + "To = " + to);
//		}
//		int[] copy = new int[newLength];// 0 1
//									 // 3 4
//		int index = 0; // 2
//		for (int i = from; i < to; i++) { // i = 4
//			copy[index] = original[i];
//			index++;
//		}
//		return copy;
//	}
// 	public static void main(String[] args) {
//                   int[] arr = {1,2,3,4,5};
//                   int[] res = copyRange(arr,2,4);
//		   printArray(res);
//             }
//      }
