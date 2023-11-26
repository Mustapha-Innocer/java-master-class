package cliproject.user;

public class UserService {
	private User[] users = {
		new User("Mustapha"),
		new User("Charles"),
		new User("John"),
		new User("James")
	};

	public User[] getAllUsers() {
		return users;
	}
}
