package Adapters;

import java.rmi.RemoteException;

import Abstract.ICustomerCheckService;
import Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapters implements ICustomerCheckService{
		KPSPublicSoapProxy kpsPublic = new KPSPublicSoapProxy();
		
		@Override
		public boolean checkIfRealPerson(Customer customer) throws NumberFormatException, RemoteException {
			
			boolean result = kpsPublic.TCKimlikNoDogrula(Long.parseLong(customer.natipnalityId), customer.getFirstName().toUpperCase(), customer.getLastName().toUpperCase(), customer.getDateOfBirth());
			
			return result;
		}
	}


