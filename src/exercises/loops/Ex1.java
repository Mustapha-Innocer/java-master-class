import java.util.Arrays;

public class Ex1 {
	public static void main(String[] args) {
		// declare an empty integer array of length = 3
    	// print the contents to the console
		int[] numbers = new int[3];
		System.out.println(Arrays.toString(numbers));

		// fill it with the number `4`
    	// print the array to the console
		for (int i=0; i<3; i++) {
			numbers[i] = 4;
		}
		System.out.println(Arrays.toString(numbers));

		// reassign the second value in the array to the number `17` 
    	// print the array to the console
		numbers[1] = 17;
		System.out.println(Arrays.toString(numbers));

	}
}
