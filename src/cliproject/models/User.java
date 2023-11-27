package cliproject.models;

import java.util.Arrays;
import java.util.UUID;

public class User {

	private UUID id;
	private String name;
	private Car[] cars;

	public User(String name) {
		id = UUID.randomUUID();
		this.name = name;
		cars = new Car[2];
	}

	public UUID getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Car[] getCars() {
		return cars;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", cars=" + Arrays.toString(cars) + "]";
	}

}
