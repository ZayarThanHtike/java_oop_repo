package oopinheritance;

public class Account {

	String name;
	private double amount;
	protected double wihdraw;

	protected Account() {
		System.out.println("Constuctor without param");
	}

	protected Account(String name) {
		System.out.println("Constructor with param");
		this.name = name;
	}

	protected void setAmount(double amount) {
		if (amount > 0.0) {
			this.amount = amount;
		}
	}

	protected double getAmount() {
		return this.amount;
	}
}
