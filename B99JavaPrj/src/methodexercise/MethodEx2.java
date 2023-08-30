package methodexercise;

import java.util.Scanner;

public class MethodEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a character: ");
		char ch = scan.next().charAt(0);
		System.out.println("Enter the number of columns: ");
		int col = scan.nextInt();
		System.out.println("Enter the number of lines: ");
		int line = scan.nextInt();

		display(ch, col, line);
	}

	public static void display(char ch, int col, int line) {
		for (int i = 1; i <= line; i++) {
			for (int j = 1; j <= col; j++) {
				System.out.print(ch + " ");
			}
			System.out.println();
		}
	}
}
