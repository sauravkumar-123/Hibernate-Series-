package com.Hibernate.Project_Maven3;


import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class BankRunner {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
        //made data variable.
		String stringempid,empname,stringempage,stringempmobno,empemail,empdeptname,stringempsalary;
		int empid,empage;
		long empmobno;
		double empsalary;
		char empgender;
		
		String stringaccntid1,accnttype1,bankname1,ifsccode1,stringcheck1,stringaccntbalance1;
		int accntid1;
		boolean status1;
		double accntbalance1;
		
		String stringaccntid2,accnttype2,bankname2,ifsccode2,stringcheck2,stringaccntbalance2;
		int accntid2;
		boolean status2;
		double accntbalance2;
		
		String stringaccntid3,accnttype3,bankname3,ifsccode3,stringcheck3,stringaccntbalance3;
		int accntid3;
		boolean status3;
		double accntbalance3;
		
		//Configuration object.
		Configuration confg=new Configuration();
        confg.configure("Hibernate.cfg1.xml");
        
        SessionFactory factory=confg.buildSessionFactory();
        System.out.println("Factory config===>"+factory);
        
        //get data through user.
        Scanner scan=new Scanner(System.in);
        System.out.println("please enter emp_id,emp_name,emp_age,emp_gender,emp_mobno,emp_email,emp_deptname and emp_salary");
        stringempid=scan.nextLine();
        empid=Integer.parseInt(stringempid.trim());
        
        empname=scan.nextLine();
        
        stringempage=scan.nextLine();
        empage=Integer.parseInt(stringempage.trim());
        
        empgender=scan.nextLine().charAt(0);
        
        stringempmobno=scan.nextLine();
        empmobno=Long.parseLong(stringempmobno.trim());
        
        empemail=scan.nextLine();
        empdeptname=scan.nextLine();
        
        stringempsalary=scan.nextLine();
        empsalary=Double.parseDouble(stringempsalary.trim());
        
        System.out.println("please enter Acccount_id,Account_type,Bank_name,IFSC code,Account_status and Accnt_balance");
        stringaccntid1=scan.nextLine();
        accntid1=Integer.parseInt(stringaccntid1.trim());
        
        accnttype1=scan.nextLine();
        bankname1=scan.nextLine();
        ifsccode1=scan.nextLine();
        
        stringcheck1=scan.nextLine();
        status1=Boolean.parseBoolean(stringcheck1.trim());
        
        stringaccntbalance1=scan.nextLine();
        accntbalance1=Double.parseDouble(stringaccntbalance1.trim());
        
        System.out.println("please enter Again Acccount_id,Account_type,Bank_name,IFSC code,Account_status and Accnt_balance");
        stringaccntid2=scan.nextLine();
        accntid2=Integer.parseInt(stringaccntid2.trim());
        
        accnttype2=scan.nextLine();
        bankname2=scan.nextLine();
        ifsccode2=scan.nextLine();
        
        stringcheck2=scan.nextLine();
        status2=Boolean.parseBoolean(stringcheck2.trim());
        
        stringaccntbalance2=scan.nextLine();
        accntbalance2=Double.parseDouble(stringaccntbalance2.trim());
        
        System.out.println("please enter Again Acccount_id,Account_type,Bank_name,IFSC code,Account_status and Accnt_balance");
        stringaccntid3=scan.nextLine();
        accntid3=Integer.parseInt(stringaccntid3.trim());
        
        accnttype3=scan.nextLine();
        bankname3=scan.nextLine();
        ifsccode3=scan.nextLine();
        
        stringcheck3=scan.nextLine();
        status3=Boolean.parseBoolean(stringcheck3.trim());
        
        stringaccntbalance3=scan.nextLine();
        accntbalance3=Double.parseDouble(stringaccntbalance3.trim());
        //creating employee object.
        Employee emp=new Employee();
        emp.setEmpid(empid);
        emp.setName(empname);
        emp.setAge(empage);
        emp.setGender(empgender);
        emp.setMobno(empmobno);
        emp.setEmailid(empemail);
        emp.setDeptname(empdeptname);
        emp.setSalary(empsalary);
        
        File file = new File("src/main/java/images/my PHOTO.jpg");
        byte[] image = new byte[(int) file.length()];
 
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            fileInputStream.read(image);
            fileInputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
		emp.setImage(image);
        
      //creating 3-Accounts object.
        Accounts acc1=new Accounts();
        acc1.setAid(accntid1);
        acc1.setAccnttype(accnttype1);
        acc1.setBankname(bankname1);
        acc1.setIfsc(ifsccode1);
        acc1.setIsopen(status1);
        acc1.setBalance(accntbalance1);
        
        Accounts acc2=new Accounts();
        acc2.setAid(accntid2);
        acc2.setAccnttype(accnttype2);
        acc2.setBankname(bankname2);
        acc2.setIfsc(ifsccode2);
        acc2.setIsopen(status2);
        acc2.setBalance(accntbalance2);
        
        Accounts acc3=new Accounts();
        acc3.setAid(accntid3);
        acc3.setAccnttype(accnttype3);
        acc3.setBankname(bankname3);
        acc3.setIfsc(ifsccode3);
        acc3.setIsopen(status3);
        acc3.setBalance(accntbalance3);
        
        List<Accounts> list=new ArrayList<Accounts>();
        list.add(acc1);
        list.add(acc2);
        list.add(acc3);
        
        emp.setAccnts(list);
        
        acc1.setEmp(emp);
        acc2.setEmp(emp);
        acc3.setEmp(emp);
		Session ses=factory.openSession();
		//Session ses=factory.getCurrentSession();
		Transaction tx=ses.beginTransaction();
		//save
		ses.save(emp);
		
		//through cascading not requried to save manually.
		/*ses.save(acc1);
		ses.save(acc2);
		ses.save(acc3);*/
		
	    tx.commit();
	    ses.close();
		factory.close();
		System.out.println("Done---->");

	}

}
