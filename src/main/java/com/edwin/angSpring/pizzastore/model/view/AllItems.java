package com.edwin.angSpring.pizzastore.model.view;

import java.util.List;

import com.edwin.angSpring.pizzastore.model.items.Drinks;
import com.edwin.angSpring.pizzastore.model.items.Pizza;
import com.edwin.angSpring.pizzastore.model.items.Sides;

public class AllItems {

	private List<Pizza> listOfPizza;
	private List<Sides>listOfSides;
	private List<Drinks>listOfDrinks;
	public List<Pizza> getListOfPizza() {
		return listOfPizza;
	}
	public void setListOfPizza(List<Pizza> listOfPizza) {
		this.listOfPizza = listOfPizza;
	}
	public List<Sides> getListOfSides() {
		return listOfSides;
	}
	public void setListOfSides(List<Sides> listOfSides) {
		this.listOfSides = listOfSides;
	}
	public List<Drinks> getListOfDrinks() {
		return listOfDrinks;
	}
	public void setListOfDrinks(List<Drinks> listOfDrinks) {
		this.listOfDrinks = listOfDrinks;
	}
	public AllItems() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AllItems(List<Pizza> listOfPizza, List<Sides> listOfSides, List<Drinks> listOfDrinks) {
		super();
		this.listOfPizza = listOfPizza;
		this.listOfSides = listOfSides;
		this.listOfDrinks = listOfDrinks;
	}
	
}
