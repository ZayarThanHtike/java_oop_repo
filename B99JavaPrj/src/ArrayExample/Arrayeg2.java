package ArrayExample;

public class Arrayeg2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		int above_average = 0, below_average = 0;
		int[] Students_Height = { 175, 167, 160, 164, 183, 187, 188, 179, 176, 175, 169, 175, 176, 178, 165 };
		for (int i = 0; i < Students_Height.length; i++) {
			sum += Students_Height[i];
		}
		int avg = sum / Students_Height.length;
		System.out.println("Total = " + sum);
		System.out.println("Average = " + avg);

		for (int i = 0; i < Students_Height.length; i++) {
			if (Students_Height[i] > avg)
				above_average++;
			else if (Students_Height[i] < avg)
				;
			below_average++;
		}
		System.out.println("Above Average " + above_average);
		System.out.println("Below Average " + below_average);

		int max = Students_Height[0];
		int min = Students_Height[0];
		for (int i = 1; i < Students_Height.length; i++) {
			if (Students_Height[i] > max)
				max = Students_Height[i];
			else if (Students_Height[i] < min)
				min = Students_Height[i];
		}
		System.out.println("The Shortest height is " + min);
		System.out.println("The Highest height is " + max);
		
		
	}

}
