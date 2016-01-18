package week0;

public class BonusTask {
	public static void main(String[] args) {
		int[] Arr = new int[] { 1, 2, 3, 4, 5 };
		int index = 3;
		long result = 1;
		for (int i = 0; i < Arr.length; i++) {
			if (i != index) {
				result *= Arr[i];
			} 
		}
		System.out.println(result);
		
	}
}
