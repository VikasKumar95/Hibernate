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
        
        Address address=new Address();
        address.setHno(105);
        address.setCity("Amroha");
        address.setCountry("India");
        
       
        user.getLaptops().add(new Laptop(100001,"HP"));
        user.getLaptops().add(new Laptop(100002,"DELL"));
        user.getLaptops().add(new Laptop(10000,"HP"));
        System.out.println(user.getLaptops());
        user.setAddress(address);
        
        
        
        
        Session session=factory.getCurrentSession();
        Transaction tx=session.beginTransaction();
      //  session.save(address);
        session.save(user);  
        
        tx.commit();
        System.out.println("completed");
        
            
    }
}
