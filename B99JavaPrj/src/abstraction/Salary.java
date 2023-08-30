package abstraction;

public class Salary extends Employee {
	double salary;

	Salary(String name, String Address, int number, double salary) {
		super(name, Address, number);
		// TODO Auto-generated constructor stub
//		this.salary = salary;
		setSalary(salary);
	}

	public void setSalary(double salary) {
		if (salary >= 0.0) {
			this.salary = salary;
		}
	}

	public double getSalary() {
		return this.salary;
	}

	@Override
	public double computerPay() {
		// TODO Auto-generated method stub
		System.out.println("Employee name " + getName()+" Addess "+getAddress());
		double result = salary / 52;
		return result;
	}

}
