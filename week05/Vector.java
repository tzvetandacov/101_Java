package week05;

import java.util.Scanner;

public class Vector<Point> {
	
	int[] dimensions;

	public Vector(int n) {
		this.dimensions = new int[n];
		Scanner input = new Scanner(System.in);
		for (int i = 0; i < dimensions.length; i++) {
			dimensions[i] = input.nextInt();
		}
		input.close();
	}
}
