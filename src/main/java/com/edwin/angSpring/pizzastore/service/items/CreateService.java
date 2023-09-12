package com.edwin.angSpring.pizzastore.service.items;

import com.edwin.angSpring.pizzastore.model.items.Drinks;
import com.edwin.angSpring.pizzastore.model.items.Pizza;
import com.edwin.angSpring.pizzastore.model.items.Sides;

public interface CreateService {
	Pizza addPizza(Pizza pizza);
	Sides addSides(Sides sides );
	Drinks addDrinks(Drinks drinks);
	
	Pizza deletePizza(long id);
	Sides deleteSides(long id);
	Drinks deleteDrinks(long id);
}
