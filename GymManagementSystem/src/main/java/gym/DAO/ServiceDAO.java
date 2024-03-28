//package gym.DAO;
//
//import org.hibernate.Session;
//import org.hibernate.Transaction;
//import org.hibernate.query.Query;
//
//import gym.Model.Service;
//import gym.Utility.HibernateUtil;
//
//import java.util.List;
//
//public class ServiceDAO {
//
//    // Method to save a new service
//    public void addService(Service service) {
//        Transaction transaction = null;
//        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
//            transaction = session.beginTransaction();
//            session.save(service);
//            transaction.commit();
//        } catch (Exception e) {
//            if (transaction != null) {
//                transaction.rollback();
//            }
//            e.printStackTrace();
//        }
//    }
//
//    // Method to update a service
//    public void updateService(Service service) {
//        Transaction transaction = null;
//        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
//            transaction = session.beginTransaction();
//            session.update(service);
//            transaction.commit();
//        } catch (Exception e) {
//            if (transaction != null) {
//                transaction.rollback();
//            }
//            e.printStackTrace();
//        }
//    }
//
//    // Method to display all services
//    public List<Service> getAllServices() {
//        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
//            return session.createQuery("FROM Service", Service.class).list();
//        }
//    }
//
//    // Method to delete a service
//    public void deleteService(int serviceId) {
//        Transaction transaction = null;
//        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
//            transaction = session.beginTransaction();
//            Service service = session.get(Service.class, serviceId);
//            if (service != null) {
//                session.delete(service);
//                transaction.commit();
//            }
//        } catch (Exception e) {
//            if (transaction != null) {
//                transaction.rollback();
//            }
//            e.printStackTrace();
//        }
//    }
//}
