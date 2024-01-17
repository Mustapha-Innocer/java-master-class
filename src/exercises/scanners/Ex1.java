package exercises.scanners;

import java.util.Scanner;

public class Ex1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter: ");
		String input = scanner.nextLine();
		scanner.close();

		System.out.println(input.toUpperCase());
	}
}
