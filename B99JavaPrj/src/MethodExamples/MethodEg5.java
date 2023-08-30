package MethodExamples;

import java.util.Scanner;

public class MethodEg5 {
	int a, b;

	public MethodEg5(int a, int b) {
		this.a = a;
		this.b = b;// Object ka pine sine thaw this
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodEg5 m1 = new MethodEg5(10, 20);
		System.out.println("Before swapping");
		System.out.println("m1.a = " + m1.a + " " + "m2.a = " + m1.b);
		swap(m1);
		System.out.println("After swapping");
		System.out.println("m1.a = " + m1.a + " " + "m2.a = " + m1.b);
	}

	public static void swap(MethodEg5 m2) {
		int temp = m2.a;
		m2.a = m2.b;
		m2.b = temp;
	}
}
