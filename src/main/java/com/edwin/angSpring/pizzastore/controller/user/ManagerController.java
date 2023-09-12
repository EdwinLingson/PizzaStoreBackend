package com.edwin.angSpring.pizzastore.controller.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.edwin.angSpring.pizzastore.model.users.Manager;
import com.edwin.angSpring.pizzastore.model.view.UserAuth;
import com.edwin.angSpring.pizzastore.service.users.ManagerService;

@RequestMapping("/mgr")
@RestController
@CrossOrigin(origins="http://localhost:4200/")
public class ManagerController {

	@Autowired
	ManagerService managerService;
	
	@GetMapping("/validateUname/{uname}")
	boolean validateUname(@PathVariable String uname) {
		return managerService.possibleuserName(uname);
	}
	
	@PostMapping("/register")
	Manager createCustomer(@RequestBody Manager mgr) {
		return managerService.createManager(mgr);
	}
	@PostMapping("/authenticate")
	UserAuth authenticateCustomer(@RequestBody Manager mgr) {
		return managerService.authenticate(mgr);
	}
	
	@GetMapping("/getDetails/{id}")
	Manager getDetails(@PathVariable long id) {
		System.err.println(id);
		return managerService.getManagerDetails(id);
	}
	
}
