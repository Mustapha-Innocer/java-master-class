package basics.exercises.arraysconsandmeths;

public class Ex2 {
	public static void main(String[] args) {
		String input = "   amig os cod e  ";
		String result = stringWhitespaceRemoval(input);
		System.out.println(result);
	}

	public static String stringWhitespaceRemoval(String string) {
		if (string==null || string.isEmpty()) {
			return string;
		}

		StringBuilder cleaned = new StringBuilder();

		for (int i=0; i<string.length(); i++) {
			if (string.charAt(i) != ' ') {
				cleaned.append(string.charAt(i));
			}
		}

		return cleaned.toString();
	}
}
