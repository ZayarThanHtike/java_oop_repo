package MethodExamples;

public class MethodOverloadEx1 {
	public static void repChar() {
		for (int i = 0; i < 45; i++) {
			System.out.print("*");

		}
		System.out.println();
	}

	public static void repChar(char ch) {
		for (int i = 0; i < 45; i++) {
			System.out.print(ch);

		}
		System.out.println();
	}

	public static void repChar(char ch, int n) {
		for (int i = 0; i < n; i++) {
			System.out.print(ch);

		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		repChar();
		repChar('=');
		repChar('+', 30);
	}

}
