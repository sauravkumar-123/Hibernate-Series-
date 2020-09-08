package com.Hibernate.Project_Maven3;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class GetBankDetails_2nd_level_Cache {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int empid,accntid;
			//Configuration object.
					Configuration confg=new Configuration();
			        confg.configure("Hibernate.cfg1.xml");
			        
			        SessionFactory factory=confg.buildSessionFactory();
			        System.out.println("Factory config===>"+factory);
			        
			        
			        //enter detail to fetch data.
			        Scanner scan=new Scanner(System.in);
			        System.out.println("enter emp_id and account_id");
			        empid=scan.nextInt();
			        accntid=scan.nextInt();
			        
			        //get data and load data.
			        // data through session 1st
			        System.out.println("Cache first level and second level");
			        Session ses=factory.openSession();
			        /*
			        try {
			        Employee emp=(Employee)ses.get(Employee.class,empid);
	                System.out.println(emp.getEmpid()+"->"+emp.getName()+"->"+emp.getAge()+"->"+emp.getGender()+"->"+emp.getMobno()+"->"+emp.getEmailid()+"->"+emp.getDeptname()+"->"+emp.getSalary()+"->"+emp.getImage()+"->"+emp.getAccnts().size());		        
			        }
			        catch(Exception e)
			        {
			        	e.printStackTrace();
			        	System.out.println("Wrong employee_id!!!!!!");
			        }
			        */
			        
			        
			       
			        try {
	                Accounts acc=(Accounts)ses.load(Accounts.class,accntid);
	                System.out.println(acc.getAid()+"->"+acc.getAccnttype()+"->"+acc.getBankname()+">"+acc.getIfsc()+"->"+acc.getBalance());
			        }
			        catch(Exception e)
			        {
			        	e.printStackTrace();
	                	System.out.println("Wrong Account_id!!!!!!");
			        }
	                 ses.close();
	                 
	                 
	                 //// data through session 2nd
	                 Session ses1=factory.openSession();
	                 /*
	                 try {
	 			        Employee emp1=(Employee)ses1.get(Employee.class,empid);
	 	                System.out.println(emp1.getEmpid()+"->"+emp1.getName()+"->"+emp1.getAge()+"->"+emp1.getGender()+"->"+emp1.getMobno()+"->"+emp1.getEmailid()+"->"+emp1.getDeptname()+"->"+emp1.getSalary()+"->"+emp1.getImage()+"->"+emp1.getAccnts().size());		        
	 			        }
	 			        catch(Exception e)
	 			        {
	 			        	e.printStackTrace();
	 			        	System.out.println("Wrong employee_id!!!!!!");
	 			        }
	 			        
	 			        
	 			        */
	 			        try {
	 	                Accounts acc1=(Accounts)ses1.load(Accounts.class,accntid);
	 	                System.out.println(acc1.getAid()+"->"+acc1.getAccnttype()+"->"+acc1.getBankname()+">"+acc1.getIfsc()+"->"+acc1.getBalance());
	 			        }
	 			        catch(Exception e)
	 			        {
	 			        	e.printStackTrace();
	 	                	System.out.println("Wrong Account_id!!!!!!");
	 			        }
	               
	                 ses1.close();
	                 
			        factory.close();
			        
			        System.out.println("The end--->");
			        
		}

	}

	