package com.edwin.angSpring.pizzastore.controller.items;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.edwin.angSpring.pizzastore.model.view.AllItems;
import com.edwin.angSpring.pizzastore.service.items.GetServiceImpl;
@CrossOrigin(origins="http://localhost:4200/")
@RequestMapping("/api/v1")
@RestController
public class MainController {
@Autowired
GetServiceImpl getService;

@GetMapping("/getAll")
public AllItems allItems() {
	return getService.getAll();
}

}
