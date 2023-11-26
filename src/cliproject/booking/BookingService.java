package cliproject.booking;

import cliproject.car.Car;
import cliproject.car.Color;
import cliproject.car.Model;

public class BookingService {
	
	private Car[] cars = {
		new Car(Model.BENZ, false, Color.ASH),
		new Car(Model.BMW, true, Color.BLUE),
		new Car(Model.TESLA, true, Color.BLACK),
		new Car(Model.TOYOTA, false, Color.GREEN),
		new Car(Model.BENZ, false, Color.RED)
	};

	public Car[] getAllCars() {
		return cars;
	}
}
