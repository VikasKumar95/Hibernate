package com.qualde.hibernate;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        SessionFactory factory=HibernateUtil.getSessionFactory();
        
        Employee e=new Employee();
        e.setName("Vikas Kumar");
         
        
        RegularEmployee e1=new RegularEmployee();
        e1.setName("Rohit");
        e1.setSalary(40000);
        e1.setBonus(2000);
        
        ContractEmployee e2=new ContractEmployee();
        e2.setName("ANkur");
        e2.setPay(300);
        e2.setDuration(8);
        
        
        Session session=factory.getCurrentSession();
        Transaction tx=session.beginTransaction();
      
        session.save(e);  
        session.save(e1);  

        session.save(e2);  

        
        tx.commit();
        System.out.println("completed");
        
            
    }
}
