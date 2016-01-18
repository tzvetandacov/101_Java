package week0;

import java.util.Scanner;

public class Task23 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter sequense to search in: ");
		String seq = input.nextLine();
		System.out.println("Enter searched word: ");
		String searched = input.nextLine();
		input.close();
		short counter = 0;
		for (int i = 0; i < seq.length(); i++) {
			String temp = new String();
			if(seq.charAt(i) == searched.charAt(0) && (seq.length() - i) >= searched.length()){
				for (int j = 0; j < searched.length(); j++) {
					temp += seq.charAt(i + j);
				}
			}if( temp.equals(searched)){
				counter++;
			}
			
		}System.out.println(counter);

	}

}
