package basics.exercises.dates;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Ex1 {
	public static void main(String[] args) {
		LocalDateTime localDateTime = LocalDateTime.now();

		DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		DateTimeFormatter timeFormat = DateTimeFormatter.ofPattern("HH:mm:ss");
		
		System.out.println(localDateTime.format(dateFormat));
		System.out.println(localDateTime.format(timeFormat));


	}
}
