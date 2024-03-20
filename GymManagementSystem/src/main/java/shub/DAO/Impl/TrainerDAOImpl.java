package shub.DAO.Impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import shub.DAO.TrainerDAO;
import shub.Model.Trainer;

public class TrainerDAOImpl implements TrainerDAO {
	private SessionFactory sessionFactory;

    public TrainerDAOImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void addTrainer(Trainer trainer) {
        Session session = sessionFactory.openSession();
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.save(trainer);
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
    public void updateTrainer(Trainer trainer) {
        Session session = sessionFactory.openSession();
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.update(trainer);
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
    public void deleteTrainer(int trainerId) {
        Session session = sessionFactory.openSession();
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            Trainer trainer = session.get(Trainer.class, trainerId);
            if (trainer != null) {
                session.delete(trainer);
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
    public void exitTrainer(int trainerId) {
        Session session = sessionFactory.openSession();
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            Trainer trainer = session.get(Trainer.class, trainerId);
            if (trainer != null) {
                session.delete(trainer);
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
    public Trainer getTrainerById(int trainerId) {
        try (Session session = sessionFactory.openSession()) {
            return session.get(Trainer.class, trainerId);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public List<Trainer> getAllTrainers() {
        try (Session session = sessionFactory.openSession()) {
            return session.createQuery("FROM Trainer", Trainer.class).list();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}