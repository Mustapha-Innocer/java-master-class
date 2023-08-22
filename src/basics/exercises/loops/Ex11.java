public class Ex11 {
	public static void main(String[] args) {
		// create an array of n numbers
		// create a sum variable
		// create a loop
		// add each item to the sum value
		// outside the loop print the total sum

		int[] numbers = {10,20,5,2};
		int total = 0;
		for(int num: numbers) {
			total += num;
		}
		System.out.println("Total: " + total);

	}
}
