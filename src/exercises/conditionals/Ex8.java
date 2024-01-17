package exercises.conditionals;

public class Ex8 {
	public static void main(String[] args) {
		String name = "mustapha";

		for (int idx = 0; idx < name.length(); idx++) {
			if (name.charAt(idx) == 't') {
				System.out.println("String contains t");
			}
		}
	}
}
