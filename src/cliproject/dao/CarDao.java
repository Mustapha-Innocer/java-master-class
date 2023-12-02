package cliproject.dao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import cliproject.enums.Color;
import cliproject.enums.Model;
import cliproject.models.Car;

public class CarDao {

	private List<Car> cars;

	public CarDao() {
		cars = new ArrayList<>();
		cars.addAll(Arrays.asList(
				new Car(Model.BENZ, false, Color.ASH),
				new Car(Model.BMW, true, Color.BLUE),
				new Car(Model.TESLA, true, Color.BLACK),
				new Car(Model.TOYOTA, false, Color.GREEN),
				new Car(Model.BENZ, false, Color.RED)));
	}

	public List<Car> getAllCars() {
		return cars;
	}

	public Car removeCar() {
		return cars.remove(cars.size() - 1);
	}

	public List<Car> getAvailableElectricCars() {
		return cars.stream()
				   .filter(car -> car.isElectric()).toList();
	}
}
