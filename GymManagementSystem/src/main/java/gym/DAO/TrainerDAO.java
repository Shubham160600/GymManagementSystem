package gym.DAO;

import gym.Model.Trainer;
import java.util.List;

public interface TrainerDAO {

    // Create a new trainer
    public void createTrainer(Trainer trainer);

    // Update an existing trainer
    public void updateTrainer(Trainer trainer);

    // Delete a trainer
    public void deleteTrainer(Trainer trainer);

    // Retrieve all trainers
    List<Trainer> displayAllTrainers();

    // Retrieve a trainer by their ID
    Trainer getTrainerById(long trainerId);
}


/*
 * 
 * import org.hibernate.Session; import org.hibernate.Transaction; import
 * org.hibernate.query.Query;
 * 
 * import gym.Model.Trainer; import gym.Utility.HibernateUtil;
 * 
 * import java.util.List;
 * 
 * public class TrainerDAO {
 * 
 * // Method to save a new trainer public void addTrainer(Trainer trainer) {
 * Transaction transaction = null; try (Session session =
 * HibernateUtil.getSessionFactory().openSession()) { transaction =
 * session.beginTransaction(); session.save(trainer); transaction.commit(); }
 * catch (Exception e) { if (transaction != null) { transaction.rollback(); }
 * e.printStackTrace(); } }
 * 
 * // Method to update a trainer public void updateTrainer(Trainer trainer) {
 * Transaction transaction = null; try (Session session =
 * HibernateUtil.getSessionFactory().openSession()) { transaction =
 * session.beginTransaction(); session.update(trainer); transaction.commit(); }
 * catch (Exception e) { if (transaction != null) { transaction.rollback(); }
 * e.printStackTrace(); } }
 * 
 * // Method to display all trainers public List<Trainer> getAllTrainers() { try
 * (Session session = HibernateUtil.getSessionFactory().openSession()) { return
 * session.createQuery("FROM Trainer", Trainer.class).list(); } }
 * 
 * // Method to delete a trainer public void deleteTrainer(int trainerId) {
 * Transaction transaction = null; try (Session session =
 * HibernateUtil.getSessionFactory().openSession()) { transaction =
 * session.beginTransaction(); Trainer trainer = session.get(Trainer.class,
 * trainerId); if (trainer != null) { session.delete(trainer);
 * transaction.commit(); } } catch (Exception e) { if (transaction != null) {
 * transaction.rollback(); } e.printStackTrace(); } } }
 */