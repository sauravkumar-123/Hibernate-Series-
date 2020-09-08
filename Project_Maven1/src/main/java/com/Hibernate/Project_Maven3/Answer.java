package com.Hibernate.Project_Maven3;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Answer
{
	
@Id
 @Column(name="Column_Id")
  private int answerId;
 @Column(name="Answer")
  private String answer;
  
 @OneToOne(mappedBy="answer")
  private Question qs;
 
public Answer(int answerId, String answer) {
	super();
	this.answerId = answerId;
	this.answer = answer;
	this.qs=qs;
}
  
public Answer() {
	super();
	// TODO Auto-generated constructor stub
}

public int getAnswerId() {
	return answerId;
}

public void setAnswerId(int answerId) {
	this.answerId = answerId;
}

public String getAnswer() {
	return answer;
}

public void setAnswer(String answer) {
	this.answer = answer;
}

public Question getQs() {
	return qs;
}

public void setQs(Question qs) {
	this.qs = qs;
}
  
}

