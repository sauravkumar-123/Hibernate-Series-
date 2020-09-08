package com.Hibrnate.Mapping.xml;

public class Customer {
	private int cust_id;
	private String cust_name;
	private String gender;
	private String email;
	private String mobno;
	
	
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Customer(int cust_id, String cust_name, String gender, String email, String mobno) {
		super();
		this.cust_id = cust_id;
		this.cust_name = cust_name;
		this.gender = gender;
		this.email = email;
		this.mobno = mobno;
	}


	public int getCust_id() {
		return cust_id;
	}


	public void setCust_id(int cust_id) {
		this.cust_id = cust_id;
	}


	public String getCust_name() {
		return cust_name;
	}


	public void setCust_name(String cust_name) {
		this.cust_name = cust_name;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getMobno() {
		return mobno;
	}


	public void setMobno(String mobno) {
		this.mobno = mobno;
	}

	
}
