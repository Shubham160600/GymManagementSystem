package gym.DAOImpl;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import org.hibernate.query.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import gym.DAO.TrainerDAO;
import gym.Model.Trainer;
import gym.Utility.HibernateUtil;

public class TrainerDao implements TrainerDAO {
    Scanner scanner = new Scanner(System.in);
    private SessionFactory sessionFactory;
    private TrainerDAO tdao;

    public TrainerDao() {
        this.sessionFactory = HibernateUtil.getSessionFactory();

    }

    @Override
    public void createTrainer(Trainer trainer) {
        Transaction transaction = null;
        try (Session session = sessionFactory.openSession()) {
            transaction = session.beginTransaction();
            // Creating a new customer instance
            Trainer newTrainer = new Trainer();
            long tid = 1;
            // Getting input from user for customer details
            System.out.println("Enter First Name: ");
            String fName = scanner.nextLine();
            System.out.println("Enter Last Name: ");
            String lName = scanner.nextLine();
            System.out.println("Enter Gender: ");
            String gender = scanner.nextLine();
            System.out.println("Enter Contact Number: ");
            String cNumber = scanner.nextLine();
            System.out.println("Enter Email: ");
            String email = scanner.nextLine();
            System.out.println("Enter Address: ");
            String address = scanner.nextLine();

            newTrainer.setFirstName(fName);
            newTrainer.setLastName(lName);
            newTrainer.setGender(gender);
            newTrainer.setContactNumber(cNumber);
            newTrainer.setEmail(email);
            newTrainer.setAddress(address);
            newTrainer.setHireDate(new Date());

            // Saving trainer object in the database
            session.save(newTrainer);
            transaction.commit();

            System.out.println("Trainer created successfully");

            session.close();

        } catch (Exception e) {
            System.out.println("Trainer Already Exist !");
            System.out.println("Try again with Different Trainer ID");

            if (transaction != null) {
                transaction.rollback();
            }
        }
    }

    @Override
    public void updateTrainer(Trainer trainer) {
        Transaction transaction = null;
        try (Session session = sessionFactory.openSession()) {
            transaction = session.beginTransaction();
            System.out.println("Enter Trainer ID to update: ");
            long tId = scanner.nextLong();
            scanner.nextLine(); // consume the newline character
            Trainer trainerToUpdate = session.get(Trainer.class, tId);

            if (trainerToUpdate != null) {
                System.out.println("Enter updated First Name: ");
                String fName = scanner.nextLine();
                System.out.println("Enter updated Last Name: ");
                String lName = scanner.nextLine();
                System.out.println("Enter updated Gender: ");
                String gender = scanner.nextLine();
                System.out.println("Enter updated Contact Number: ");
                String cNumber = scanner.nextLine();
                System.out.println("Enter updated Email: ");
                String email = scanner.nextLine();
                System.out.println("Enter updated Address: ");
                String address = scanner.nextLine();

                trainerToUpdate.setFirstName(fName);
                trainerToUpdate.setLastName(lName);
                trainerToUpdate.setGender(gender);
                trainerToUpdate.setContactNumber(cNumber);
                trainerToUpdate.setEmail(email);
                trainerToUpdate.setAddress(address);

                trainerToUpdate.setHireDate(new Date());

                session.save(trainerToUpdate);
                transaction.commit();

                System.out.println("Trainer updated successfully");
            } else {
                System.out.println("Trainer ID" + tId + "not found");
            }
            // session.close();

        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    // @Override
    public void deleteTrainer(Trainer trainer) {
        Transaction transaction = null;
        try (Session session = sessionFactory.openSession()) {
            transaction = session.beginTransaction();
            System.out.println("Enter trainer Id to delete: ");
            long tid = scanner.nextLong();
            Trainer trainerToDelete = session.get(Trainer.class, tid);

            if (trainerToDelete != null) {
                session.delete(trainerToDelete);
                transaction.commit();
                System.out.println("Trainer deleted successfully.");
            } else {
                System.out.println("Trainer ID " + tid + " not found.");
            }
            session.close();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    // @Override
    public List<Trainer> displayAllTrainers() {
        try (Session session = sessionFactory.openSession()) {
            String hql = "from Trainer";
            Query<Trainer> q = session.createQuery(hql, Trainer.class);
            List<Trainer> trainers = q.getResultList();
            for (Trainer trainer : trainers) {
                System.out.println("ID: " + trainer.getId() +
                        ", First Name: " + trainer.getFirstName() +
                        ", Last Name: " + trainer.getLastName() +
                        ", Gender: " + trainer.getGender() +
                        ", Contact Number: " + trainer.getContactNumber() +
                        ", Email: " + trainer.getEmail() +
                        ", Address: " + trainer.getAddress() +
                        ", Hire Date: " + trainer.getHireDate());
            }
            return trainers;

        } catch (Exception e) {
            System.out.println("Failed to display trainers!");
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public Trainer getTrainerById(long trainerId) {
        return tdao.getTrainerById(trainerId);
    }

    public List<Trainer> getAllTrainers() {
        // TODO Auto-generated method stub
        return null;
    }

//    @Override
//    public void deleteTrainer(Trainer trainer) {
//        // TODO Auto-generated method stub
//
//    }

//    @Override
//    public List<Trainer> displayAllTrainers() {
//        // TODO Auto-generated method stub
//        return null;
//    }
}