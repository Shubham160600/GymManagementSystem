package shub.DAO.Impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import shub.DAO.ClassDAO;
import shub.Model.Class;

public class ClassDAOImpl implements ClassDAO {
    private SessionFactory sessionFactory;

    public ClassDAOImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void addClass(Class Class) {
        Session session = sessionFactory.openSession();
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.save(Class);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        } finally {
            session.close();
        }
    }

    @Override
    public void updateClass(Class Class) {
        Session session = sessionFactory.openSession();
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.update(Class);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        } finally {
            session.close();
        }
    }

    @Override
    public void deleteClass(int classId) {
        Session session = sessionFactory.openSession();
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            Class Class = session.get(Class.class, classId);
            if (Class != null) {
                session.delete(Class);
            }
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        } finally {
            session.close();
        }
    }
    
    @Override
    public void exitClass(int classId) {
        Session session = sessionFactory.openSession();
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            Class Class = session.get(Class.class, classId);
            if (Class != null) {
                session.delete(Class);
            }
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        } finally {
            session.close();
        }
    }

    @Override
    public Class getClassById(int classId) {
        try (Session session = sessionFactory.openSession()) {
            return session.get(Class.class, classId);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

//    @Override
    public List<Class> getAllClass() {
        try (Session session = sessionFactory.openSession()) {
            return session.createQuery("FROM Class", Class.class).list();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public List<Class> getAllClasses() {
    	// TODO Auto-generated method stub
    	return null;
    }
}



