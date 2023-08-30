package interfaceoop;

public class Answer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r = new Rectangle(2.0, 3.0);
		System.out.println("The area of Rectangle " + r.area());
		System.out.println("The Perimeter of Rectangle " + r.perimeter());

		Circle c = new Circle(12.0);
		System.out.println("The area of Circle " + c.area());
		System.out.println("The Perimeter of Circle " + c.perimeter());

		Triangle tri = new Triangle(5, 12, 13);
		System.out.println("The Area of Triangle " + tri.area());
		System.out.println("The Perimeter of Triangle " + tri.perimeter());
	}

}
