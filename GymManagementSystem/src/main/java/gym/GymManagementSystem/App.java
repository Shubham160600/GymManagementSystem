//package gym.Gym_Management_System;
//
//import java.util.Optional;
//import java.util.Scanner;
//
//import gym.DAOImpl.TrainerDAOImpl;
//import gym.Model.Trainer;
//import gym.ServiceImpl.TrainerServiceImpl;
//
//public class Apd {
//    
//    static Scanner scanner = new Scanner(System.in);
//
//    public static void main(String[] args) {
//        TrainerServiceImpl tService = new TrainerServiceImpl();
//        Trainer trainer = new Trainer();
//
//        while (true) {
//            System.out.println("Welcome to Gym Management System");
//            System.out.println("1. Create Trainer");
//            System.out.println("2. Update Trainer");
//            System.out.println("3. Delete Trainer");
//            System.out.println("4. Display All Trainers");
//            System.out.println("5. Exit");
//
//            System.out.print("Enter your choice: ");
//            int choice = scanner.nextInt();
//            scanner.nextLine();
//
//            switch (choice) {
//                case 1:
//                    createTrainer(tService, trainer);
//                    break;
//                case 2:
//                    updateTrainer(tService);
//                    break;
//                case 3:
//                    deleteTrainer(tService);
//                    break;
//                case 4:
//				TrainerServiceImpl trainerService;
//				displayAllTrainers(trainerService);
//                    break;
//                case 5:
//                    System.out.println("Exiting Gym Management System. Goodbye!");
//                    System.exit(0);
//                default:
//                    System.out.println("Invalid choice. Please enter a valid option.");
//            }
//        }
//    }
//
//    public static void createTrainer(TrainerServiceImpl trainerService, Trainer trainer) {
//        System.out.println("Enter Trainer Details:");
//        System.out.print("First Name: ");
//        trainer.setFirstName(scanner.nextLine());
//        System.out.print("Last Name: ");
//        trainer.setLastName(scanner.nextLine());
//        System.out.print("Gender: ");
//        trainer.setGender(scanner.nextLine());
//        System.out.print("Contact Number: ");
//        trainer.setContactNumber(scanner.nextLine());
//        System.out.print("Email: ");
//        trainer.setEmail(scanner.nextLine());
//        System.out.print("Address: ");
//        trainer.setAddress(scanner.nextLine());
//
//        trainerService.createTrainer(trainer);
//        System.out.println("Trainer created successfully.");
//    }
//
//    public static void updateTrainer(TrainerServiceImpl trainerService) {
//        System.out.print("Enter Trainer ID to update: ");
//        long trainerId = scanner.nextLong();
//        scanner.nextLine(); // consume the newline character
//        Optional<Trainer> optionalTrainer = trainerService.getById(trainerId);
//
//        if (optionalTrainer.isPresent()) {
//            Trainer trainerToUpdate = optionalTrainer.get();
//            System.out.println("Enter updated First Name: ");
//            trainerToUpdate.setFirstName(scanner.nextLine());
//            System.out.println("Enter updated Last Name: ");
//            trainerToUpdate.setLastName(scanner.nextLine());
//            System.out.println("Enter updated Gender: ");
//            trainerToUpdate.setGender(scanner.nextLine());
//            System.out.println("Enter updated Contact Number: ");
//            trainerToUpdate.setContactNumber(scanner.nextLine());
//            System.out.println("Enter updated Email: ");
//            trainerToUpdate.setEmail(scanner.nextLine());
//            System.out.println("Enter updated Address: ");
//            trainerToUpdate.setAddress(scanner.nextLine());
//
//            trainerService.updateTrainer(trainerToUpdate);
//            System.out.println("Trainer updated successfully.");
//        } else {
//            System.out.println("Trainer with ID " + trainerId + " not found.");
//        }
//    }
//
//    public static void deleteTrainer(TrainerServiceImpl trainerService) {
//        System.out.print("Enter Trainer ID to delete: ");
//        long trainerId = scanner.nextLong();
//        scanner.nextLine(); // consume the newline character
//
//        if (trainerService.deleteTrainer(trainerId)) {
//            System.out.println("Trainer deleted successfully.");
//        } else {
//            System.out.println("Trainer with ID " + trainerId + " not found.");
//        }
//    }
//
//    public static void displayAllTrainers(TrainerServiceImpl trainerService) {
//        System.out.println("List of all Trainers:");
//        trainerService.displayAllTrainers().forEach(System.out::println);
//    }
//}
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//import java.util.Scanner;
//import gym.Model.Trainer;
//import gym.ServiceImpl.TrainerServiceImpl;
//
//public class App {
//    static Scanner scanner = new Scanner(System.in);
//
//    public static void main(String[] args) {
//        TrainerServiceImpl tService = new TrainerServiceImpl();
//        Trainer trainer = new Trainer();
//
//        while (true) {
//            System.out.println("Welcome to Gym Management System");
//            System.out.println("1. Create Trainer");
//            System.out.println("2. Update Trainer");
//            System.out.println("3. Delete Trainer");
//            System.out.println("4. Display All Trainers");
//            System.out.println("5. Exit");
//
//            System.out.print("Enter your choice: ");
//            int choice = scanner.nextInt();
//            scanner.nextLine();
//
//            switch (choice) {
//                case 1:
//                    createTrainer(tService, trainer);
//                    break;
//                case 2:
//                    updateTrainer(tService);
//                    break;
//                case 3:
//                    deleteTrainer(tService);
//                    break;
//                case 4:
//                    displayAllTrainers(tService);
//                    break;
//                case 5:
//                    System.out.println("Exiting Gym Management System. Goodbye!");
//                    System.exit(0);
//                default:
//                    System.out.println("Invalid choice. Please enter a valid option.");
//            }
//        }
//    }
//
//    private static void displayAllTrainers(TrainerServiceImpl tService) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	private static void createTrainer(TrainerServiceImpl tService, Trainer trainer) {
//        tService.createTrainer(trainer);
////        System.out.println("Trainer created successfully.");
//    }
//
//    private static void updateTrainer(TrainerServiceImpl tService) {
//        System.out.print("Enter Trainer ID to update: ");
//        long trainerId = scanner.nextLong();
//        scanner.nextLine(); // consume the newline character
//        Trainer trainerToUpdate = tService.getTrainerById(trainerId);
//
//        if (trainerToUpdate != null) {
//            tService.updateTrainer(trainerToUpdate);
//            System.out.println("Trainer updated successfully.");
//        } else {
//            System.out.println("Trainer ID not found.");
//        }
//    }
//
//    private static void deleteTrainer(TrainerServiceImpl tService) {
//        System.out.print("Enter Trainer ID to delete: ");
//        long trainerId = scanner.nextLong();
//        scanner.nextLine(); // consume the newline character
//
//        if (tService.deleteTrainerById(trainerId)) {
//            System.out.println("Trainer deleted successfully.");
//        } else {
//            System.out.println("Trainer ID not found.");
//        }
//    }
//}
//
//
////
////import java.util.Scanner;
////
////import gym.DAOImpl.TrainerDAOImpl;
////import gym.Model.Trainer;
////import gym.ServiceImpl.TrainerServiceImpl;
////
////public class App {
////	static Scanner scanner = new Scanner(System.in);
////	public static void main(String[] args) {
////		
////		TrainerServiceImpl tService = new TrainerServiceImpl();
////		
////		// Create a new Trainer object
////		Trainer trainer = new Trainer();
////		while (true) {
////            System.out.println("Welcome to Gym Management System");
////            System.out.println("1. Create Trainer");
////            System.out.println("2. Update Trainer");
////            System.out.println("3. Delete Trainer");
////            System.out.println("4. Display All Trainers");
////            System.out.println("5. Exit");
////
////            System.out.print("Enter your choice: ");
////            int choice = scanner.nextInt();
////            scanner.nextLine();
////
////            switch (choice) {
////                case 1:
////                    createTrainer(tService, trainer);
////                    break;
////                case 2:
////                    updateTrainer(tService);
////                    break;
////                case 3:
////                    deleteTrainer(tService);
////                    break;
////                case 4:
////				TrainerServiceImpl trainerService;
////				displayAllTrainers(tService);
////                    break;
////                case 5:
////                    System.out.println("Exiting Gym Management System. Goodbye!");
////                    System.exit(0);
////                default:
////                    System.out.println("Invalid choice. Please enter a valid option.");
////            }
////        }
////		
////        // Call createTrainer method
////		tService.createTrainer(trainer);
////        System.out.println("Trainer created successfully.");
////        
////		// Update the trainer
////        tService.updateTrainer(trainer);
////        System.out.println("Trainer updated successfully.");
////        
////        // Delete the trainer
////        tService.deleteTrainer(trainer);
////        System.out.println("Trainer deleted successfully.");
////		
////		
////	}
////	private static void createTrainer(TrainerServiceImpl tService, Trainer trainer) {
////		// TODO Auto-generated method stub
////		
////	}
////	private static void updateTrainer(TrainerServiceImpl tService) {
////		// TODO Auto-generated method stub
////		
////	}
////	private static void deleteTrainer(TrainerServiceImpl tService) {
////		// TODO Auto-generated method stub
////		
////	}
////	private static void displayAllTrainers(TrainerServiceImpl tService) {
////		// TODO Auto-generated method stub
////		
////	}
////	
////	
////}
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
////
////import java.sql.Date;
////import java.util.Scanner;
////
////import gym.Enum.Gender;
//////import gym.Model.Member;
////import gym.Model.Trainer;
////import gym.Model.Service;
////import gym.Service.MemberService;
////import gym.Service.ServiceService;
////import gym.Service.TrainerService;
////
////public class App {
////
////    private static final MemberService memberService = new MemberService();
////    private static final TrainerService trainerService = new TrainerService();
////    private static final ServiceService serviceService = new ServiceService();
////    
////    private static final Scanner scanner = new Scanner(System.in);
////
////    public static void main(String[] args) {
////        displayMenu();
////    }
////
////    private static void displayMenu() {
////        int choice;
////        do {
////            System.out.println("\nGym Management System Menu:");
////            System.out.println("\nMember");
////            System.out.println("1. Add Member");
////            System.out.println("2. Update Member");
////            System.out.println("3. Delete Member");
////            System.out.println("4. Display All Members");
////            
////            System.out.println("\nTrainer");
////            System.out.println("5. Add Trainer");
////            System.out.println("6. Update Trainer");
////            System.out.println("7. Delete Trainer");
////            System.out.println("8. Display All Trainers");
////            
////            System.out.println("\nService");
////            
////            System.out.println("9. Add Service");
////            System.out.println("10. Update Service");
////            System.out.println("11. Delete Service");
////            System.out.println("12. Display All Services");
////            System.out.println("13. Exit");
////            System.out.print("Enter your choice: ");
////            choice = scanner.nextInt();
////            scanner.nextLine(); // Consume newline
////
////            switch (choice) {
////                case 1:
////                    addMember();
////                    break;
////                case 2:
////                    updateMember();
////                    break;
////                case 3:
////                    deleteMember();
////                    break;
////                case 4:
////                    displayAllMembers();
////                    break;
////                case 5:
////                    addTrainer();
////                    break;
////                case 6:
////                    updateTrainer();
////                    break;
////                case 7:
////                    deleteTrainer();
////                    break;
////                case 8:
////                    displayAllTrainers();
////                    break;
////                case 9:
////                    addService();
////                    break;
////                case 10:
////                    updateService();
////                    break;
////                case 11:
////                    deleteService();
////                    break;
////                case 12:
////                    displayAllServices();
////                    break;
////                case 13:
////                    exit();
////                    break;
////                default:
////                    System.out.println("Invalid choice. Please enter a number between 1 and 13.");
////            }
////        } while (choice != 13);
////    }
////    
////    private static void exit() {
////        System.out.println("Exiting Gym Management System. Goodbye!");
////        // You can perform any cleanup operations here before exiting the program
////        System.exit(0);
////    }
////
////    private static void displayAllMembers() {
////        // TODO: Implement logic to display all members
////        System.out.println("Displaying all members...");
////    }
////
////    private static void deleteMember() {
////        // TODO: Implement logic to delete a member
////        System.out.println("Deleting a member...");
////    }
////
////    private static void updateMember() {
////        // TODO: Implement logic to update a member
////        System.out.println("Updating a member...");
////    }
////
////    private static void addMember() {
////        // TODO: Implement logic to add a member
////        System.out.println("Adding a new member...");
////    }
////
////	private static void addTrainer() {
////        System.out.println("Enter trainer details:");
////        System.out.print("First Name: ");
////        String firstName = scanner.nextLine();
////        System.out.print("Last Name: ");
////        String lastName = scanner.nextLine();
////        System.out.print("Gender (MALE/FEMALE/OTHER): ");
////        Gender gender = Gender.valueOf(scanner.nextLine().toUpperCase());
////        System.out.print("Date of Birth (YYYY-MM-DD): ");
////        String dobString = scanner.nextLine();
////        Date dob = Date.valueOf(dobString);
////        System.out.print("Contact Number: ");
////        String contactNumber = scanner.nextLine();
////        System.out.print("Email: ");
////        String email = scanner.nextLine();
////        System.out.print("Address: ");
////        String address = scanner.nextLine();
////        System.out.print("Hire Date (YYYY-MM-DD): ");
////        String hireDateString = scanner.nextLine();
////        Date hireDate = Date.valueOf(hireDateString);
////
////        Trainer trainer = new Trainer(0, firstName, lastName, gender, dob, contactNumber, email, address, hireDate);
////        trainerService.saveTrainer(trainer);
////        System.out.println("Trainer added successfully.");
////    }
////
////    private static void updateTrainer() {
////        System.out.print("Enter trainer ID to update: ");
////        int trainerId = scanner.nextInt();
////        scanner.nextLine(); // Consume newline
////
////        System.out.println("Enter updated trainer details:");
////        System.out.print("New First Name: ");
////        String newFirstName = scanner.nextLine();
////        System.out.print("New Last Name: ");
////        String newLastName = scanner.nextLine();
////        System.out.print("New Gender (MALE/FEMALE/OTHER): ");
////        Gender newGender = Gender.valueOf(scanner.nextLine().toUpperCase());
////        System.out.print("New Date of Birth (YYYY-MM-DD): ");
////        String newDobString = scanner.nextLine();
////        Date newDob = Date.valueOf(newDobString);
////        System.out.print("New Contact Number: ");
////        String newContactNumber = scanner.nextLine();
////        System.out.print("New Email: ");
////        String newEmail = scanner.nextLine();
////        System.out.print("New Address: ");
////        String newAddress = scanner.nextLine();
////        System.out.print("New Hire Date (YYYY-MM-DD): ");
////        String newHireDateString = scanner.nextLine();
////        Date newHireDate = Date.valueOf(newHireDateString);
////
////        Trainer updatedTrainer = new Trainer(trainerId, newFirstName, newLastName, newGender, newDob, newContactNumber, newEmail, newAddress, newHireDate);
////        trainerService.updateTrainer(updatedTrainer);
////        System.out.println("Trainer updated successfully.");
////    }
////
////    private static void deleteTrainer() {
////        System.out.print("Enter trainer ID to delete: ");
////        int trainerId = scanner.nextInt();
////        scanner.nextLine(); // Consume newline
////
////        trainerService.deleteTrainer(trainerId);
////        System.out.println("Trainer deleted successfully.");
////    }
////
////    private static void displayAllTrainers() {
////        System.out.println("All Trainers:");
////        trainerService.getAllTrainers().forEach(System.out::println);
////    }
////
////    private static void addService() {
////        System.out.println("Enter service details:");
////        System.out.print("Service Name: ");
////        String serviceName = scanner.nextLine();
////        System.out.print("Service Description: ");
////        String serviceDescription = scanner.nextLine();
////        System.out.print("Service Fee: ");
////        double serviceFee = scanner.nextDouble();
////        scanner.nextLine(); // Consume newline
////
////        Service service = new Service(serviceName, serviceDescription, serviceFee);
////        serviceService.saveService(service);
////        System.out.println("Service added successfully.");
////    }
////
////    private static void updateService() {
////        System.out.print("Enter service ID to update: ");
////        int serviceId = scanner.nextInt();
////        scanner.nextLine(); // Consume newline
////
////        System.out.println("Enter updated service details:");
////        System.out.print("New Service Name: ");
////        String newServiceName = scanner.nextLine();
////        System.out.print("New Service Description: ");
////        String newServiceDescription = scanner.nextLine();
////        System.out.print("New Service Fee: ");
////        double newServiceFee = scanner.nextDouble();
////        scanner.nextLine(); // Consume newline
////
////        Service updatedService = new Service(serviceId, newServiceName, newServiceDescription, newServiceFee);
////        serviceService.updateService(updatedService);
////        System.out.println("Service updated successfully.");
////    }
////
////    private static void deleteService() {
////        System.out.print("Enter service ID to delete: ");
////        int serviceId = scanner.nextInt();
////        scanner.nextLine(); // Consume newline
////
////        serviceService.deleteService(serviceId);
////        System.out.println("Service deleted successfully.");
////    }
////
////    private static void displayAllServices() {
////        System.out.println("All Services:");
////        serviceService.getAllServices().forEach(System.out::println);
////    }
////
////	/**
////	 * @return the memberservice
////	 */
////	public static MemberService getMemberservice() {
////		return memberService;
////	}
////}