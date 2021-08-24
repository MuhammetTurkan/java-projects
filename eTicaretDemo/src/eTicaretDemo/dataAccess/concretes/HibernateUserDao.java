package eTicaretDemo.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import eTicaretDemo.dataAccess.abstracts.UserDao;
import eTicaretDemo.entities.concretes.User;

public class HibernateUserDao implements UserDao{
	
	List<User> users = new ArrayList<User>();
	@Override
	public void signIn(User user) {
		System.out.println("You have successfully registered. Welcome : "+user.getFirstName()+ " " +user.getLastName());
		users.add(user);
	}

	@Override
	public void logIn(User user) {
		System.out.println("You have successfully logged in. Welcome :"+user.getFirstName()+ " " +user.getLastName());		
	}
	
	@Override
	public List<User> getAll(){
		return this.users;
		
	}

	@Override
	public boolean getEmail(User user) {
		for(User thisUser: users) {
			if(thisUser.geteMail()==user.geteMail()) {
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean getPassword(User user) {
		for(User thisUser: users) {
			if(thisUser.geteMail() == user.geteMail()) {
				return true;
			}
		}
		return false;
	}
}
