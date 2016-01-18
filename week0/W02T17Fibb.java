package week0;

import java.util.Scanner;

public class W02T17Fibb {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter n: ");
		int n = input.nextInt();
		input.close();
		String result = "11";
		int prelast = 1;
		int last = 1;
		for (int i = 2; i < n; i++) {
			int intResult = prelast + last;
			result += String.valueOf(intResult);
			prelast = last;
			last = intResult;

		}
		if (n == 1) {
			System.out.println(1);
		} else if (n == 2) {
			System.out.println(11);
		} else {

			System.out.println(result.toString());

		}
	}

}
