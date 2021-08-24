package eTicaretDemo;

import eTicaretDemo.business.abstracts.UserService;
import eTicaretDemo.business.concretes.UserCheckManager;
import eTicaretDemo.business.concretes.UserManager;
import eTicaretDemo.business.concretes.VerificationManager;
import eTicaretDemo.core.concretes.GoogleAccountManagerAdapter;
import eTicaretDemo.dataAccess.concretes.HibernateUserDao;
import eTicaretDemo.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		UserService userService = new UserManager(new HibernateUserDao(), new UserCheckManager(),new VerificationManager(), new GoogleAccountManagerAdapter());
		
		User user =new User("Muhammet","Türkan","muhammet.trkn98@gmail.com","123456");
		userService.signIn(user);
		userService.logIn(user);
	}

}
