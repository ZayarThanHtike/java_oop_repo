package MethodExamples;

import java.util.Scanner;

public class RecursiveExample {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter first number");
		int a = scan.nextInt();
		System.out.println("Enter second number");
		int b = scan.nextInt();

		sum(a, b);

	}

	public static void sum(int a, int b) {
		int c = a + b;
		System.out.println("C = " + c);
		if (c <= 100) {
			System.out.println("Enter another first number");
			int num1 = scan.nextInt();
			System.out.println("Enter another second number");
			int num2 = scan.nextInt();
			sum(num1, num2);
		}
	}
}
