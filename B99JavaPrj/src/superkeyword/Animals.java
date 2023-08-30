package superkeyword;

public class Animals {
	String color = "white";

	Animals() {
		System.out.println("Animal is created");
	}

	public void display() {
		System.out.println("Display method of Animal Class");
	}
}

class Dog extends Animals {
	String color = "Black";

	Dog() {
		super();
		System.out.println("Dog is created");
	}

	public void display() {
		System.out.println("Display method of Dog class");
	}

	void printColor() {
		System.out.println(color);
		System.out.println(super.color);
		display();
		super.display();
	}
}

class Testsuper {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d = new Dog();
		d.printColor();
	}

}
