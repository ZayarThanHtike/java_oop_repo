package oopinheritance;

public class SpecialAccount extends Account {

	public SpecialAccount(String name, double withdraw) {
		super(name);
		this.wihdraw = withdraw;
	}

	public void getResult() {
		System.out.println("Username: " + this.name);
		System.out.println("Total Amount: " + getAmount());
		System.out.println("Withdraw Amount: " + this.wihdraw);
		System.out.println("Remaining Amount: " + (getAmount() - this.wihdraw));
	}

	public static void main(String[] args) {
		SpecialAccount sa = new SpecialAccount("Mg Mg", 300);
		sa.setAmount(3000);
		sa.getResult();
	}

}
