package com.Hibernate.Project_Maven2;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.io.File;
import java.io.FileInputStream;
import java.util.Scanner;
public class AppRunEmbeed1 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		String studentname,sage,smobno;
		int age;
		long mobno;
		String city;
		String email;
		
		int courseid;
		String coursename,scid,sdfee;
		double fee;
		String courseduration;
		
		Configuration confg=new Configuration();
        confg.configure("Hibernate.cfg1.xml");
 
	 
		SessionFactory factory=confg.buildSessionFactory();
		System.out.println(factory);
       
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter student name,age,mobno,city and email");
		studentname=scan.nextLine();
		sage=scan.nextLine();
		age=Integer.parseInt(sage);
		
		smobno=scan.nextLine();
		mobno=Long.parseLong(smobno);
		city=scan.nextLine();
		email=scan.nextLine();
		
		//student detail object create
		Student_Details sd=new Student_Details();
		sd.setName(studentname);
		sd.setAge(age);
		sd.setMobno(mobno);
		sd.setCity(city);
		sd.setEmail(email);
		
		File file = new File("src/main/java/images/my PHOTO.jpg");
        byte[] image = new byte[(int) file.length()];
 
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            fileInputStream.read(image);
            fileInputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
		sd.setImage(image);
		
		System.out.println("Enter course_id,course_name,fee and ,course_duration");
		scid=scan.nextLine();
		courseid=Integer.parseInt(scid);
		coursename=scan.nextLine();
		
		sdfee=scan.nextLine();
		fee=Double.parseDouble(sdfee);
		courseduration=scan.nextLine();
		
		//creating course Detail object
		Course_detail cd=new Course_detail();
		cd.setCourse_id(courseid);
		cd.setCourse_Name(coursename);
		cd.setFee(fee);
		cd.setDuration(courseduration);
		
		Session ses=factory.openSession();
		//Session ses=factory.getCurrentSession();
		
		Transaction tx=ses.beginTransaction();
		
		ses.save(sd);
		ses.save(cd);
	    tx.commit();
	    ses.close();
		factory.close();
		System.out.println("Done-->");
	}

}
