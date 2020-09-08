package com.Hibernate.Project_Maven3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Book_Author_Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String bid1,bname1,bpublisher1,bprice1,bavalibale1;
    int bookid1;
    double bookprice1;
    boolean bookavabality1;
    
    String bid2,bname2,bpublisher2,bprice2,bavalibale2;
    int bookid2;
    double bookprice2;
    boolean bookavabality2;
    
    String bid3,bname3,bpublisher3,bprice3,bavalibale3;
    int bookid3;
    double bookprice3;
    boolean bookavabality3;
    
    String bid4,bname4,bpublisher4,bprice4,bavalibale4;
    int bookid4;
    double bookprice4;
    boolean bookavabality4;
    
    String bid5,bname5,bpublisher5,bprice5,bavalibale5;
    int bookid5;
    double bookprice5;
    boolean bookavabality5;
    
    
    String aid1,aname1,aqualif1,aemail1,amobno1;
    int authorid1;
    long authormobno1;
    
    String aid2,aname2,aqualif2,aemail2,amobno2;
    int authorid2;
    long authormobno2;
    
    String aid3,aname3,aqualif3,aemail3,amobno3;
    int authorid3;
    long authormobno3;
    
    String aid4,aname4,aqualif4,aemail4,amobno4;
    int authorid4;
    long authormobno4;
    
    String aid5,aname5,aqualif5,aemail5,amobno5;
    int authorid5;
    long authormobno5;
    
		//Configuration object.
				Configuration confg=new Configuration();
		        confg.configure("Hibernate.cfg1.xml");
		        
		        SessionFactory factory=confg.buildSessionFactory();
		        System.out.println("Factory config===>"+factory);
		        
		        Scanner scan=new Scanner(System.in);
		        System.out.println("enter book_id,book_name,book_publishername,book_price and book_avabality");
		        bid1=scan.nextLine();
		        bookid1=Integer.parseInt(bid1);
		        
		        bname1=scan.nextLine();
		        bpublisher1=scan.nextLine();
		        
		        bprice1=scan.nextLine();
		        bookprice1=Double.parseDouble(bprice1);
		        
		        bavalibale1=scan.nextLine();
		        bookavabality1=Boolean.parseBoolean(bavalibale1);
		        
		        System.out.println("enter more book_id,book_name,book_publishername,book_price and book_avabality");
		        bid2=scan.nextLine();
		        bookid2=Integer.parseInt(bid2);
		        
		        bname2=scan.nextLine();
		        bpublisher2=scan.nextLine();
		        
		        bprice2=scan.nextLine();
		        bookprice2=Double.parseDouble(bprice2);
		        
		        bavalibale2=scan.nextLine();
		        bookavabality2=Boolean.parseBoolean(bavalibale2);
		        
		        System.out.println("enter more book_id,book_name,book_publishername,book_price and book_avabality");
		        bid3=scan.nextLine();
		        bookid3=Integer.parseInt(bid3);
		        
		        bname3=scan.nextLine();
		        bpublisher3=scan.nextLine();
		        
		        bprice3=scan.nextLine();
		        bookprice3=Double.parseDouble(bprice3);
		        
		        bavalibale3=scan.nextLine();
		        bookavabality3=Boolean.parseBoolean(bavalibale3);
		        
		        System.out.println("enter more book_id,book_name,book_publishername,book_price and book_avabality");
		        bid4=scan.nextLine();
		        bookid4=Integer.parseInt(bid4);
		        
		        bname4=scan.nextLine();
		        bpublisher4=scan.nextLine();
		        
		        bprice4=scan.nextLine();
		        bookprice4=Double.parseDouble(bprice4);
		        
		        bavalibale4=scan.nextLine();
		        bookavabality4=Boolean.parseBoolean(bavalibale4);
		        
		        System.out.println("enter more book_id,book_name,book_publishername,book_price and book_avabality");
		        bid5=scan.nextLine();
		        bookid5=Integer.parseInt(bid5);
		        
		        bname5=scan.nextLine();
		        bpublisher5=scan.nextLine();
		        
		        bprice5=scan.nextLine();
		        bookprice5=Double.parseDouble(bprice5);
		        
		        bavalibale5=scan.nextLine();
		        bookavabality5=Boolean.parseBoolean(bavalibale5);
		        
		        System.out.println("enter author_id,author_name,author_qualification,author_email and author_mobileno");
		        aid1=scan.nextLine();
		        authorid1=Integer.parseInt(aid1);
		        
		        aname1=scan.nextLine();
		        aqualif1=scan.nextLine();
		        aemail1=scan.nextLine();
		        
		        amobno1=scan.nextLine();
		        authormobno1=Long.parseLong(amobno1);
		        
		        System.out.println("enter more author_id,author_name,author_qualification,author_email and author_mobileno");
		        aid2=scan.nextLine();
		        authorid2=Integer.parseInt(aid2);
		        
		        aname2=scan.nextLine();
		        aqualif2=scan.nextLine();
		        aemail2=scan.nextLine();
		        
		        amobno2=scan.nextLine();
		        authormobno2=Long.parseLong(amobno2);
		        
		        System.out.println("enter more author_id,author_name,author_qualification,author_email and author_mobileno");
		        aid3=scan.nextLine();
		        authorid3=Integer.parseInt(aid3);
		        
		        aname3=scan.nextLine();
		        aqualif3=scan.nextLine();
		        aemail3=scan.nextLine();
		        
		        amobno3=scan.nextLine();
		        authormobno3=Long.parseLong(amobno3);
		        
		        System.out.println("enter more author_id,author_name,author_qualification,author_email and author_mobileno");
		        aid4=scan.nextLine();
		        authorid4=Integer.parseInt(aid4);
		        
		        aname4=scan.nextLine();
		        aqualif4=scan.nextLine();
		        aemail4=scan.nextLine();
		        
		        amobno4=scan.nextLine();
		        authormobno4=Long.parseLong(amobno4);
		        
		        System.out.println("enter more author_id,author_name,author_qualification,author_email and author_mobileno");
		        aid5=scan.nextLine();
		        authorid5=Integer.parseInt(aid5);
		        
		        aname5=scan.nextLine();
		        aqualif5=scan.nextLine();
		        aemail5=scan.nextLine();
		        
		        amobno5=scan.nextLine();
		        authormobno5=Long.parseLong(amobno5);
		        
		        //make 5-object of Book class.
		        Books bk1=new Books();
		        bk1.setId(bookid1);
		        bk1.setName(bname1);
		        bk1.setPublisher(bpublisher1);
		        bk1.setPrice(bookprice1);
		        bk1.setAvablity(bookavabality1);
		        
		        Books bk2=new Books();
		        bk2.setId(bookid2);
		        bk2.setName(bname2);
		        bk2.setPublisher(bpublisher2);
		        bk2.setPrice(bookprice2);
		        bk2.setAvablity(bookavabality2);
		        
		        Books bk3=new Books();
		        bk3.setId(bookid3);
		        bk3.setName(bname3);
		        bk3.setPublisher(bpublisher3);
		        bk3.setPrice(bookprice3);
		        bk3.setAvablity(bookavabality3);
		        
		        Books bk4=new Books();
		        bk4.setId(bookid4);
		        bk4.setName(bname4);
		        bk4.setPublisher(bpublisher4);
		        bk4.setPrice(bookprice4);
		        bk4.setAvablity(bookavabality4);
		        
		        Books bk5=new Books();
		        bk5.setId(bookid5);
		        bk5.setName(bname5);
		        bk5.setPublisher(bpublisher5);
		        bk5.setPrice(bookprice5);
		        bk5.setAvablity(bookavabality5);
		        
		      //make 5-object of Author class.
		        Author ath1=new Author();
		        ath1.setId(authorid1);
		        ath1.setName(aname1);
		        ath1.setQualification(aqualif1);
		        ath1.setEmail(aemail1);
		        ath1.setMobno(authormobno1);
		        
		        Author ath2=new Author();
		        ath2.setId(authorid2);
		        ath2.setName(aname2);
		        ath2.setQualification(aqualif2);
		        ath2.setEmail(aemail2);
		        ath2.setMobno(authormobno2);
		        
		        Author ath3=new Author();
		        ath3.setId(authorid3);
		        ath3.setName(aname3);
		        ath3.setQualification(aqualif3);
		        ath3.setEmail(aemail3);
		        ath3.setMobno(authormobno3);
		        
		        Author ath4=new Author();
		        ath4.setId(authorid4);
		        ath4.setName(aname4);
		        ath4.setQualification(aqualif4);
		        ath4.setEmail(aemail4);
		        ath4.setMobno(authormobno4);
		        
		        Author ath5=new Author();
		        ath5.setId(authorid5);
		        ath5.setName(aname5);
		        ath5.setQualification(aqualif5);
		        ath5.setEmail(aemail5);
		        ath5.setMobno(authormobno5);
		        
		        //make list of both object.
		        List<Books> bl=new ArrayList<Books>();
		        bl.add(bk1);
		        bl.add(bk2);
		        bl.add(bk3);
		        bl.add(bk4);
		        bl.add(bk5);
		        
		        List<Author> al=new ArrayList<Author>();
		        al.add(ath1);
		        al.add(ath2);
		        al.add(ath3);
		        al.add(ath4);
		        al.add(ath5);
		        
		        bk1.setAuth(al);
		        ath1.setBk(bl);
		        
		        bk2.setAuth(al);
		        ath2.setBk(bl);
		        
		        bk3.setAuth(al);
		        ath3.setBk(bl);
		        
		        bk4.setAuth(al);
		        ath4.setBk(bl);
		        
		        bk5.setAuth(al);
		        ath5.setBk(bl);
		        Session ses=factory.openSession();
				//Session ses=factory.getCurrentSession();
				Transaction tx=ses.beginTransaction();
				
				//save object
				ses.save(bk1);
				ses.save(bk2);
				ses.save(bk3);
				ses.save(bk4);
				ses.save(bk5);
				
				ses.save(ath1);
				ses.save(ath2);
				ses.save(ath3);
				ses.save(ath4);
				ses.save(ath5);
				
				tx.commit();
			    ses.close();
				factory.close();
				System.out.println("Done---->");
	}

}
