package shub.DAO.Impl;


import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import shub.DAO.AttendanceDAO;
import shub.Model.Attendance;

public class AttendanceDAOImpl implements AttendanceDAO {
    private SessionFactory sessionFactory;

    public AttendanceDAOImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void markAttendance(Attendance attendance) {
        Session session = sessionFactory.openSession();
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.save(attendance);
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
    public void updateAttendance(Attendance attendance) {
        Session session = sessionFactory.openSession();
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.update(attendance);
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
    public void deleteAttendance(int attendanceId) {
        Session session = sessionFactory.openSession();
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            Attendance attendance = session.get(Attendance.class, attendanceId);
            if (attendance != null) {
                session.delete(attendance);
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
    public void exitAttendance(int attendanceId) {
        Session session = sessionFactory.openSession();
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            Attendance attendance = session.get(Attendance.class, attendanceId);
            if (attendance != null) {
                session.delete(attendance);
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
    public Attendance getAttendanceById(int attendanceId) {
        try (Session session = sessionFactory.openSession()) {
            return session.get(Attendance.class, attendanceId);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public List<Attendance> getAllAttendances() {
        try (Session session = sessionFactory.openSession()) {
            return session.createQuery("FROM Attendance", Attendance.class).list();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}