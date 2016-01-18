package week0;
import java.util.Scanner;
public class IsOdd {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int x = input.nextInt();
		input.close();
		if(x % 2 == 0){
			System.out.println("The number is even");
		}else{
			System.out.println("The number is Odd");
		}
	}

}
