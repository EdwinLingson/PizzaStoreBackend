package com.edwin.angSpring.pizzastore.repository.users;

import com.edwin.angSpring.pizzastore.model.users.Customer;

public interface CustomerDAO extends UserDAO {

	Customer createUser(Customer csr);
	
	Customer updateUser(Customer csr);
	
	void updateBalance(long id, double amt);
	Customer getCustomerByUname(String uname);
	boolean getUsernameAvail(String uname);
}
