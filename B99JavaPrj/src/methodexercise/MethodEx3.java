package methodexercise;

import java.util.Scanner;

public class MethodEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter lenght of rectangle");
		int length = scan.nextInt();
		System.out.println("Enter width of rectangle");
		int width = scan.nextInt();

		
		System.out.println("Area = " + area(length, width));
		System.out.println("Parameter " + Parameter(length, width));

	}

	public static int area(int l, int w) {
		return (l * w);
	}

	public static int Parameter(int l, int w) {
		return (2 * (l + w));
	}
}
