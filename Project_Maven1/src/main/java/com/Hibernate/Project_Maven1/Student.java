package com.Hibernate.Project_Maven1;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student 

{
 @Id           //Primary Key
 private int id;
 private String name;
 private String email;
 
 
 public Student(int id, String name, String email)
 {
	super();
	this.id = id;
	this.name = name;
	this.email = email;
}


public Student() 
 {
		super();
		// TODO Auto-generated constructor stub
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



public String getEmail() {
	return email;
}



public void setEmail(String email) {
	this.email = email;
}


@Override
public String toString() {
	// TODO Auto-generated method stub
	return this.id+"-->"+this.name+"---->"+this.email;
}

}