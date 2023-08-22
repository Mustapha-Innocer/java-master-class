import java.util.Arrays;

public class Ex12 {
	public static void main(String[] args) {
		// create a for loop which goes through each string in our array
		// make each word uppercase
		// assign the value in the array to the uppercase string
		// print our resulting array

		String[] words = {"i", "sure", "do", "love", "bees"};
		for (int i=0; i<words.length; i++) {
			words[i] = words[i].toUpperCase();
		}
		System.out.println(Arrays.toString(words));
	}
}
