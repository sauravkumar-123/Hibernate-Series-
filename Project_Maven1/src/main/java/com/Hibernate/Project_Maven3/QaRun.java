package com.Hibernate.Project_Maven3;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class QaRun {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		
		String qname,sqid;
		int qid;
		
		
		String aname,said;
		int aid;
		
		Scanner scan=new Scanner(System.in);
		System.out.println("enter question_id,question_name and answer_id,answer_name");
		
		sqid=scan.nextLine();
		qid=Integer.parseInt(sqid);
		
		qname=scan.nextLine();
		
		said=scan.nextLine();
		aid=Integer.parseInt(said);
		
		aname=scan.nextLine();
		Configuration confg=new Configuration();
        confg.configure("Hibernate.cfg1.xml");
        
        SessionFactory factory=confg.buildSessionFactory();
		System.out.println(factory);
		
		//Question object
	    Question qn=new Question();
	    qn.setQuestionId(qid);
	    qn.setQuestion(qname);
	    
		//Answer object
	    Answer as=new Answer();
	    as.setAnswerId(aid);
	    as.setAnswer(aname);
	    
	    as.setQs(qn);
	    qn.setAnswer(as);
		
		
		Session ses=factory.openSession();
		//Session ses=factory.getCurrentSession();
		
		Transaction tx=ses.beginTransaction();
		
		//save
		ses.save(qn);
		ses.save(as);
		
	    tx.commit();
	    
	    //get data  and load data.
	    Question qs=(Question)ses.get(Question.class,qid);
	    System.out.println(qs.getQuestionId()+" "+qs.getAnswer());
	    ses.close();
		factory.close();
		System.out.println("Done-->");

	}

}
