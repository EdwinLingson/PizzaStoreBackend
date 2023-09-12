package com.edwin.angSpring.pizzastore.service.items;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edwin.angSpring.pizzastore.model.items.Drinks;
import com.edwin.angSpring.pizzastore.model.items.Pizza;
import com.edwin.angSpring.pizzastore.model.items.Sides;
import com.edwin.angSpring.pizzastore.repository.items.DrinkRepository;
import com.edwin.angSpring.pizzastore.repository.items.PizzaRepository;
import com.edwin.angSpring.pizzastore.repository.items.SidesRepository;

import jakarta.transaction.Transactional;

@Service
public class CreateServiceImpl implements CreateService {

	@Autowired
	PizzaRepository pizzaRepository;
	@Autowired
	DrinkRepository drinkRepository;
	@Autowired
	SidesRepository sidesRepository;
	@Transactional
	@Override
	public Pizza addPizza(Pizza pizza) {
		pizza.calculateDiscount();
		return pizzaRepository.save(pizza);
	}
	@Transactional
	@Override
	public Sides addSides(Sides sides) {
		sides.calculateDiscount();
		return sidesRepository.save(sides);
	}
	@Transactional
	@Override
	public Drinks addDrinks(Drinks drinks) {
		drinks.calculateDiscount();
		return drinkRepository.save(drinks);
	}
	
	@Transactional
	@Override
	public Pizza deletePizza(long id) {
		System.out.println("Pizza "+id);
		Pizza pizza = pizzaRepository.findById(id).get();
		pizzaRepository.delete(pizza);
		return pizza;
	}
	
	@Transactional
	@Override
	public Sides deleteSides(long id) {
		System.out.println("Sides "+id);
		Sides sides = sidesRepository.findById(id).get();
		sidesRepository.delete(sides);
		return sides;
	}
	
	@Transactional
	@Override
	public Drinks deleteDrinks(long id) {
		System.out.println("Drinks "+id);
		Drinks drinks = drinkRepository.findById(id).get();
		drinkRepository.delete(drinks);
		return drinks;
	}
	
	

}
