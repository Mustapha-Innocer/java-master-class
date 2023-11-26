package basics.exercises.arraysconsandmeths;

public class Ex3 {
	public static void main(String[] args) {
		String[] string = {};
		System.out.println(longestString(string));

		String[] words = {"hello", "bingo", "ola", "bye", "ciao"};
		System.out.println(longestString(words));
	}

	public static String longestString(String[] strings) {
		if (strings==null || strings.length==0) {
			return "";
		}

		String longest = "";
		int maxLength = 0;

		for (String str: strings) {
			if (maxLength < str.length()) {
				longest = str;
				maxLength = str.length();
			} else if (maxLength==str.length() && !longest.contains(str)) {
				longest = longest + ", " + str;
			}
		}

		return longest;
	}
}
