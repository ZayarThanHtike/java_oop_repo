package ArrayExample;

import java.util.Arrays;

public class ArrayEg4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = { -4, 6, 25, 60 };
		Arrays.sort(A);
		System.out.println(Arrays.toString(A));
		int index = Arrays.binarySearch(A, 100);
		if (index < 0)
			System.out.println("Not Found");
		else
			System.out.println(A[index] + " is found at index " + index);
		int[] B = Arrays.copyOf(A, 10);
		System.out.println("B array vlaue = " + Arrays.toString(B));
		Arrays.fill(B, 100);
		System.out.println("B array value = " + Arrays.toString(B));
		Arrays.fill(B, 1, 5, 400);
		System.out.println("B array value = " + Arrays.toString(B));
		int[] C = Arrays.copyOf(A, 4);
		boolean status = Arrays.equals(A, C);
		if (status)
			System.out.println("Equal");
		else
			System.out.println("Not Equal");

	}
}
