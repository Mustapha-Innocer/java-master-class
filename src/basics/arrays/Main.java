import java.util.Arrays;

public class Main {
	public static void main (String[] args) {
		// Declarations: type[] name = new type[length]
		int[] arr0 = new int[2];
		arr0[0] = 1;
		arr0[1] = 2;

		int[] arr1 = {3,4,5};

		System.out.println(Arrays.toString(arr0));
		System.out.println(Arrays.toString(arr1));

	}
}