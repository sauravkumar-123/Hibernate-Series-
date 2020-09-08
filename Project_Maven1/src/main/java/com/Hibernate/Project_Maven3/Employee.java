package com.Hibernate.Project_Maven3;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.OneToMany;

@Entity
public class Employee 
{
@Id
@Column(name="Emp_id")
 private int empid;
@Column(name="Emp_name",length=25)
 private String name;
@Column(name="Emp_age")
 private int age;
@Column(name="Emp_gender")
 private char gender;
@Column(name="Emp_mobno")
private long mobno;
@Column(name="Emp_emailid",length=35)
private String emailid;
@Column(name="Emp_departmentname",length=20)
 private String deptname;
@Column(name="Emp_salary")
 private double salary;

@Lob
@Column(name="Emp_image")
private byte[] image;


@OneToMany(mappedBy="emp",fetch=FetchType.LAZY,cascade=CascadeType.ALL)
//@JoinColumn(name="Accounts_Details")
 private List<Accounts> accnts;

public Employee() {
	super();
	// TODO Auto-generated constructor stub
}

public Employee(int empid, String name, int age, char gender, long mobno, String emailid, String deptname,
		double salary, byte[] image, List<Accounts> accnts) {
	super();
	this.empid = empid;
	this.name = name;
	this.age = age;
	this.gender = gender;
	this.mobno = mobno;
	this.emailid = emailid;
	this.deptname = deptname;
	this.salary = salary;
	this.image = image;
	this.accnts = accnts;
}

public int getEmpid() {
	return empid;
}

public void setEmpid(int empid) {
	this.empid = empid;
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

public char getGender() {
	return gender;
}

public void setGender(char gender) {
	this.gender = gender;
}

public long getMobno() {
	return mobno;
}

public void setMobno(long mobno) {
	this.mobno = mobno;
}

public String getEmailid() {
	return emailid;
}

public void setEmailid(String emailid) {
	this.emailid = emailid;
}

public String getDeptname() {
	return deptname;
}

public void setDeptname(String deptname) {
	this.deptname = deptname;
}

public double getSalary() {
	return salary;
}

public void setSalary(double salary) {
	this.salary = salary;
}

public byte[] getImage() {
	return image;
}

public void setImage(byte[] image) {
	this.image = image;
}

public List<Accounts> getAccnts() {
	return accnts;
}

public void setAccnts(List<Accounts> accnts) {
	this.accnts = accnts;
}


}