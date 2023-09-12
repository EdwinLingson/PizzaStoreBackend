package com.edwin.angSpring.pizzastore.model.view;

public class UserAuth {
	
	private long id;
	private boolean success;
	public UserAuth(long id, boolean success) {
		super();
		this.id = id;
		this.success = success;
	}
	public UserAuth() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public boolean isSuccess() {
		return success;
	}
	public void setSuccess(boolean success) {
		this.success = success;
	}
	
}
