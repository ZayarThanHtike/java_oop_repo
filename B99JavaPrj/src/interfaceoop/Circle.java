package interfaceoop;

public class Circle implements Shape {

	private double radius;

	public Circle(double radius) {
		this.radius = radius;

	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return Math.PI * radius * radius;
	}

	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		return 2.0 * Math.PI * radius;
	}

}
