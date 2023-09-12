package com.edwin.angSpring.pizzastore.service.users;

import com.edwin.angSpring.pizzastore.model.users.Manager;
import com.edwin.angSpring.pizzastore.model.view.UserAuth;

public interface ManagerService {

	Manager getManagerbyUsername(String uname);
	UserAuth authenticate(Manager mgr);
	
	public boolean possibleuserName(String uname);
	
	Manager createManager(Manager mgr);
	Manager editManager(Manager mgr);
	void deleteManager(long id);
	
	void promote(long id);
	void demote(long id);

	Manager getManagerDetails(long id);

}
