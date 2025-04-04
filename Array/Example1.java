package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Example1 {

	public static int[] CreateArray() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array size");
		int size = sc.nextInt();
		int[] arr = new int[size];

		System.out.println("Enter" + size + "Elements :");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		return arr;
	}

	public static void printArray(int[] arr) {
		System.out.println("Array is:");
		for (int i = 0; i < arr.length; i++) {
			Arrays.sort(arr);
			System.out.print(arr[i] + " ");
		}
	}

	public static void main(String[] args) {

		int[] res = CreateArray();
		printArray(res);

	}
}
