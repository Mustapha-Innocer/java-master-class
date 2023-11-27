package cliproject.dao;

import cliproject.enums.Color;
import cliproject.enums.Model;
import cliproject.models.Car;

public class BookingDao {

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
