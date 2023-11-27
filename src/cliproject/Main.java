package cliproject;

import java.util.Scanner;

import cliproject.dao.BookingDao;
import cliproject.dao.UserDao;
import cliproject.models.Car;
import cliproject.models.User;

public class Main {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		UserDao userService = new UserDao();
		BookingDao bookingService = new BookingDao();

		while (true) {
			System.out.println(
					"1. Book Car\n" +
							"2. View All User Booked Cars\n" +
							"3. View All Bookings\n" +
							"4. View Available Cars\n" +
							"5. View Available Electric Cars\n" +
							"6. View all users\n" +
							"7. Exit");

			System.out.print("Enter: ");
			int selection = scanner.nextInt();
			if (selection == 1) {
				// List the users in the system
				User[] users = userService.getAllUsers();
				System.out.println("********** USERS **********");
				for (User user : users) {
					System.out.println(user);
				}

				// List available cars for booking.
				Car[] cars = bookingService.getAllCars();
				System.out.println("\n********** CARS **********");
				for (Car car : cars) {
					System.out.println(car);
				}

			} else if (selection == 7) {
				break;
			}
			System.out.println();
		}
		scanner.close();
	}
}
