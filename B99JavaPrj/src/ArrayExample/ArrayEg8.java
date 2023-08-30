package ArrayExample;

import java.util.Scanner;

public class ArrayEg8 {
//Global ka auto intialise pee 0 htar pyy dl
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result=0;	//Local ka auto intialise mna loke wuu
		do{
		System.out.println("Enter the first number");
		int fnum = scan.nextInt();
		System.out.println("Enter the second number");
		int secnum = scan.nextInt();
		System.out.println("Enter the operator");
		char operator = scan.next().charAt(0);

		switch (operator) {

		case '+':
			result=sum(fnum, secnum);
			break;
		case '-':
			result=sub(fnum, secnum);
			break;
		case '*':
			result=multi(fnum, secnum);
			break;
		case '/':
			result=division(fnum, secnum);
			break;
		default:
			System.out.println("Wrong input");
		}
		System.out.println("The Result is "+ result);
	}
	while(repeat());	//default ka True
	}
	public static boolean repeat() {
		System.out.println("Do another yes/no : ");
		String status=scan.next();
		
		if(status.equalsIgnoreCase("yes"))
			return true;
		else return false;
	}

	public static int sum(int num1, int num2) {
		return (num1 + num2);

	}

	public static int sub(int num1, int num2) {
		return (num1 - num2);

	}

	public static int multi(int num1, int num2) {
		return (num1 * num2);
	}

	public static int division(int num1, int num2) {
		return (num1 / num2);
	}
}
