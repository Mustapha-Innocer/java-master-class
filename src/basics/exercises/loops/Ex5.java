import java.util.Arrays;

public class Ex5 {
	public static void main(String[] args) {
		 // declare and initialize a String array which holds the values "a", "b", "c" and "d"
    	// print the array to the console
		String[] stringArr = {"a", "b", "c", "d"};
		System.out.println(Arrays.toString(stringArr));

		// using your answer from Q5 above, create a second array which is initialized using your original array
		// hint: instead of using the `new` keyword, try simply giving the name of your original array
		// change the value at index 0 of the new array to "z"
		// print both of your arrays and compare
		String[] stringArrCopy = stringArr;
		stringArrCopy[0] = "z";
		System.out.println("Original: " + Arrays.toString(stringArr));
		System.out.println("Copy: " + Arrays.toString(stringArrCopy));

		// using your answer to Q6, 
		// create another array which is A COPY off of your original array 
		// (using the `Arrays.copyOf()` method)
		// NOTE that the `.copyOf()` method accepts two arguments, 
		// first being the array that's being copied and second being the length of the new array
		// change the value at index 0 of the new array to "z"
		// print both of the arrays and compare
		String[] stringArrCopy2 = Arrays.copyOf(stringArr, stringArr.length);
		stringArrCopy2[0] = "x";
		System.out.println("Original: " + Arrays.toString(stringArr));
		System.out.println("Copy: " + Arrays.toString(stringArrCopy2));

	}
}
