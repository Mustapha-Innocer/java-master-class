package cliproject.interfaces;

import java.util.List;

import cliproject.models.Book;
import cliproject.models.Car;
import cliproject.models.User;

public interface IBookingService {
	Book createBooking(User user, Car car);

	List<Book> getAllBookings();
}
