package cliproject.services;

import java.util.ArrayList;
import java.util.List;

import cliproject.interfaces.IBookingService;
import cliproject.models.Book;
import cliproject.models.Car;
import cliproject.models.User;

public class BookingService implements IBookingService {
	private UserService userService;
	private List<Book> bookings;

	public BookingService(UserService userService) {
		this.userService = userService;
		this.bookings = new ArrayList<>();
	}

	@Override
	public Book createBooking(User user, Car car) {
		Book book = new Book(car, true);
		bookings.add(book);
		userService.addCar(user, car);
		return book;
	}

	@Override
	public List<Book> getAllBookings() {
		return bookings;
	}

}
