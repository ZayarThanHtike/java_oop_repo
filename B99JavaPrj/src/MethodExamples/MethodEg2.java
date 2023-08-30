package MethodExamples;

import java.util.Scanner;

public class MethodEg2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number ");
		int num = scan.nextInt();

		multiplication(num);
	}

	public static void multiplication(int num) {
		for (int i = 1; i <= 12; i++) {
			System.out.println(num + "*" + i + "=" + (num * i));
		}
	}
}
