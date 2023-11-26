package basics.exercises.conditionals;

public class Ex2 {
	public static void main(String[] args) {
		// create a string variable
		// create a second string variable which has the same value as the first
		// create an `if` statement which compares the two variables and prints to the
		// console if they are equal

		String wordOne = "good";
		String wordTwo = "good";
		System.out.println(wordOne==wordTwo); // True


		// create an string variable using the `new` keyword
		// create a second string variable which has the same value as the first, again using the `new` keyword
		// create an `if` statement which compares the two variables and prints to the console if they are equal

		String objWordOne = new String("good");
		String objWordTwo = new String("good");
		System.out.println(objWordOne==objWordTwo); // False
		System.out.println(objWordOne.equals(objWordTwo)); // True

	}
}
