public class Ex4 {
	public static void main(String[] args) {
		int[] numbers = {1, 2, 3, 4, 5};
		//What happens when you try to re assign index 5 to any integer?
		numbers[5] = 0;
		//java.lang.ArrayIndexOutOfBoundsException
	}
}