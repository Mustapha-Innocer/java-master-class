package exercises.methods;

public class Ex8 {
	public static void main(String[] args) {
		String sentence = "hello world";
		System.out.println(wordCount(sentence));
	}

	public static String wordCount(String string) {
		String[] words = string.split(" ");
		return "The sentence contains %d words".formatted(words.length);
	}
}
