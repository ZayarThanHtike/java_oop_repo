package vehicle;

public class Toyota extends Car {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Toyota toyo = new Toyota();
		toyo.ViewGetName();
	}

	public void ViewGetName() {
		super.getName("Aung Aung", 30);
	}
}
