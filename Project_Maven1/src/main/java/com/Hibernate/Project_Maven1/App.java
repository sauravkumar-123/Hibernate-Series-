package com.Hibernate.Project_Maven1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.archive.internal.FileInputStreamAccess;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
	
	
    public static void main( String[] args ) throws IOException
    {	
    	
    	int id;
        String name,sid;
        String email;
        
        String street;
     	String city;
     	boolean isopen;
     	double x;
      
        System.out.println( "Hibernate Started!!!!!" );
        
        Scanner scan=new Scanner(System.in);
		System.out.println("enter id,name and email");
		sid=scan.nextLine();
		id=Integer.parseInt(sid);
		
		name=scan.nextLine();
		email=scan.nextLine();
		
		System.out.println("enter street, city, isopen_value, X");
		street=scan.nextLine();
		city=scan.nextLine();
		isopen=scan.nextBoolean();
		x=scan.nextDouble();	
        
        Configuration confg=new Configuration();
        confg.configure("Hibernate.cfg1.xml");
 
	 
		SessionFactory factory=confg.buildSessionFactory();
		//System.out.println(factory);
		//System.out.println(factory.isClosed());
		
		
		//Creating Student Object.

		Student st=new Student();
		st.setId(id);
		st.setName(name);
		st.setEmail(email);
		
		System.out.println(st);
		
		
		//Creating Address Object.
		Address ad=new Address();
		ad.setStreet(street);
		ad.setCity(city);
		ad.setIsopen(isopen);
		ad.setX(x);
		ad.setAddDate(new Date());
		
		//image set
		/*FileInputStream fis = new FileInputStream("src/main/java/images/my PHOTO.jpg");
		byte[] image=new byte[fis.available()];*/
		File file = new File("src/main/java/images/my PHOTO.jpg");
        byte[] image = new byte[(int) file.length()];
 
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            fileInputStream.read(image);
            fileInputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
		ad.setImage(image);
		
		System.out.println(st);
		
		Session ses=factory.openSession();
		//Session ses=factory.getCurrentSession();
		
		Transaction tx=ses.beginTransaction();
		
		ses.save(st);
		ses.save(ad);
	   tx.commit();
	   
		ses.close();
		factory.close();
		System.out.println("Done.......");
  }
    
}

