package basics.exercises.dates;

import java.time.LocalDate;

public class Ex4 {
	public static void main(String[] args) {
		LocalDate dateOfBirth = LocalDate.of(1984, 11, 7);
		System.out.println(ageCal(dateOfBirth));
	}

	public static int ageCal(LocalDate dateOfBirth) {
		LocalDate currenDate = LocalDate.now();
		return currenDate.getYear() - dateOfBirth.getYear();
	}
}
