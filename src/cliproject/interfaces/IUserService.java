package cliproject.interfaces;

import cliproject.models.Car;
import cliproject.models.User;

public interface IUserService {

	void addCar(User user, Car car);
	
}
