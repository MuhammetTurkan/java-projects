package eTicaretDemo.business.concretes;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import eTicaretDemo.business.abstracts.UserCheckService;
import eTicaretDemo.entities.concretes.User;

public class UserCheckManager implements UserCheckService{
	
	List<String> usersEmail = new ArrayList<String>();

	@Override
	public boolean checkName(User user) {
		if(user.getFirstName().length() < 2 || user.getLastName().length() < 2) {
			System.out.println("Name and surname must consist of at least 2 characters. Can not registered.");
			return false;
		}
		return true;
	}

	@Override
	public boolean checkPassword(User user) {
		if(user.getPassword().length()<=5) {
			System.out.println("Password must be at least 6 characters. Can not registered.");
			return false;
		}
		return true;
	}

	@Override
	public boolean checkEmail(User user) {
		String regex = "^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(user.geteMail());
		if(matcher.matches()==false) {
			System.out.println("Invalid email. Can not registered. : "+user.geteMail());
			return false;
		}
		return true;
	}

	@Override
	public boolean checkUniqueEmail(User user) {
		
		if(usersEmail.contains(user.geteMail())) {
			System.out.println("A used email cannot be used again. Can not registered.");
			return false;
		}
		usersEmail.add(user.geteMail());	
		return true;
	}

	@Override
	public boolean allCheck(User user) {
		if(checkName(user) && checkPassword(user) && checkEmail(user) && checkUniqueEmail(user)) {
			
			return true;
		}
		return false;
	}

}
