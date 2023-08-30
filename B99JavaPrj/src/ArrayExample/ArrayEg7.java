package ArrayExample;

import java.util.Scanner;

public class ArrayEg7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the first number");
		int num1 = scan.nextInt();
		System.out.println("Enter the second number");
		int num2 = scan.nextInt();

		max(num1, num2); // Actual Parameter Pass by value
		System.out.println("End Program");
	}

	public static void max(int n1, int n2) { // Formal Parameter
		if (n1 > n2)
			System.out.println("Maximum Value is " + n1);
		else
			System.out.println("Maximum Value is " + n2);
	}

}
