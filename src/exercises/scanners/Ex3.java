package exercises.scanners;

import java.util.Scanner;

public class Ex3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter: ");
		int input = scanner.nextInt();
		scanner.close();

		System.out.println(isPrime(input));
	}

	public static boolean isPrime(int num) {
		if (num == 1)
			return true;

		for (int i = 1; i < (num / 2 + 1); i++) {
			if (i != 1 && num % i == 0 && i != num) {
				return false;
			}
		}
		return true;
	}
}
