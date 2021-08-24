package eTicaretDemo.business.abstracts;

import eTicaretDemo.entities.concretes.User;

public interface UserService {
	void signIn(User user);
	void logIn(User user);
}
