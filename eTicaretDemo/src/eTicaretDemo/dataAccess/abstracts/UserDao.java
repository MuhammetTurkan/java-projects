package eTicaretDemo.dataAccess.abstracts;

import java.util.List;

import eTicaretDemo.entities.concretes.User;

public interface UserDao {
	void signIn(User user);
	void logIn(User user);
	boolean getEmail(User user);
	boolean getPassword(User user);
	List<User> getAll();
}
