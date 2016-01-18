package week0;

public class W02T21LongestSubsequense {
	public static void main(String[] args) {
		int[] sequence = { 1, 2, 3, 5, 7, 6, 7, 8, 4, 3, 2, 5, 6, 5, 63, 6, 7,
				8 };
		int finalCounter = 1;
		for (int i = 0; i < sequence.length - 1; i++) {
			int currentSeq = 1;
			for (int j = i + 1; j < sequence.length; j++) {
				if (sequence[j] >= sequence[j - 1]) {
					currentSeq++;
				} else {
					break;
				}
			}
			if (finalCounter < currentSeq) {
				finalCounter = currentSeq;
			}
		}
		System.out.println(sequence[13]);
		System.out.println(finalCounter);

	}
}
