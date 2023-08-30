package oop;

import java.util.Scanner;

public class Student {
	String stuname;
	int stuage;


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Student Name");
		String stuname = scan.next();
		System.out.println("Enter age");
		int stuage = scan.nextInt();
		//Student st = new Student(stuname, stuage);//
		System.out.println(stuname + " " + stuage);
}
}
