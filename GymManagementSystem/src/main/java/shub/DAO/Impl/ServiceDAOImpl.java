package shub.DAO.Impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.service.Service;

import shub.DAO.ServiceDAO;
import shub.Service.GymService;

import java.util.List;

public class ServiceDAOImpl implements ServiceDAO {
    private SessionFactory sessionFactory;

    public ServiceDAOImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    // @Override
    public void addService(GymService service) {
        Session session = sessionFactory.openSession();
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.save(service);
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

    // @Override
    public void updateService(GymService service) {
        Session session = sessionFactory.openSession();
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.update(service);
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
    public void deleteService(int serviceId) {
        Session session = sessionFactory.openSession();
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            Service service = session.get(Service.class, serviceId);
            if (service != null) {
                session.delete(service);
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
    public void exitService(int serviceId) {
        Session session = sessionFactory.openSession();
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            Service service = session.get(Service.class, serviceId);
            if (service != null) {
                session.delete(service);
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
    public GymService getServiceById(int serviceId) {
        try (Session session = sessionFactory.openSession()) {
            return session.get(GymService.class, serviceId);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public List<GymService> getAllServices() {
        try (Session session = sessionFactory.openSession()) {
            return session.createQuery("FROM Service", GymService.class).list();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public void addService(Service service) {
        // TODO Auto-generated method stub

    }

    @Override
    public void updateService(Service service) {
        // TODO Auto-generated method stub

    }
}
