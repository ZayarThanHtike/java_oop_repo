package ArrayExample;

import java.util.Scanner;

public class ArrayEg6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of row");
		int row = scan.nextInt();
		System.out.println("Enter the number of column");
		int col = scan.nextInt();

		int[][] A = new int[row][col];

		for (int i = 0; i < row; i++) {
			for (int k = 0; k < col; k++) {
				System.out.print("Enter a value");
				A[i][k] = scan.nextInt();
			}
		}
		System.out.println("Display Data Array");
		for (int i = 0; i < A.length; i++) {		//A.lenght=Number of rows
			for (int k = 0; k < A[i].length; k++)	//A[i].length=Number of columns
				System.out.print(A[i][k] + " ");
			System.out.println();
		}
	
}

}
