package week0;

import java.util.Scanner;

public class Pow {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Enter a number to be powered: ");
	int number = input.nextInt();
	System.out.println("Enter the power: ");
	int pow = input.nextInt();
	input.close();
	long result = 1;
	for (int i = 0; i < pow; i++) {
		result *= number;
	}System.out.println(result);
}
}
