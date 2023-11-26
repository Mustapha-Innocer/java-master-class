package basics.exercises.arraysconsandmeths;

public class Ex1 {
	public static void main(String[] args) {
		String rString = reverseString("mustapha");
		System.out.println(rString);	
	}

	static String reverseString(String string) {
		if (string==null || string.isEmpty()) {
			return string;
		}

		char[] arr = string.toCharArray();

		int start = 0;
		int end = arr.length - 1;
		while (start < end) {
			char temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;

			start++;
			end--;
		}
		String result = "";
		for (char c: arr) {
			result += c;
		}
		
		return result;
	}
}
