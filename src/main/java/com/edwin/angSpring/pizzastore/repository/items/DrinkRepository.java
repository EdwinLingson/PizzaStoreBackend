package com.edwin.angSpring.pizzastore.repository.items;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.edwin.angSpring.pizzastore.model.items.Drinks;
@Repository
public interface DrinkRepository extends JpaRepository<Drinks, Long> {

}
