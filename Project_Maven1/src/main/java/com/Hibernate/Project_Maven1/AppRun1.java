package com.Hibernate.Project_Maven1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import java.util.Scanner;
public class AppRun1 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//get() and load()
		int address_Id;
		
		System.out.println("Reday to start");
		
		Configuration confg=new Configuration();
        confg.configure("hibernate.cfg1.xml");
 
	    
		SessionFactory factory=confg.buildSessionFactory();
		System.out.println(factory);
		
		Session ses=factory.openSession();
		
		System.out.println("enter primary key id");
		Scanner scan=new Scanner(System.in);
		address_Id=scan.nextInt();
		
		//Address as=(Address)ses.get(Address.class,address_Id);
		Address as=(Address)ses.load(Address.class,address_Id);
		System.out.println(as.getAddressId()+" "+as.getStreet()+" "+as.getCity()+" "+as.isIsopen()+" "+as.getX()+" "+as.getAddDate()+" "+as.getImage());
		
       ses.close();
       factory.close();
       
       System.out.println("The end--->");
	}

}
