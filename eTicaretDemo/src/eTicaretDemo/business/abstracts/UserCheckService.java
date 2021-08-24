package eTicaretDemo.business.abstracts;

import eTicaretDemo.entities.concretes.User;

public interface UserCheckService {
	boolean checkName(User user);
	boolean checkPassword(User user);
	boolean checkEmail(User user);
	boolean checkUniqueEmail(User user);
	boolean allCheck(User user);
}
