package gui;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class MessageBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Username: ");
		String Username = scan.nextLine();
		System.out.println("Enter Password: ");
		String pw = scan.next();

		if (Username.equals("Admin") && pw.equals("123!@#"))
			JOptionPane.showMessageDialog(null, "Login Successfully", "Successful", JOptionPane.ERROR_MESSAGE);
		else {
			JOptionPane.showMessageDialog(null, "Invalid Login", "Login Error", JOptionPane.ERROR_MESSAGE);
			JOptionPane.showMessageDialog(null, "Invalid Login", "Login Error", JOptionPane.QUESTION_MESSAGE);
			JOptionPane.showMessageDialog(null, "Invalid Login", "Login Error", JOptionPane.WARNING_MESSAGE);
			JOptionPane.showMessageDialog(null, "Invalid Login", "Login Error", JOptionPane.PLAIN_MESSAGE);
			JOptionPane.showMessageDialog(null, "Invalid Login");
		}
		int option = JOptionPane.showConfirmDialog(null, "Do another yes/no");
		if (option == 0)
			JOptionPane.showConfirmDialog(null, "Do you remove item", "Delete Title", JOptionPane.OK_CANCEL_OPTION,
					JOptionPane.ERROR_MESSAGE);
		else if (option == 1)
			JOptionPane.showMessageDialog(null, "No");
		else if (option == 2)
			JOptionPane.showMessageDialog(null, "Cancel");

		String name = JOptionPane.showInputDialog(null, "Enter yourname");
		String age = JOptionPane.showInputDialog(null, "Enter your age", "Age Title", JOptionPane.INFORMATION_MESSAGE);

		if (name.equals("Admin") && age.equals("34"))
			JOptionPane.showConfirmDialog(null, "Login Successfully");

	}
}
