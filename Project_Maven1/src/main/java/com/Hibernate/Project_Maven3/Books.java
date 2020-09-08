package com.Hibernate.Project_Maven3;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;

@Entity
public class Books {
	
	@Id
	@Column(name="Book_Id")
	private int id;
	@Column(name="Book_Name",length=25)
	private String name;
	@Column(name="Book_Publisher_name",length=25)
	private String publisher;
	@Column(name="Book_Price")
	private double price;
	@Column(name="Book_Avablity")
	private boolean avablity;

	@ManyToMany
	@JoinTable(name="Books_Author",
			joinColumns= { @JoinColumn (name="BOOKS_ID")},
			inverseJoinColumns= {@JoinColumn(name="AUTHOR'S_ID")})
	private List<Author> auth;

	public Books() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Books(int id, String name, String publisher, double price, boolean avablity, List<Author> auth) {
		super();
		this.id = id;
		this.name = name;
		this.publisher = publisher;
		this.price = price;
		this.avablity = avablity;
		this.auth = auth;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public boolean isAvablity() {
		return avablity;
	}

	public void setAvablity(boolean avablity) {
		this.avablity = avablity;
	}

	public List<Author> getAuth() {
		return auth;
	}

	public void setAuth(List<Author> auth) {
		this.auth = auth;
	}
	
	
}
