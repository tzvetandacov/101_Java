package week0;

import java.util.Scanner;

public class LargestPalUpToN {
	public static boolean isPalindrome(int x){
		return LargestPalUpToN.getReverseInt(x)== x;
	}
	  public static int getReverseInt(int value) {
		    int resultNumber = 0;
		    for (int i = value; i !=0; i /= 10) {
		        resultNumber = resultNumber * 10 + i % 10;
		    }
		    return resultNumber;        
		}
	  
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Enter n: ");
	int n = input.nextInt();
	input.close();
	for (int i = n; i >= 0; i--) {
		if(LargestPalUpToN.isPalindrome(n)){
			System.out.println(n);
			break;
		}n--;
	}
}

}
