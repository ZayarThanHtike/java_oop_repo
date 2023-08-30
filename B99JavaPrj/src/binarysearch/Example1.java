package binarysearch;

import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int[] A = new int[5];

		for (int i = 0; i < A.length; i++) {
			System.out.print("Enter Data :");
			A[i] = scan.nextInt();
		}
		System.out.println("Enter Search Key Value");
		int key = scan.nextInt();

		int F = 0;
		int L = A.length - 1;
		int mid;
		while (F <= L) {
			mid = (F + L) / 2;

			if (key == A[mid]) {
				System.out.println(key + " is found at index " + mid);
				break;
			} else if (key > A[mid])
				F = mid + 1;
			else if (key < A[mid])
				L = mid - 1;
		}
		if (F > L)
			System.out.println(key + " is not found");
	}

}
