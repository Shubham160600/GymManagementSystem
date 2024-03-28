package gym.ServiceImpl;

import java.util.List;
import gym.DAOImpl.TrainerDao;
import gym.Model.Trainer;
import gym.Service.TrainerService;

public class TrainerServiceImpl implements TrainerService {
	TrainerDao tdao = new TrainerDao();

	@Override
	public void createTrainer(Trainer trainer) {
		tdao.createTrainer(trainer);

	}

	@Override
	public void updateTrainer(Trainer trainer) {
		tdao.updateTrainer(trainer);
	}

	// @Override
	public void deleteTrainer(long trainerId) {
		tdao.deleteTrainer(trainerId);
	}

	@Override
	public List<Trainer> getAllTrainers() {
		return tdao.getAllTrainers();
	}

	@Override
	public Trainer getTrainerById(long trainerId) {
		return tdao.getTrainerById(trainerId);
	}

	@Override
	public void deleteTrainer(Trainer trainer) {
		tdao.deleteTrainer(trainer);
	}
}