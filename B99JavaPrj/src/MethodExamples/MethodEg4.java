package MethodExamples;

import java.util.Scanner;

public class MethodEg4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first number");
		int a = scan.nextInt();
		System.out.println("Enter second number");
		int b = scan.nextInt();
		System.out.println("Before swapping ");
		System.out.println("A = "+a+" B = "+b);

		swap(a, b);
		System.out.println("After swapping ");
		System.out.println("A = "+a+" B = "+b);
	}

	public static void swap(int c, int d) {
		int temp = c;
		c = d;
		d = temp;
		System.out.println("After swapping ");
		System.out.println("C = " + c + " D = " + d);
	}
}
