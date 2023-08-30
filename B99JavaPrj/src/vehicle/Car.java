package vehicle;

public class Car {
	public String name;
	public int age;
	
	public Car() {
		//when this super key is used,this constructor is called.
	}
	
	public void getName(String name,int age) {
		this.name=name;
		this.age=age;
		System.out.println(name+" "+age);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
