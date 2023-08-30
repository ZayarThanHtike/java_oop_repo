package B99pac;

import java.util.Scanner;

public class MethodEg1 {
	static int ft;
	static float inches;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float ft1 = InputData();
		float ft2 = InputData();

		float result = add(ft1, ft2);

		display(result);
	}

	public static float InputData() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter feet: ");
		ft = scan.nextInt();
		System.out.println("Enter inches");
		inches = scan.nextFloat();

		if (inches > 12) {
			ft++;
			inches -= 12;
		}

		float feet = convertFeet();
		return feet;
	}

	public static float convertFeet() {
		return ft + (inches / 12);
	}

	public static float add(float ft1, float ft2) {
		return ft1 + ft2;
	}

	public static void display(float result) {
		System.out.println("Result " + result);
	}

}
