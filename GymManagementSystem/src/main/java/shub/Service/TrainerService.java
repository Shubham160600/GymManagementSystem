package shub.Service;

import java.util.List;

import shub.Model.Trainer;

public interface TrainerService {
    void addTrainer(Trainer trainer);

    void updateTrainer(Trainer trainer);

    void deleteTrainer(int trainerId);

    Trainer getTrainerById(int trainerId);

    List<Trainer> getAllTrainers();

    void exitTrainer(int trainerId);
}
