package week0;

import java.util.Scanner;

public class MinElement {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the lenght of the Array: ");
		int len = input.nextInt();
		int[] Arr = new int[len];
		for (int i = 0; i < len; i++) {
			System.out.println("Enter element " + (i + 1));
			Arr[i] = input.nextInt();
		}
		input.close();
		int min = Arr[0];
		for (int j = 0; j < Arr.length; j++) {

			if (Arr[j] < min) {
				min = Arr[j];
			}
		}System.out.println("The min element is " + min);
	}

}
