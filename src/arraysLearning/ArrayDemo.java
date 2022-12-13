package arraysLearning;

import java.util.Arrays;

public class ArrayDemo {

	public static void main(String[] args) {
		int[] arr;
		arr = new int[10];

		System.out.println(arr.length); // 10
		System.out.println(arr[0]); // Default value 0 - int, double- 0.0, boolean - false

		// System.out.println(arr[15]); //array index out of bounds exception.

		int[][] martrix = { { 2, 5, 9 }, { 44, 88, 66 } };
		System.out.println(martrix[1][1]); // row and column(2nd row and 2nd index - 88)

		int[] arr2 = { 2, 5, 9, 1 };
		System.out.println(arr2); // [I@6504e3b2 - print object location
		System.out.println(Arrays.toString(arr2)); // [2, 5, 9, 1]
		Arrays.sort(arr2);
		System.out.println(Arrays.toString(arr2)); // [1, 2, 5, 9]

	}

}
