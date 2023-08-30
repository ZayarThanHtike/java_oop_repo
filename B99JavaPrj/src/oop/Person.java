package oop;

public class Person {
	String name;
	int age;

	public Person() {
		 name = "Aung Aung";
		 age = 30;
	}

	public Person(String Name, int Age) {
		this.name = Name;
		this.age = Age;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person=new Person();
		System.out.println(person.name+" "+person.age);
		Person person1=new Person("Maung Maung",20);
		System.out.println(person1.name+" "+person1.age);
	}

}
