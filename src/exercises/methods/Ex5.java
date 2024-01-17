package exercises.methods;

public class Ex5 {
	public static void main(String[] args) {
		System.out.println(capFirstChar("mux"));
	}

	public static String capFirstChar(String string) {
		if (string == null || string == "") {
			return string;
		}
		char[] chars = string.toCharArray();
		chars[0] = Character.toUpperCase(chars[0]);

		String res = "";

		for (char c : chars) {
			res += c;
		}
		return res;
	}

}