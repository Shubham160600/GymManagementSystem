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







//import java.util.List;
//
//import gym.DAOImpl.TrainerDao;
//import gym.Model.Trainer;
//import gym.ServiceImpl.TrainerService;
//
//public class TrainerService implements TrainerService {
//	TrainerDao tdao = new TrainerDao();
//	
//	@Override
//	public void createTrainer(Trainer trainer) {
//		tdao.createTrainer(trainer);
//			
//	}
//
//	@Override
//	public void updateTrainer(Trainer trainer) {
//		tdao.updateTrainer(trainer);
//	}
//
//	@Override
//	public void deleteTrainer(Trainer trainer) {
//		tdao.deleteTrainer(trainer);
//	}
//
//	@Override
//	public List<Trainer> getAllTrainers() {
//		return tdao.getAllTrainers();
//	}
//
//	@Override
//	public Trainer getTrainerById(long trainerId) {
//        return tdao.getTrainerById(trainerId);
//	}
//}
//
////	@Override
////	public void addTrainer(Trainer trainer) {
////		// TODO Auto-generated method stub
////		
////	}
	
















//import gym.DAOImpl.TrainerDAOImpl;
//import gym.Model.Trainer;
//import java.util.List;
//
//public class TrainerService {
//
//    private TrainerDAOImpl trainerDAO;
//
//    public TrainerService() {
//        this.trainerDAO = new TrainerDAOImpl();
//    }
//    
//    
//
//    // Method to save a new trainer
//    public void saveTrainer(Trainer trainer) {
//        trainerDAO.addTrainer(trainer);
//    }
//
//    // Method to update a trainer
//    public void updateTrainer(Trainer trainer) {
//        trainerDAO.updateTrainer(trainer);
//    }
//
//    // Method to display all trainers
//    public List<Trainer> getAllTrainers() {
//        return trainerDAO.getAllTrainers();
//    }
//
//    // Method to delete a trainer
//    public void deleteTrainer(int trainerId) {
//        trainerDAO.deleteTrainer(trainerId);
//    }
//}
