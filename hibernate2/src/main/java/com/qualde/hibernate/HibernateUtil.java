package com.qualde.hibernate;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	
	static SessionFactory sessionFactory;
	static {
		
		Configuration cfg=new Configuration().configure();
		StandardServiceRegistryBuilder ssrbuilder=new StandardServiceRegistryBuilder();
		StandardServiceRegistry ssRegistry=ssrbuilder.applySettings(cfg.getProperties()).build();
		sessionFactory=cfg.buildSessionFactory(ssRegistry);
		
		
	}
	
	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}

}
