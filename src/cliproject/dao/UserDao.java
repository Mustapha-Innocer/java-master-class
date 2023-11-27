package cliproject.dao;

import cliproject.interfaces.IUserDao;
import cliproject.models.User;

public class UserDao implements IUserDao {
	private User[] users = {
			new User("Mustapha"),
			new User("Charles"),
			new User("John"),
			new User("James")
	};

	@Override
	public User[] getAllUsers() {
		return users;
	}
}
