package week0;

import java.util.Scanner;

public class SmallestMultiple {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter upperBound: ");
		int upperBound = input.nextInt();
		input.close();
		long smallest = 2;
		for (int i = 1; i <= smallest; i++) {
			for (int j = 2; j <= upperBound; j++) {
				if(smallest % j != 0){
					smallest++;
				}
			}

		}
		System.out.println(smallest);
	}
}
