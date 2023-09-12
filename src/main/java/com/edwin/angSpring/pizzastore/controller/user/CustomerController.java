package com.edwin.angSpring.pizzastore.controller.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.edwin.angSpring.pizzastore.model.users.Customer;
import com.edwin.angSpring.pizzastore.model.view.UserAuth;
import com.edwin.angSpring.pizzastore.service.users.CustomerService;

@RequestMapping("/csr")
@RestController()
@CrossOrigin(origins="http://localhost:4200/")
public class CustomerController {

	@Autowired
	CustomerService customerService;
	
	@GetMapping("/validateUname/{uname}")
	boolean validateUname(@PathVariable String uname) {
		return customerService.possibleuserName(uname);
	}
	
	@PostMapping("/register")
	Customer createCustomer(@RequestBody Customer csr) {
		return customerService.createCustomer(csr);
	}
	@PostMapping("/authenticate")
	UserAuth authenticateCustomer(@RequestBody Customer csr) {
		return customerService.authenticate(csr);
	}
	
	@GetMapping("/getDetails/{id}")
	Customer getDetails(@PathVariable long id) {
		System.err.println(id);
		return customerService.getCustomerDetails(id);
	}
	@PostMapping("/update")
	Customer updateCustomer(@RequestBody Customer csr) {
		System.out.println("Update");
		return customerService.editCustomer(csr);
	}
	
	@PatchMapping("/addBalance")
	Customer addBalance(@RequestBody Customer csr) {
		System.out.println("Balance");
		return customerService.addBalance(csr);
	}
	
}
