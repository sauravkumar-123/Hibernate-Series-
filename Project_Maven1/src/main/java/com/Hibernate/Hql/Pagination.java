package com.Hibernate.Hql;

import org.hibernate.query.NativeQuery;
import org.hibernate.query.Query;

import com.Hibernate.Project_Maven3.Accounts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Pagination {
	String id1,id2;
	int input_id1,input_id2;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pagination pg=new Pagination();
		Scanner scan=new Scanner(System.in);
		System.out.println("enter start index and max_result per page");
		pg.id1=scan.nextLine();
		pg.input_id1=Integer.parseInt(pg.id1);
		
		pg.id2=scan.nextLine();
		pg.input_id2=Integer.parseInt(pg.id2);
		
		SessionFactory factory=new Configuration().configure("Hibernate.cfg1.xml").buildSessionFactory();
		Session ses=factory.openSession();
		
		Query<Accounts> qry=ses.createQuery("from Accounts",Accounts.class);
		//implemented Pagination.
		qry.setFirstResult(pg.input_id1);
		qry.setMaxResults(pg.input_id2);
		
		List<Accounts> list=qry.getResultList();
		Iterator<Accounts> itr =list.iterator(); 
		while (itr.hasNext()==true) 
        { 
		Accounts auth = (Accounts)itr.next(); 
		System.out.println(auth.getAid()+" "+auth.getAccnttype()+" "+auth.getBankname()+" "+auth.getIfsc()+" "+auth.getBalance());
        }
		//Native SQL query.
		String query="select * from accounts";
		NativeQuery nq=ses.createSQLQuery(query);
		List<Object []> lst=(ArrayList<Object[]>)nq.getResultList();
		for(Object [] accnt:lst)
		{
			System.out.println("data through list "+Arrays.toString(accnt)+"---------------->"+accnt[2]+" "+accnt[4]);
		}
		ses.close();
		factory.close();
	}

}
