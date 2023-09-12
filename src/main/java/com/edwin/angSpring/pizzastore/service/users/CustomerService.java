package com.edwin.angSpring.pizzastore.service.users;

import com.edwin.angSpring.pizzastore.model.users.Customer;
import com.edwin.angSpring.pizzastore.model.view.UserAuth;

public interface CustomerService {

	
	Customer getCustomerbyUsername(String uname);
	UserAuth authenticate(Customer csr);
	
	boolean possibleuserName(String uname);
	
	Customer createCustomer(Customer csr);
	Customer editCustomer(Customer csr);
	void deleteteCustomer(long id);
	
	Customer addBalance(Customer csr);
	Customer getCustomerDetails(long id);

	
}
