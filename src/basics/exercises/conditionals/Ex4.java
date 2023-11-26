package basics.exercises.conditionals;

public class Ex4 {
	public static void main(String[] args) {
		// create two `int` variables. Assign them values
		// create an `if` statement which compares whether one value is greater than the other
		// print something to the console if the condition is met
		// create an `else` statement which prints to the console if the above condition is NOT met

		int firstNumber = 14;
		int secondNumber = 6;
		if (firstNumber < secondNumber) {
			System.out.println(firstNumber + " is less than " + secondNumber);
		} else {
			System.out.println(firstNumber + " is not less than " + secondNumber);
		}
	}
}
