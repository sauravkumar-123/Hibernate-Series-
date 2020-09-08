package com.Hibernate.Project_Maven2;

import java.util.Arrays;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity
public class Student_Details 
{
 
 @Id
 @GeneratedValue (strategy = GenerationType.IDENTITY)
 @Column (name="Roll_No")
  private int rollno;
 
 @Column (length=50,name="Student_Name")
  private String name;
 
  private int age;
  private long mobno;
  
  @Column (length=25,name="City")
  private String city;
  
  @Column (length=70,name="Student_Email")
  private String email;
  
  @Lob
  private byte[] image;
  
  private Course_detail cd;

public Student_Details(int rollno, String name, int age, long mobno, String city, String email, byte[] image) {
	super();
	this.rollno = rollno;
	this.name = name;
	this.age = age;
	this.mobno = mobno;
	this.city = city;
	this.email = email;
	this.image = image;
}

public Student_Details() {
	super();
	// TODO Auto-generated constructor stub
}

public int getRollno() {
	return rollno;
}

public void setRollno(int rollno) {
	this.rollno = rollno;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}

public long getMobno() {
	return mobno;
}

public void setMobno(long mobno) {
	this.mobno = mobno;
}

public String getCity() {
	return city;
}

public void setCity(String city) {
	this.city = city;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public byte[] getImage() {
	return image;
}

public void setImage(byte[] image) {
	this.image = image;
}

public Course_detail getCd() {
	return cd;
}

public void setCd(Course_detail cd) {
	this.cd = cd;
}

@Override
public String toString() {
	return "Student_Details [rollno=" + rollno + ", name=" + name + ", age=" + age + ", mobno=" + mobno + ", city="
			+ city + ", email=" + email + ", image=" + Arrays.toString(image) + ", cd=" + cd + "]";
}
  



}
