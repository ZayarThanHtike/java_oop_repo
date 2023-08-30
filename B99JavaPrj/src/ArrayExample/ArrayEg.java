package ArrayExample;

public class ArrayEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] name = { "Su Su", "min Min", "Tun Tun", "Win Win", "Khin Thu" };
		int[] marks = { 89, 99, 56, 48, 35 };
		for (int i = 0; i < name.length; i++) {
			if (marks[i] >= 50) {
				System.out.println(name[i] + " Pass");
			} else
				System.out.println(name[i] + " Fail");
		}
	}

}
