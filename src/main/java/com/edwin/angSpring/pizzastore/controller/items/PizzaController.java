package com.edwin.angSpring.pizzastore.controller.items;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.edwin.angSpring.pizzastore.model.items.Pizza;
import com.edwin.angSpring.pizzastore.service.items.CreateServiceImpl;
import com.edwin.angSpring.pizzastore.service.items.GetServiceImpl;

@CrossOrigin(origins="http://localhost:4200/")
@RestController
@RequestMapping("/api/v1/pizza")
public class PizzaController {

	@Autowired
	GetServiceImpl getServiceImpl;
	@Autowired
	CreateServiceImpl createService;
	
	@GetMapping("/getAll")
	public List<Pizza> getAllPizza() {
		return getServiceImpl.getAllPizza();
	}
	

	@GetMapping("/get/{id}")	
	public Pizza getP(@PathVariable("id") long id) {
		System.out.println("Hi from get");
		Pizza pizza = getServiceImpl.getAPizza(id);
		return pizza;
		
	}
	
	@PostMapping("/add")
	public HttpStatus addPizza(@RequestBody Pizza pizza) {
		System.out.println("Hi");
		if(createService.addPizza(pizza)!=null) return HttpStatus.OK;
		return HttpStatus.BAD_REQUEST;
	}
	
	@DeleteMapping("/delete/{id}")
	public Pizza deletePizza(@PathVariable long id) {
		return createService.deletePizza(id);
		
	}
	
}
