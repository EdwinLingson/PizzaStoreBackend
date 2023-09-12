package com.edwin.angSpring.pizzastore.repository.users;

import com.edwin.angSpring.pizzastore.model.users.Manager;

public interface ManagerDAO extends UserDAO {

	Manager createUser(Manager mgr);
	
	Manager updateUser(Manager mgr);
	
	void updateBalance(long id, double amt);
	
	Manager getManagerByUname(String uname);
	
	boolean getUsernameAvail(String uname);
	
}
