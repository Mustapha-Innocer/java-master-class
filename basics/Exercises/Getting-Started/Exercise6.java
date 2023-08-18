public class Exercise6 {
	public static void main(String[] args) {
		// Write a program that transform "amigoscode" to "Amigoscode"
		String name = "amigoscode";
		String result = name.substring(0, 1).toUpperCase() + name.substring(1);

		System.out.println(result);
	}
}
