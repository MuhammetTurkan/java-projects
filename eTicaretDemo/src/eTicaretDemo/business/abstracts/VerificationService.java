package eTicaretDemo.business.abstracts;


import eTicaretDemo.entities.concretes.User;

public interface VerificationService {
	void confrimMail(User user);
	void verifyMail(User user);
	boolean isVerificated(User user);
}
