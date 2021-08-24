package eTicaretDemo.business.concretes;

import eTicaretDemo.business.abstracts.UserCheckService;
import eTicaretDemo.business.abstracts.UserService;
import eTicaretDemo.business.abstracts.VerificationService;
import eTicaretDemo.core.abstracts.GoogleAccountService;
import eTicaretDemo.dataAccess.abstracts.UserDao;
import eTicaretDemo.entities.concretes.User;

public class UserManager implements UserService{
	
	UserDao userDao;
	UserCheckService userCheckService;
	VerificationService verificationService;
	GoogleAccountService service;
	public UserManager(UserDao userDao, UserCheckService userCheckService, VerificationService verificationService, GoogleAccountService service) {
		
		this.userDao = userDao;
		this.userCheckService= userCheckService;
		this.verificationService = verificationService;
		this.service=service;
	}

	@Override
	public void signIn(User user) {
		if(userCheckService.allCheck(user)) {
			verificationService.confrimMail(user);
			if(verificationService.isVerificated(user)) {
				userDao.signIn(user);
				service.signInToGoogle(user.getFirstName()+" "+user.getLastName());
			}
		}
		
	}

	@Override
	public void logIn(User user) {
		verificationService.verifyMail(user);
		if ( userDao.getEmail(user) && userDao.getPassword(user) && verificationService.isVerificated(user)) {
			userDao.logIn(user);
			service.logInToGoogle(user.getFirstName()+" "+user.getLastName());
		}
		else {
			System.out.println("Login failed. Please check your information..");
		}
	}

}
