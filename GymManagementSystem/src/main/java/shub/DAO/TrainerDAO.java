// TrainerDAO.java
package shub.DAO;

import shub.Model.Trainer;

import java.util.List;

public interface TrainerDAO {
    void addTrainer(Trainer trainer);

    void updateTrainer(Trainer trainer);

    void deleteTrainer(int trainerId);

    void exitTrainer(int trainerId);

    Trainer getTrainerById(int trainerId);

    List<Trainer> getAllTrainers();
}
