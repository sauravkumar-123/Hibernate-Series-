package com.Hibernate.Project_Maven3;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Author
{
@Id
@Column(name="author_id")
 private int id;
@Column(name="author_name",length=35)
 private String name;
@Column(name="author_qualification",length=25)
 private String qualification;
@Column(name="author_email",length=35)
 private String email;
@Column(name="author_mobno")
 private long mobno;

@ManyToMany(mappedBy="auth")
private List<Books> bk;

public Author() {
	super();
	// TODO Auto-generated constructor stub
}

public Author(int id, String name, String qualification, String email, long mobno, List<Books> bk) {
	super();
	this.id = id;
	this.name = name;
	this.qualification = qualification;
	this.email = email;
	this.mobno = mobno;
	this.bk = bk;
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

public String getQualification() {
	return qualification;
}

public void setQualification(String qualification) {
	this.qualification = qualification;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public long getMobno() {
	return mobno;
}

public void setMobno(long mobno) {
	this.mobno = mobno;
}

public List<Books> getBk() {
	return bk;
}

public void setBk(List<Books> bk) {
	this.bk = bk;
}

}
