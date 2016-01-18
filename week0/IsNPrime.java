package week0;
import java.util.Scanner;
public class IsNPrime {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number: ");
		int n = input.nextInt();
		input.close();
		boolean isPrime = true;
		
		for (int i = 2; i < n; i++) {
			if(n % i == 0){
				isPrime = false;
				break;
			
			}
		}if(! isPrime){
			System.out.println("Not prime");
		}else{
			System.out.println("Prime");
		}

	}

}
