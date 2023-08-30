package inheritance;

 public class InheritanceEg2 {
	protected int z;

	public void addition(int x, int y) {
		z = x + y;
		System.out.println("The sum of the given numbers " + z);
	}

	public void Subtraction(int x, int y) {
		z = x - y;
		System.out.println("The difference between the given numbers is " + z);
	}
}

	class Calculation extends InheritanceEg2 {
	public void multiplication(int x, int y) {
		z = x * y;
		System.out.println("The product of the given numbers is " + z);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10, b = 20;
		Calculation demo = new Calculation();
		demo.addition(a, b);
		demo.Subtraction(a, b);
		demo.multiplication(a, b);
	}
	
}
