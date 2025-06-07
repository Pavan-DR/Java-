package program;

public class extract {
	public static void main(String[] args) {
		String test = "abcXY123XYijk";
		String word = "XY";
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < test.length(); i++) {
			if (test.startsWith(word, i)) {
				if (i > 0) {
					result.append(test.charAt(i - 1));
				}
				if (i + word.length() < test.length()) {
					result.append(test.charAt(i + word.length()));
				}
			}
		}
		System.out.println("Result:" + result.toString());
	}

}
