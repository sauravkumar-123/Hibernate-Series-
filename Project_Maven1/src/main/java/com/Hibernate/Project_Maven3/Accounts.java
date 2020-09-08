package com.Hibernate.Project_Maven3;

import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
@Entity
@Cacheable(true)
@Cache(usage = CacheConcurrencyStrategy.READ_ONLY)
public class Accounts 
{

@Id
@Column(name="Account_id")
private int aid;
@Column(name="Account_type",length=20)
private String accnttype;
@Column(name="Bank_name",length=50)
private String bankname;
@Column(name="Bank_ifsc",length=25)
private String ifsc;
@Column(name="Account_status")
private boolean isopen;
@Column(name="Account_Balance")
private double balance;

@ManyToOne
private Employee emp;

public Accounts() {
	super();
	// TODO Auto-generated constructor stub
}

public Accounts(int aid, String accnttype, String bankname, String ifsc, boolean isopen, double balance, Employee emp) {
	super();
	this.aid = aid;
	this.accnttype = accnttype;
	this.bankname = bankname;
	this.ifsc = ifsc;
	this.isopen = isopen;
	this.balance = balance;
	this.emp = emp;
}

public int getAid() {
	return aid;
}

public void setAid(int aid) {
	this.aid = aid;
}

public String getAccnttype() {
	return accnttype;
}

public void setAccnttype(String accnttype) {
	this.accnttype = accnttype;
}

public String getBankname() {
	return bankname;
}

public void setBankname(String bankname) {
	this.bankname = bankname;
}

public String getIfsc() {
	return ifsc;
}

public void setIfsc(String ifsc) {
	this.ifsc = ifsc;
}

public boolean isIsopen() {
	return isopen;
}

public void setIsopen(boolean isopen) {
	this.isopen = isopen;
}

public double getBalance() {
	return balance;
}

public void setBalance(double balance) {
	this.balance = balance;
}

public Employee getEmp() {
	return emp;
}

public void setEmp(Employee emp) {
	this.emp = emp;
}
}
