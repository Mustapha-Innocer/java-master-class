import java.util.Arrays;

public class Ex13 {
	public static void main(String[] args) {
		// create a for loop which goes through each string in our array
		// grab the first letter of our word
		// capitalise the first letter
		// add the capitalised letter to the rest of the provided word
		// assign the value to an array
		// print our resulting array
		String[] words = {"i", "sure", "do", "love", "bees"};
		for (int i=0; i<words.length; i++) {
			// words[i] = words[i].substring(0, 1).toUpperCase() + words[i].substring((1));
			words[i] = Character.toUpperCase(words[i].charAt(0)) + words[i].substring((1));
		}
		System.out.println(Arrays.toString(words));
	}
}
