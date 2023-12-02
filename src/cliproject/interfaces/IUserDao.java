package cliproject.interfaces;

import java.util.List;

import cliproject.models.User;

public interface IUserDao {

	List<User> getAllUsers();

	User getUser();
}
