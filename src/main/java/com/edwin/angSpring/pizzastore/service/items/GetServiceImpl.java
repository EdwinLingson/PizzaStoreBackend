package com.edwin.angSpring.pizzastore.service.items;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edwin.angSpring.pizzastore.model.items.CalculateDiscount;
import com.edwin.angSpring.pizzastore.model.items.Drinks;
import com.edwin.angSpring.pizzastore.model.items.Pizza;
import com.edwin.angSpring.pizzastore.model.items.Sides;
import com.edwin.angSpring.pizzastore.model.view.AllItems;
import com.edwin.angSpring.pizzastore.repository.items.DrinkRepository;
import com.edwin.angSpring.pizzastore.repository.items.PizzaRepository;
import com.edwin.angSpring.pizzastore.repository.items.SidesRepository;
import com.edwin.angSpring.pizzastore.exception.ResourceNotFoundException;

@Service
public class GetServiceImpl implements GetService {

	@Autowired
	PizzaRepository pizzaRepository;
	@Autowired
	DrinkRepository drinkRepository;
	@Autowired
	SidesRepository sidesRepository;
	
	@Override
	public List<Pizza> getAllPizza() {
		// TODO Auto-generated method stub
		return pizzaRepository.findAll();
	
	}

	@Override
	public List<Sides> getAllSides() {
		
		return sidesRepository.findAll();
	}

	@Override
	public List<Drinks> getAllDrinks() {
		return drinkRepository.findAll();
	}

	@Override
	public AllItems getAll() {
		// TODO Auto-generated method stub
		
		return new AllItems(getAllPizza(),getAllSides(),getAllDrinks());
	}

	@Override
	public Pizza getAPizza(long id) {
		try {
			return pizzaRepository.findById(id).get();
		} catch (Exception e) {
			throw new ResourceNotFoundException("No Pizza Found");
		}
	}

	@Override
	public Sides getASide(long id) {
		try {
			return sidesRepository.findById(id).get();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			return null;
		}
	}

	@Override
	public Drinks getADrink(long id) {
		try {
			return drinkRepository.findById(id).get();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			return null;
		}
	}
	

}
