package com.edwin.angSpring.pizzastore.model.items;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Pizza extends CalculateDiscount {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "pizzaId")
	private long id;
	@Column(name = "pizzaName")
	private String name;
	@Column(name = "pizzaCategory")
	private String category;
	@Column(name = "pizzaPrice", precision=10, scale=2)
	private BigDecimal price;
	@Column(name = "finalPrice", precision=10, scale=2)
	private BigDecimal fPrice;
	public Pizza(long id, String name, String category, BigDecimal price, BigDecimal fPrice) {
		super();
		this.id = id;
		this.name = name;
		this.category = category;
		this.price = price;
		this.fPrice =fPrice;
		
	}
	public Pizza() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String pName) {
		this.name = pName;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String pCategory) {
		this.category = pCategory;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal pPrice) {
		this.price = pPrice;
	}
	
	public BigDecimal getfPrice() {
		return fPrice;
	}
	public void setfPrice(BigDecimal fPrice) {
		this.fPrice = fPrice;
	}
	@Override
	public BigDecimal  calculateDiscount() {
		System.out.println("Calculate Pizza Disc");
		return this.fPrice = new BigDecimal(price.doubleValue()- price.doubleValue()*0.1);
	}
	
	
	
}
