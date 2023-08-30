package oop;

public class Puppy {
	private int PuppyAge;

	public Puppy(String name) {
		System.out.println("Name chosen is " + name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Puppy MyPuppy = new Puppy("Lucky");

		MyPuppy.setAge(5);

		System.out.println("Puppy's age is " + MyPuppy.getAge());

	}

	public void setAge(int age) {
		PuppyAge = age;

	}

	public int getAge() {
		return PuppyAge;
	}
}
