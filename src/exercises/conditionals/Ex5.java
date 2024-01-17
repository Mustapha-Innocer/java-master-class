package exercises.conditionals;

public class Ex5 {
	public static void main(String[] args) {
		// create three `int` variables. Assign them values with the first value sitting
		// between the other two
		// create an `if` statement which compares whether the first value is greater
		// than the second AND less than the third
		// print something to the console if the condition is met
		// create an `else` statement which prints to the console if the above condition
		// is NOT met

		int firstNumber = 10;
		int secondNumber = 12;
		int thirdNumber = 6;
		if (firstNumber < secondNumber && firstNumber > thirdNumber) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
	}
}
