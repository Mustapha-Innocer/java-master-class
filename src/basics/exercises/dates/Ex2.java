package basics.exercises.dates;

import java.time.LocalDate;
import java.time.Month;

public class Ex2 {
	public static void main(String[] args) {
		Month month = Month.MARCH;
		LocalDate dateOfBirth = LocalDate.of(1987, month, 5);
		System.out.println(dateOfBirth);
		System.out.println(dateOfBirth.plusDays(100));
	}
}
