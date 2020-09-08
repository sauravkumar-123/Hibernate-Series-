package com.Hibernate.Project_Maven2;

import javax.persistence.Embeddable;

@Embeddable
public class Course_detail 
{

	private int course_id;
	private String Course_Name;
	private double fee;
	private String duration;
	
	
	public Course_detail(int course_id, String course_Name, double fee, String duration) {
		super();
		this.course_id = course_id;
		Course_Name = course_Name;
		this.fee = fee;
		this.duration = duration;
	}


	public Course_detail() {
		super();
		// TODO Auto-generated constructor stub
	}


	public int getCourse_id() {
		return course_id;
	}


	public void setCourse_id(int course_id) {
		this.course_id = course_id;
	}


	public String getCourse_Name() {
		return Course_Name;
	}


	public void setCourse_Name(String course_Name) {
		Course_Name = course_Name;
	}


	public double getFee() {
		return fee;
	}


	public void setFee(double fee) {
		this.fee = fee;
	}


	public String getDuration() {
		return duration;
	}


	public void setDuration(String duration) {
		this.duration = duration;
	}
	
	
}
