package com.edwin.angSpring.pizzastore.model.users;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Customer implements Person {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String uname;
	private String pwd;
	@Column(precision=10, scale=2)
	private BigDecimal walletBalance;
	
	
	public Customer() {
		super();
	}


	public Customer(long id, String uname, String pwd, BigDecimal walletBalance) {
		super();
		this.id = id;
		this.uname = uname;
		this.pwd = pwd;
		this.walletBalance = walletBalance;
	}



	public long getId() {
		return id;
	}



	public void setId(long id) {
		this.id = id;
	}



	public String getUname() {
		return uname;
	}



	public void setUname(String uname) {
		this.uname = uname;
	}



	public String getPwd() {
		return pwd;
	}



	public void setPwd(String pwd) {
		this.pwd = pwd;
	}



	public BigDecimal getWalletBalance() {
		return walletBalance;
	}



	public void setWalletBalance(BigDecimal walletBalance) {
		this.walletBalance = walletBalance;
	}


	@Override
	public boolean authenticate(String uname, String pwd) {
		return this.uname.equals(uname) && this.pwd.equals(pwd);
	}

}
