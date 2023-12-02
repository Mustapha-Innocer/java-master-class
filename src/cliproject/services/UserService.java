package cliproject.services;

import cliproject.interfaces.IUserService;
import cliproject.models.Car;
import cliproject.models.User;

public class UserService implements IUserService {

	@Override
	public void addCar(User user, Car car) {
		user.getCars().add(car);
	}
}
