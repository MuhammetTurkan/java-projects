package eTicaretDemo.core.concretes;

import eTicaretDemo.GoogleAccount.GoogleAccountManager;
import eTicaretDemo.core.abstracts.GoogleAccountService;

public class GoogleAccountManagerAdapter implements GoogleAccountService{

	@Override
	public void signInToGoogle(String message) {
		GoogleAccountManager googleManager = new GoogleAccountManager();
		googleManager.signIn(message);
		
	}

	@Override
	public void logInToGoogle(String message) {
		GoogleAccountManager googleManager = new GoogleAccountManager();
		googleManager.logIn(message);		
	}

}
