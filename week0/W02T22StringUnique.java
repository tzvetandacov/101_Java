package week0;

public class W02T22StringUnique {
	public static void main(String[] args) {
		String[] words = { "sharlot", "hallo", "hallo", "death", "sharlot",
				"metal", "death", "death" };
		int counter = 0;
		for (int i = 0; i < words.length; i++) {
			boolean isUnique = true;
			for (int j = i + 1; j < words.length; j++) {
				if (words[i].equals(words[j])) {
					isUnique = false;
				}
			}
			if (isUnique) {
				counter++;
			}

		}
		System.out.println(counter);
	}
}
