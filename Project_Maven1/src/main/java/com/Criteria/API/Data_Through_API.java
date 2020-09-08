package com.Criteria.API;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import com.Hibernate.Project_Maven3.Accounts;
import com.Hibernate.Project_Maven3.Author;
import com.Hibernate.Project_Maven3.Employee;

public class Data_Through_API {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str_id;
		int accnts_id;
		Scanner scan=new Scanner(System.in);
      System.out.println("enter account id to fetch data");
	  str_id=scan.nextLine();
	  accnts_id=Integer.parseInt(str_id);
	  
		Configuration confg=new Configuration();
        confg.configure("Hibernate.cfg1.xml");
        
        SessionFactory factory=confg.buildSessionFactory();
        System.out.println("Factory config===>"+factory);
        Session ses=factory.openSession();
        
        Criteria ct=ses.createCriteria(Accounts.class);
        //ct.add(Restrictions.eq("aid",accnts_id));
        ct.add(Restrictions.gt("aid", accnts_id));
        List<Accounts> lst=ct.list();
        
        Iterator<Accounts> itr =lst.iterator(); 
		while (itr.hasNext()==true) 
        { 
			Accounts acc= (Accounts)itr.next(); 
		System.out.println(acc.getBalance());
        }
        factory.close();
        ses.close();
	}

}
