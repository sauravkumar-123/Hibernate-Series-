package com.Hibernate.Hql;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import org.hibernate.query.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.Hibernate.Project_Maven3.Author;

@SuppressWarnings("deprecation")
public class Hql1
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String id1,id2,id3,email_id1,email_id2;
		int input_id1,input_id2,input_id3;
		Configuration confg=new Configuration();
        confg.configure("Hibernate.cfg1.xml");
 
	 
		SessionFactory factory=confg.buildSessionFactory();
		System.out.println(factory);
		
		Scanner scan=new Scanner(System.in);
		System.out.println("enter Author_id and Author_email");
		id1=scan.nextLine();
		input_id1=Integer.parseInt(id1);
		email_id1=scan.nextLine();
		Session ses=factory.openSession();
		//HQL
		//String query="from Author where id="+input_id; // simplified way.
		String query1="from Author as ath where ath.id=:x and ath.email=:e"; //with alias naming.
		Query qr1=ses.createQuery(query1);
		qr1.setParameter("x",input_id1);
		qr1.setParameter("e",email_id1);
		//single Result------>unique result.
		//multiple result-------->list
		
		List<Author> list=qr1.list();
		Iterator<Author> itr =list.iterator(); 
		while (itr.hasNext()==true) 
        { 
		Author auth = (Author)itr.next(); 
		System.out.println(auth.getId()+"===>"+auth.getName()+"========>"+auth.getEmail()+"=====>"+auth.getQualification());
        }

		System.out.println("<______________________________________________________________>");
		Transaction tx=ses.beginTransaction();
		/*
		System.out.println("enter author id to delete row data");
		id2=scan.nextLine();
		input_id2=Integer.parseInt(id2);
	    //HQL complex query.
		// Delete Query.

		String query2="delete from Author as auth where auth.id=:y";
		Query qr2=ses.createQuery(query2);
		qr2.setParameter("y",input_id2);
		int result1=qr2.executeUpdate();
		if(result1>0) {
		
		System.out.println(result1+"row was deleted successfully!!!!!!!!");
		}
		else {
			System.out.println("delete query not fired.....>");
		}
*/
		System.out.println("<______________________________________________________________>");
		System.out.println("enter email id to be update and Author_id for you want to be update");
		email_id2=scan.nextLine();
		id3=scan.nextLine();
		input_id3=Integer.parseInt(id3);
		
		
		//HQL complex query.
        //Update Query.
		String query3="update Author as auth set auth.email=:e where auth.id=:i";
		Query qr3=ses.createQuery(query3);
		qr3.setParameter("i",input_id3);
		qr3.setParameter("e",email_id2);
		int result2=qr3.executeUpdate();
		
		if(result2>0) {
			
			System.out.println(result2+"row was updated successfully!!!!!!!!");
			}
			else {
				System.out.println("update query not fired.....>");
			}
		
		System.out.println("<______________________________________________________________>");
		String query4="select q.questionId,q.question,a.answerId,a.answer from Question as q INNER JOIN q.answer as a";
		Query qr4=ses.createQuery(query4);
		List<Object []> join= qr4.getResultList();
	   for(Object [] orr:join)
		{
			System.out.println("data after join "+Arrays.toString(orr));
		}
		/*
		Iterator<Object []> itr1 =join.iterator(); 
		while (itr.hasNext()==true) 
        { 
			Object [] orr= (Object [])itr1.next(); 
		System.out.println("data after join "+Arrays.toString(orr));
        }*/
		tx.commit();
		ses.close();
		factory.close();
		System.out.println("Done------->");
	}

}
