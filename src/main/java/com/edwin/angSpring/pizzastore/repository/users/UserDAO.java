package com.edwin.angSpring.pizzastore.repository.users;

import com.edwin.angSpring.pizzastore.model.users.Person;

public interface UserDAO {

	Person getUser(long id);
	Person deleteUser(long id);
}
