package com.edwin.angSpring.pizzastore.model.items;

import java.math.BigDecimal;
import java.math.BigInteger;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Drinks extends CalculateDiscount{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "drinkId")
	private long id;
	@Column(name = "drinkName")
	private String name;
	@Column(name = "drinkCategory")
	private String category;
	@Column(name = "drinkPrice", precision=10, scale=2)
	private BigDecimal price;
	@Column(name = "finalPrice", precision=10, scale=2)
	private BigDecimal fPrice;
	public Drinks() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Drinks(long id, String dName, String dCategory, BigDecimal dPrice, BigDecimal fPrice) {
		super();
		this.id = id;
		this.name = dName;
		this.category = dCategory;
		this.price = dPrice;
		this.fPrice =fPrice;
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
		return this.fPrice = new BigDecimal(price.doubleValue()- price.doubleValue()*0.05);
	}
	
	
}
