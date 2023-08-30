package methodexercise;

public class MethodEx1 {
	String name;
	int age;
	static String module = "Unit1 Programming";

	public void createstudent() {
		System.out.println("Create Student Object = " + name + " " + age);
	}

	public static void dispaly() {
		System.out.println(module);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodEx1 st = new MethodEx1();
		st.name = "Aung Aung";
		st.age = 14;
		st.createstudent();
		MethodEx1 st1 = new MethodEx1();
		st1.name = "Maung Maung";
		st1.age = 15;
		st1.createstudent();

		System.out.println(MethodEx1.module);
		MethodEx1.dispaly();

	}

}
