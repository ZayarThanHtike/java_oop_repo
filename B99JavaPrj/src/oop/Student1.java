package oop;

import java.util.Scanner;

public class Student1 {
	String name;
	int age;
	
	public Student1(String stuname, int stuage) {
		// TODO Auto-generated constructor stub
		this.name = stuname;
		this.age = stuage;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter Name");
	String stuname=scan.nextLine();
	System.out.println("Enter Age");
	int stuage=scan.nextInt();
	Student1 st = new Student1(stuname, stuage);
	System.out.println(st.name+" "+st.age);
	}

}
