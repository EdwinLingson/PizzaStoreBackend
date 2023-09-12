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

import com.edwin.angSpring.pizzastore.model.items.Drinks;
import com.edwin.angSpring.pizzastore.model.items.Pizza;
import com.edwin.angSpring.pizzastore.service.items.CreateServiceImpl;
import com.edwin.angSpring.pizzastore.service.items.GetServiceImpl;
@CrossOrigin(origins="http://localhost:4200/")
@RestController
@RequestMapping("/api/v1/drink")
public class DrinkController {

	@Autowired
	GetServiceImpl getServiceImpl;
	@Autowired
	CreateServiceImpl createService;
	
	@GetMapping("getAll")
	public List<Drinks> getAll() {
		return getServiceImpl.getAllDrinks();
	}
	@GetMapping("get/{id}")
	public Drinks get(@PathVariable long id) {
		return getServiceImpl.getADrink(id);
	}
	
	@PostMapping("/add")
	public HttpStatus add(@RequestBody Drinks drink) {
		System.out.println("Hi");
		if(createService.addDrinks(drink)!=null) return HttpStatus.OK;
		return HttpStatus.BAD_REQUEST;
	}
	
	@DeleteMapping("/delete/{id}")
	public Drinks deleteDrink(@PathVariable long id) {
		return createService.deleteDrinks(id);
		
	}
}
