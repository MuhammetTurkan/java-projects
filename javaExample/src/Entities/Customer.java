package Entities;

import java.time.LocalDate;

import Abstract.IEntity;

public class Customer implements IEntity{
	public int id;
	public String firstName;
	public String lastName;
	public int dateOfBirth;
	public String natipnalityId;
	
	
	
	public Customer(int id, String firstName, String lastName, int dateOfBirth, String natipnalityId) {
		
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.natipnalityId = natipnalityId;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(int dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getNatipnalityId() {
		return natipnalityId;
	}
	public void setNatipnalityId(String natipnalityId) {
		this.natipnalityId = natipnalityId;
	}
	
	
}
