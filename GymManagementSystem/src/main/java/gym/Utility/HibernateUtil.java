package gym.Utility;


import org.hibernate.*;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import gym.Model.Trainer;
import gym.Model.Member;

public class HibernateUtil {
	private final static SessionFactory sessionFactory =buildSessionFactory();
	  
	  private static SessionFactory buildSessionFactory()
	  {
		  try
		  {
	          // Create a new Configuration object
			  return new Configuration().configure("hibernate.cfg.xml")
					     
					     .addAnnotatedClass(Trainer.class)
					     .addAnnotatedClass(Member.class)
					     
					     .buildSessionFactory();
		  }
		  catch(Throwable e)
		  {
			  throw new ExceptionInInitializerError(e);
		  }
	  }
	  
	  public static SessionFactory getSessionFactory() {
		  return sessionFactory;
	  }
	  
	  public static Session getSession() {
		  return getSessionFactory().openSession();          //session opened
	  }
}