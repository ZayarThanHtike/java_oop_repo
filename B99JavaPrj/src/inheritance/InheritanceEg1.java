package inheritance;

public class InheritanceEg1 {
	protected String brand= "Ford";

	public void honk() {
		System.out.println("Tuut,tuut");
	}
}

class Car extends InheritanceEg1 {
	private String modelName = "Mustang";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car myCar = new Car();
		myCar.honk();
		System.out.println(myCar.brand + " " + myCar.modelName);
	}

}
