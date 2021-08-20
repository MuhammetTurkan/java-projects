package Concrete;

import java.rmi.RemoteException;

import Abstract.BaseCustomerManager;
import Abstract.ICustomerCheckService;
import Entities.Customer;

public class StarbuckCustomerManager extends BaseCustomerManager{
	public ICustomerCheckService customerCheckService;

	public StarbuckCustomerManager(ICustomerCheckService customerCheckService) {
		
		this.customerCheckService = customerCheckService;
	}
	
	
	@Override
	public void save (Customer customer) throws NumberFormatException, RemoteException{
		if (customerCheckService.checkIfRealPerson(customer)) {
			super.save(customer);
		}
		else {
			System.out.println("Not a valid person.");
		}
	}
	
	
}
