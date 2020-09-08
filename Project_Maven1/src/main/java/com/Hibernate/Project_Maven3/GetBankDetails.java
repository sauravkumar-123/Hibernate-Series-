package com.Hibernate.Project_Maven3;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class GetBankDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int empid,accntid;
		//Configuration object.
				Configuration confg=new Configuration();
		        confg.configure("Hibernate.cfg1.xml");
		        
		        SessionFactory factory=confg.buildSessionFactory();
		        System.out.println("Factory config===>"+factory);
		        
		        Session ses=factory.openSession();
		        
		        //enter detail to fetch data.
		        Scanner scan=new Scanner(System.in);
		        System.out.println("enter emp_id and account_id");
		        empid=scan.nextInt();
		        accntid=scan.nextInt();
		        
		        //get data and load data.
		        
		        try {
		        Employee emp=(Employee)ses.get(Employee.class,empid);
                System.out.println(emp.getEmpid()+"->"+emp.getName()+"->"+emp.getAge()+"->"+emp.getGender()+"->"+emp.getMobno()+"->"+emp.getEmailid()+"->"+emp.getDeptname()+"->"+emp.getSalary()+"->"+emp.getImage()+"->"+emp.getAccnts().size());		        
		        }
		        catch(Exception e)
		        {
		        	e.printStackTrace();
		        	System.out.println("Wrong employee_id!!!!!!");
		        }
		        
		        System.out.println("Cache first level and second level");
		        
		        //First level cache(by default enable)
		        //for same object only one time query will be fired.
		        try {
			        Employee emp1=(Employee)ses.get(Employee.class,empid);
	                System.out.println(emp1.getEmpid()+"->"+emp1.getName()+"->"+emp1.getAge()+"->"+emp1.getGender()+"->"+emp1.getMobno()+"->"+emp1.getEmailid()+"->"+emp1.getDeptname()+"->"+emp1.getSalary()+"->"+emp1.getImage()+"->"+emp1.getAccnts().size());		        
			        }
			        catch(Exception e)
			        {
			        	e.printStackTrace();
			        	System.out.println("Wrong employee_id!!!!!!");
			        }
		        
		        System.out.println("<------------------------------------------------------------->");
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
		        factory.close();
		        
		        System.out.println("The end--->");
		        
	}

}
