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

import com.edwin.angSpring.pizzastore.model.items.Sides;
import com.edwin.angSpring.pizzastore.service.items.CreateServiceImpl;
import com.edwin.angSpring.pizzastore.service.items.GetServiceImpl;

@CrossOrigin(origins="http://localhost:4200/")
@RestController
@RequestMapping("/api/v1/sides")
public class SidesController {

	@Autowired
	GetServiceImpl getServiceImpl;
	@Autowired
	CreateServiceImpl createService;
	
	@GetMapping("getAll")
	public List<Sides> getAll() {
		return getServiceImpl.getAllSides();
	}
	@GetMapping("get/{id}")
	public Sides get(@PathVariable int id) {
		return getServiceImpl.getASide(id);
	}
	
	@PostMapping("/add")
	public HttpStatus add(@RequestBody Sides sides) {
		if(createService.addSides(sides)!=null) return HttpStatus.OK;
		return HttpStatus.BAD_REQUEST;
	}
	
	@DeleteMapping("/delete/{id}")
	public Sides deleteSide(@PathVariable long id) {
		return createService.deleteSides(id);
		
	}
	
}
