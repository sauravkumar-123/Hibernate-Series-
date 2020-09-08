package com.Hibrnate.Mapping.xml;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Customer_run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Configuration confg=new Configuration();
        confg.configure("Hibernate.cfg1.xml");
        
        SessionFactory factory=confg.buildSessionFactory();
        System.out.println("Factory config===>"+factory);
        Session ses=factory.openSession();
        Transaction tx=ses.beginTransaction();
        
        Customer ct=new Customer();
        ct.setCust_id(101);
        ct.setCust_name("saurav");
        ct.setGender("male");
        ct.setEmail("sauravkumar.tit@gmail.com");
        ct.setMobno("7979969287");
        
        tx.commit();
        ses.close();
        factory.close();
	}

}
