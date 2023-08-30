package MethodExamples;

import java.util.Scanner;

public class RecursiveFactorialsecondmethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter sum number");
		int num = scan.nextInt();
		System.out.println("The Factorial of the given number is "+Sum(num));
		Sum(num);
	}

	public static int Sum(int n) {
		if (n == 1)
			return 1;
		else
			return n + Sum(n - 1);
	}
}
