package shub.Utility;

import org.hibernate.*;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import shub.Model.Attendance;
import shub.Model.Member;
import shub.Model.Trainer;

public class HibernateUtil {
	private final static SessionFactory sessionFactory=buildSessionFactory();
	private static SessionFactory buildSessionFactory()
	{
		try {
			return new Configuration().configure("hibernate.cfg.xml")
					.addAnnotatedClass(Member.class)
					.addAnnotatedClass(Trainer.class)
					.addAnnotatedClass(Class.class)
					.addAnnotatedClass(Attendance.class)
					.buildSessionFactory();
		} catch (Throwable e) {
			throw new ExceptionInInitializerError(e);
		}
	}
	
	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	
	public static Session getSession()
	{
		return getSessionFactory().openSession(); //session opened
	}
}


//import org.hibernate.SessionFactory;
//import org.hibernate.cfg.Configuration;
//
//public class HibernateUtil {
//    private static final SessionFactory sessionFactory;
//    
//    static {
//        try {
//            sessionFactory = new Configuration().configure().buildSessionFactory();
//        } catch (Throwable ex) {
//            System.err.println("Initial SessionFactory creation failed." + ex);
//            throw new ExceptionInInitializerError(ex);
//        }
//    }
//    
//    public static SessionFactory getSessionFactory() {
//        return sessionFactory;
//    }
//}
