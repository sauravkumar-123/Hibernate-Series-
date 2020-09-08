package com.Hibernate.Project_Maven1;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
@Table (name="Person_Address")
public class Address 
{
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column (name="address_Id")
   private int addressId;
	
   @Column (length=50,name="STREET")
   private String street;
   
   @Column (length=60,name="CITY")
   private String city;
   
   @Column (name="IS_OPEN")
   private boolean isopen;
   
   @Transient
   private double x;
   
   @Column (name="ADDED_DATE")
   @Temporal (TemporalType.DATE)
   private Date addDate;
   
   @Lob
   private byte[] image;
   


public Address() {
	super();
	// TODO Auto-generated constructor stub
}


public Address(int addressId, String street, String city, boolean isopen, double x, Date addDate, byte[] image)
{
	super();
	this.addressId = addressId;
	this.street = street;
	this.city = city;
	this.isopen = isopen;
	this.x = x;
	this.addDate = addDate;
	this.image = image;
}


public int getAddressId() {
	return addressId;
}


public void setAddressId(int addressId) {
	this.addressId = addressId;
}


public String getStreet() {
	return street;
}


public void setStreet(String street) {
	this.street = street;
}


public String getCity() {
	return city;
}


public void setCity(String city) {
	this.city = city;
}


public boolean isIsopen() {
	return isopen;
}


public void setIsopen(boolean isopen) {
	this.isopen = isopen;
}


public double getX() {
	return x;
}


public void setX(double x) {
	this.x = x;
}


public Date getAddDate() {
	return addDate;
}


public void setAddDate(Date addDate) {
	this.addDate = addDate;
}


public byte[] getImage() {
	return image;
}


public void setImage(byte[] image) {
	this.image = image;
}


}
