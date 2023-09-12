package com.edwin.angSpring.pizzastore.model.items;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Sides extends CalculateDiscount{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "sidesId")
	private long id;
	@Column(name = "sidesName")
	private String name;
	@Column(name = "sideCategory")
	private String category;
	@Column(name = "sidePrice", precision=10, scale=2)
	private BigDecimal price;
	@Column(name = "finalPrice", precision=10, scale=2)
	private BigDecimal fPrice;
	public Sides() {
		super();
	}
	public Sides(long id, String sName, String sCategory, BigDecimal sPrice, BigDecimal fPrice) {
		super();
		this.id = id;
		this.name = sName;
		this.category = sCategory;
		this.price = sPrice;
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
		System.out.println("Calculate");
		return this.fPrice = new BigDecimal(price.doubleValue()- price.doubleValue()*0.07);
	}
	
}
