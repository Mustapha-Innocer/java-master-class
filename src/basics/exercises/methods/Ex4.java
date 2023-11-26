package basics.exercises.methods;

public class Ex4 {
	public static void main(String[] args) {
		System.out.println(compareNum(7, 9));
	}

	public static String compareNum(int num1, int num2) {
		if (num1 > num2) {
			return "The first number is larger";
		}else if (num1 < num2) {
			return "The second number is larger";
		}else {
			return "The numbers are equal";
		}
	}
}
