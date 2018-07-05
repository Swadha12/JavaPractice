import java.util.Scanner;

public class Abc {

	public static void main(String[] args) {

		int x1 = (int) Math.round(Math.PI * 20.0);
		double y = 4 / 5;
		// System.out.println("boo!") + 7;

		System.out.println(x1 + "  " + y);
		Scanner in = new Scanner(System.in); 
		int x = -1; int sum = 0; 
		while (x != 0) {
			x = in.nextInt(); 
			if (x <= 0) { 
				continue; 
				
				}
			System.out.println("Adding " + x); sum += x; }


		// printTime( hour, minute);
		printLogarithm(y);
		countup(5);
	}

	public static void countup(int n) {
		if (n == 0) {
			System.out.println("Blastoff!");
		} else {
			System.out.println(n);
			countup(n - 1);

		}
	}

	public static void printLogarithm(double x) {
		if (x <= 0.0) {
			System.err.println("Error: x must be positive.");
			return;
		}

		double result = Math.log(x);
		System.out.println("The log of x is " + result);
	}
}
