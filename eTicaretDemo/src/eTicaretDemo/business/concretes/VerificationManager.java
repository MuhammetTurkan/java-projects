package eTicaretDemo.business.concretes;

import java.util.ArrayList;
import java.util.List;

import eTicaretDemo.business.abstracts.VerificationService;
import eTicaretDemo.entities.concretes.User;

public class VerificationManager implements VerificationService{
	List<String> emails =new ArrayList<String>();
	@Override
	public void confrimMail(User user) {
		System.out.println("A confirmation message was sent to "+ user.geteMail());
		verifyMail(user);
	}

	@Override
	public void verifyMail(User user) {
		emails.add(user.geteMail());
		
	}

	@Override
	public boolean isVerificated(User user) {
		if(emails.contains(user.geteMail())) {
			return true;
		}
		return false;
	}

}
