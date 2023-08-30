package oop;

public class Students {
	public Students() {
		System.out.println("Students Constructor");
	}

	public Students(String name) {
		System.out.println("Name is " + name);
	}
	public Students(int n1) {
		System.out.println("Number is "+n1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Students st = new Students();
		Students st1 = new Students("Zayar");
		Students st2 = new Students("Aung Aung");
		Students st3=new Students(10);
	}

}
