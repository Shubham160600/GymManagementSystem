package shub.Service;

import java.util.List;

import shub.DAO.TrainerDAO;
import shub.Model.Trainer;

public class TrainerServiceImpl implements TrainerService {
    private TrainerDAO trainerDAO;

    public TrainerServiceImpl(TrainerDAO trainerDAO) {
        this.trainerDAO = trainerDAO;
    }

    @Override
    public void addTrainer(Trainer trainer) {
        trainerDAO.addTrainer(trainer);
    }

    @Override
    public void updateTrainer(Trainer trainer) {
        trainerDAO.updateTrainer(trainer);
    }

    @Override
    public void deleteTrainer(int trainerId) {
        trainerDAO.deleteTrainer(trainerId);
    }

    @Override
    public void exitTrainer(int trainerId) {
        trainerDAO.exitTrainer(trainerId);
    }

    @Override
    public Trainer getTrainerById(int trainerId) {
        return trainerDAO.getTrainerById(trainerId);
    }

    @Override
    public List<Trainer> getAllTrainers() {
        return trainerDAO.getAllTrainers();
    }
}
