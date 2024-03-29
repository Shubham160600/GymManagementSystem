package gym.GymManagementSystem;

import java.util.List;
import java.util.Scanner;

import gym.DAOImpl.TrainerDao;
import gym.DAOImpl.MemberDaoImpl;
import gym.Model.Trainer;
import gym.Model.Member;
import gym.ServiceImpl.TrainerServiceImpl;
import gym.ServiceImpl.MemberServiceImpl;

public class App {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        TrainerServiceImpl tService = new TrainerServiceImpl();
        MemberServiceImpl mService = new MemberServiceImpl();

        while (true) {
            System.out.println("Welcome to Gym Management System");
            System.out.println("1. Trainer Management");
            System.out.println("2. Member Management");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (choice) {
                case 1:
                    trainerManagement(tService);
                    break;
                case 2:
                    memberManagement(mService);
                    break;
                case 3:
                    System.out.println("Exiting Gym Management System. Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }

    private static void trainerManagement(TrainerServiceImpl tService) {
        while (true) {
            System.out.println("Trainer Management");
            System.out.println("1. Create Trainer");
            System.out.println("2. Update Trainer");
            System.out.println("3. Delete Trainer");
            System.out.println("4. Display All Trainers");
            System.out.println("5. Back to Main Menu");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (choice) {
                case 1:
                    // Call createTrainer method
                    tService.createTrainer(new Trainer());
                    break;
                case 2:
                    // Call updateTrainer method
                    tService.updateTrainer(new Trainer());
                    break;
                case 3:
                    // Call deleteTrainer method
                    tService.deleteTrainer(new Trainer());
                    break;
                case 4:
                	List<Trainer> trainers = tService.getAllTrainers();
                    if (trainers != null) {
                        // Display all trainers
                        for (Trainer trainer : trainers) {
                            System.out.println(trainer);
                        }
                    } else {
                        System.out.println("There are no trainers available.");
                    }
                	
                	
//                    // Call displayAllTrainers method
//                	System.out.println("All Trainers:");
//                    for (Trainer trainer : tService.getAllTrainers()) {
//                        System.out.println(trainer); // Assuming Trainer class overrides toString method                 
//                        
//                    }
//                    tService.getAllTrainers();
                    break;
                case 5:
                    return; // Return to the main menu
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }

    private static void memberManagement(MemberServiceImpl mService) {
        while (true) {
            System.out.println("Member Management");
            System.out.println("1. Create Member");
            System.out.println("2. Update Member");
            System.out.println("3. Delete Member");
            System.out.println("4. Display All Members");
            System.out.println("5. Back to Main Menu");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (choice) {
                case 1:
                    // Call createMember method
                    mService.createMember(new Member());
                    break;
                case 2:
                    // Call updateMember method
                    mService.updateMember(new Member());
                    break;
                case 3:
                    // Call deleteMember method
                    mService.deleteMember(new Member());
                    break;
                case 4:
                    // Call displayAllMembers method
                    mService.displayAllMember();
                    break;
                case 5:
                    return; // Return to the main menu
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
}