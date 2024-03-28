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