package cliproject;

import java.util.List;
import java.util.Scanner;

import cliproject.dao.CarDao;
import cliproject.dao.UserDao;
import cliproject.models.Book;
import cliproject.models.Car;
import cliproject.models.User;
import cliproject.services.BookingService;
import cliproject.services.UserService;

public class Main {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		CarDao carDao = new CarDao();
		UserDao userDao = new UserDao();
		UserService userService = new UserService();
		BookingService bookingService = new BookingService(userService);
		User user = userDao.getUser();

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
				// Book Car
				Car car = carDao.removeCar();
				Book book = bookingService.createBooking(user, car);
				System.out.println(book);

			} else if (selection == 2) {
				// View All User Booked Cars
				System.out.println(user.getCars());

			} else if (selection == 3) {
				// View All Bookings
				List<Book> bookings = bookingService.getAllBookings();
				System.out.println(bookings);

			} else if (selection == 4) {
				// View Available Cars
				List<Car> availableCars = carDao.getAllCars();
				System.out.println(availableCars);

			} else if (selection == 5) {
				// View Available Electric Cars
				List<Car> electricCars = carDao.getAvailableElectricCars();
				System.out.println(electricCars);

			} else if (selection == 6) {
				// View all users
				System.out.println(userDao.getAllUsers());

			} else if (selection == 7) {
				// Exit
				break;
			}
			System.out.println();
		}
		scanner.close();
	}
}
