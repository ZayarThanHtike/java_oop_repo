package searchingandsorting;

import java.util.Scanner;

public class ElectronicSystem {
	static Scanner scan = new Scanner(System.in);
	static Items[] I;

	public ElectronicSystem() {
		I = new Items[5];
		Items i1 = new Items("TV", 7000.00, 20);
		Items i2 = new Items("Remote", 2000.00, 10);
		Items i3 = new Items("Phone", 122000.00, 50);
		Items i4 = new Items("Iron", 1500000.00, 6);
		Items i5 = new Items("Oven", 672000.00, 13);

		I[0] = i1;
		I[1] = i2;
		I[2] = i3;
		I[3] = i4;
		I[4] = i5;
	}

	public void WelcomePage() {
		System.out.println("Welcome from Electronic System");
		System.out.println("1. View sell item list");
		System.out.println("2. Search item list by item name");
		System.out.println("Choose Option");
		int option = scan.nextInt();

		switch (option) {
		case 1:
			ViewSellItem();
			break;
		case 2:
			SearchItem();
			break;
		default: {
			System.out.println("Wrong Input");
			WelcomePage();

		}
		}
	}

	public void ViewSellItem() {
		System.out.println("Item Name   Price   Quantity");
		for (Items i : I) {
			System.out.println(i.getItemName() + " " + i.getPrice() + " " + i.getQty());
		}
	}

	public void SearchItem() {
		scan.nextLine();
		System.out.println("Enter Search Key Item Name");
		String SIname = scan.nextLine();
		int i;
		for (i = 0; i < I.length; i++) {
			if (SIname.equalsIgnoreCase(I[i].getItemName())) {
				System.out.println(I[i].getItemName()+" "+I[i].getPrice()+" "+I[i].getQty());
				break;
			}
				
		}
		if(i==I.length) {
			System.out.println(SIname+"is not found");
		}
	}

}
