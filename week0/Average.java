package week0;
import java.util.Scanner;
public class Average {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the lenght of the array: ");
		int len = input.nextInt();
		
		int[] Arr = new int[len];
		for (int i = 0; i < len; i++) {
			System.out.println("Enter element " + (i+1));
			Arr[i] = input.nextInt();
			
		}input.close();
		double result = 0;
		for (int i = 0; i < Arr.length; i++) {
			result += Arr[i];
		}System.out.println("The average is " + (result / len));
	}

}
