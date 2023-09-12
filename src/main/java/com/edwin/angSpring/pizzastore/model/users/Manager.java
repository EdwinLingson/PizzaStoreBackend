package com.edwin.angSpring.pizzastore.model.users;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Manager implements Person {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String uname;
	private String pwd;
	private int level;
	
	
	public Manager() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Manager(long id, String uname, String pwd, int level) {
		super();
		this.id = id;
		this.uname = uname;
		this.pwd = pwd;
		this.level = level;
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


	public int getLevel() {
		return level;
	}


	public void setLevel(int level) {
		this.level = level;
	}


	@Override
	public boolean authenticate(String uname, String pwd) {
		return this.uname.equals(uname) && this.pwd.equals(pwd);
	}
	
	
	
}
