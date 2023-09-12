package com.edwin.angSpring.pizzastore.service.items;

import java.util.List;

import com.edwin.angSpring.pizzastore.model.items.CalculateDiscount;
import com.edwin.angSpring.pizzastore.model.items.Drinks;
import com.edwin.angSpring.pizzastore.model.items.Pizza;
import com.edwin.angSpring.pizzastore.model.items.Sides;
import com.edwin.angSpring.pizzastore.model.view.AllItems;

public interface GetService {

	List<Pizza> getAllPizza();
	List<Sides> getAllSides();
	List<Drinks> getAllDrinks();
	Pizza getAPizza(long id);
	Sides getASide(long id);
	Drinks getADrink(long id);
	AllItems getAll();
}
