package oop;

public class Animal {
	public String name;
	public int height;
	private String gender;

	public void getAnimal() {
		name = "Aung Net";
		height = 4;

	}

	public String GetGender(String something) {
		this.gender = something;
		return gender;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal dog = new Animal();
		System.out.println(dog.name);
		dog.getAnimal();
		System.out.println(dog.name);
		System.out.println(dog.height);
		dog.GetGender("Female");
		System.out.println(dog.gender);//null (as no value is assigned)
		System.out.println(dog.GetGender("male"));
		//invoker type method returns value
	}
}
