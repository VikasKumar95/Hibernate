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
        
        User user=new User();
        user.setUid(102);
        user.setName("Vikas");
        user.setMarks(80);
       
        Laptop laptop1=new Laptop(100001,"HP");
        laptop1.setUser(user);
        Laptop laptop2=new Laptop(100002,"DELL");
        laptop2.setUser(user);
        Laptop laptop3=new Laptop(100003,"HP");
        laptop3.setUser(user);
       
        
        
        
        
        Session session=factory.getCurrentSession();
        Transaction tx=session.beginTransaction();
      //  session.save(address);
        session.save(laptop1);  
        session.save(laptop2); 
        session.save(laptop3); 
        
        tx.commit();
        System.out.println("completed");
        
            
    }
}
