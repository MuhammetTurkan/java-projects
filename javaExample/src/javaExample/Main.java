package javaExample;

import java.rmi.RemoteException;

import Abstract.BaseCustomerManager;
import Adapters.MernisServiceAdapters;
import Concrete.NeroCustomerManager;
import Concrete.StarbuckCustomerManager;
import Entities.Customer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, RemoteException {
		BaseCustomerManager customerManager = new StarbuckCustomerManager(new MernisServiceAdapters());
		
		// In the example given below, the national id number is not real.
		// You can try by entering your own information.
		
		customerManager.save(new Customer(1,"Muhammet","Türkan",1998,"12345678910"));
	}
}
