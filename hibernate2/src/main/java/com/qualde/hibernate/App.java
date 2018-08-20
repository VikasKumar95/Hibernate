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
        user.setUid(101);
        user.setName("Vikas");
        user.setMarks(80);
        
        User user1=new User();
        user1.setUid(102);
        user1.setName("Ankur");
        user1.setMarks(40);
        
        Course course1=new Course();
        course1.setCid(1);
        course1.setCname("Java");
        course1.setFees(10000);
        
        Course course2=new Course();
        course2.setCid(2);
        course2.setCname("Python");
        course2.setFees(8000);
        
        Course course3=new Course();
        course3.setCid(3);
        course3.setCname("ASP.net");
        course3.setFees(12000);
       
        user.getCourseList().add(course2);
        user.getCourseList().add(course3);
        user1.getCourseList().add(course1);
        user1.getCourseList().add(course2);
        
        
        Session session=factory.getCurrentSession();
        Transaction tx=session.beginTransaction();
      //  session.save(address);
        session.save(user);  
        session.save(user1);
        
        tx.commit();
        System.out.println("completed");
        
            
    }
}
