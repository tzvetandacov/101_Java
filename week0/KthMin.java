package week0;
import java.util.Arrays;
import java.util.Scanner;
public class KthMin {
	
	public static void main(String[] args) {
		int[] Arr = new int[]{4,2,6,5,25,14,86};
		Arrays.sort(Arr);
		for (int i = 0; i < Arr.length; i++) {
			System.out.println(Arr[i]);
		}Scanner input = new Scanner(System.in);
		System.out.println("Enter the kth element: ");
		int k = input.nextInt();
		input.close();
		System.out.println("The kth min element in the array is " + Arr[k -1]);
	}
}
