package gym.Service;

import java.util.List;

import gym.Model.Trainer;

public interface TrainerService {

    // Create a new trainer
    void createTrainer(Trainer trainer);

    // Update an existing trainer
    void updateTrainer(Trainer trainer);

    // Delete a trainer
    void deleteTrainer(Trainer trainer);

    // Retrieve all trainers
    List<Trainer> getAllTrainers();

    // Retrieve a trainer by their ID
    Trainer getTrainerById(long trainerId);
}