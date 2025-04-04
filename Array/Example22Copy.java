package Array;

public class Example22Copy {

		public static int[] copyArray(int[] arr)
		{
			int[] copy=new int[arr.length];
			for(int i=0;i<copy.length;i++)
			{
				copy[i]=arr[i];
			}
			return copy;
		}
		public static void printarray(int[]copy)
		{
			for(int copys:copy)
			{
				System.out.print(copys+" ");
			}
		}
	public static void main(String[] args) 
	{
		int[] arr= {1,2,3,4,5};
		
		int[] copy=copyArray(arr);
		printarray(copy);
	}

}
