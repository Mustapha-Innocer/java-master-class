package cliproject.dao;

import java.util.List;

import cliproject.interfaces.IUserDao;
import cliproject.models.User;

public class UserDao implements IUserDao {
	private List<User> users;

	public UserDao() {
		users = List.of(
				new User("Mustapha"),
				new User("Charles"),
				new User("John"),
				new User("James"));
	}

	@Override
	public List<User> getAllUsers() {
		return users;
	}

	@Override
	public User getUser() {
		return users.get(0);
	}
}
