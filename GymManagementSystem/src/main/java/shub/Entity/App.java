package shub.Entity;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import shub.DAO.AttendanceDAO;
import shub.DAO.ClassDAO;
import shub.DAO.MemberDAO;
import shub.DAO.PaymentDAO;
import shub.DAO.TrainerDAO;
import shub.DAO.Impl.AttendanceDAOImpl;
import shub.DAO.Impl.ClassDAOImpl;
import shub.DAO.Impl.MemberDAOImpl;
import shub.DAO.Impl.PaymentDAOImpl;
import shub.DAO.Impl.TrainerDAOImpl;
import shub.Model.Attendance;
import shub.Model.Class;
import shub.Model.Member;
import shub.Model.Payment;
import shub.Model.Trainer;
import shub.Service.AttendanceService;
import shub.Service.ClassService;
import shub.Service.MemberService;
import shub.Service.PaymentService;
import shub.Service.TrainerService;
import shub.Service.AttendanceServiceImpl;
import shub.Service.ClassServiceImpl;
import shub.Service.MemberServiceImpl;
import shub.Service.PaymentServiceImpl;
import shub.Service.TrainerServiceImpl;

import java.util.Date; // Import Date class for the constructor parameter

public class App {
    public static void main(String[] args) {
        // Initialize Hibernate session factory
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

        // Initialize DAOs
        MemberDAO memberDAO = new MemberDAOImpl(sessionFactory);
        TrainerDAO trainerDAO = new TrainerDAOImpl(sessionFactory);
        ClassDAO classDAO = new ClassDAOImpl(sessionFactory);
        AttendanceDAO attendanceDAO = new AttendanceDAOImpl(sessionFactory);
        PaymentDAO paymentDAO = new PaymentDAOImpl(sessionFactory);

        // Initialize Services
        MemberService memberService = new MemberServiceImpl(memberDAO);
        TrainerService trainerService = new TrainerServiceImpl(trainerDAO);
        ClassService classService = new ClassServiceImpl(classDAO);
        AttendanceService attendanceService = new AttendanceServiceImpl(attendanceDAO);
        PaymentService paymentService = new PaymentServiceImpl(paymentDAO);

        // Example usage of MemberService
        Member newMember = new Member("John", "Doe", 25, "Male", "john@example.com", "1234567890");
        memberService.addMember(newMember);

        // Example usage of TrainerService
        Trainer newTrainer = new Trainer("Jane", "Smith", 30, "Female", "jane@example.com", "9876543210");
        trainerService.addTrainer(newTrainer);

        // Example usage of ClassService
        Class newClass = new Class("Yoga", "Monday, Wednesday, Friday", "10:00 AM - 11:00 AM");
        classService.addClass(newClass);

        // Example usage of AttendanceService
        // Assuming the constructor for Attendance class takes member ID, class ID, and the current date
        Attendance newAttendance = new Attendance(1, 1, new Date());
        attendanceService.markAttendance(newAttendance);

        // Example usage of PaymentService
        // Assuming the constructor for Payment class takes member ID, payment amount, and payment date
        Payment newPayment = new Payment(1, 50.00, new Date());
        paymentService.makePayment(newPayment);

        // Close Hibernate session factory
        sessionFactory.close();
    }
}






/*
 * import java.util.Date; import java.util.List; import shub.DAO.AttendanceDAO;
 * import shub.DAO.ClassDAO; import shub.DAO.MemberDAO; import
 * shub.DAO.TrainerDAO; import shub.Enum.Gender; import shub.Model.Attendance;
 * import shub.Model.Class; import shub.Model.Member; import shub.Model.Trainer;
 * import shub.Service.GymService;
 * 
 * public class App {
 * 
 * // private static AttendanceDAO attendanceDAO; // private static ClassDAO
 * classDAO; // private static TrainerDAO trainerDAO; // private static
 * MemberDAO memberDAO;
 * 
 * @SuppressWarnings("deprecation") public static void main(String[] args) {
 * 
 * // Initialize DAO implementations MemberDAO memberDAO = new MemberDAO();
 * TrainerDAO trainerDAO = new TrainerDAO(); ClassDAO classDAO = new ClassDAO();
 * AttendanceDAO attendanceDAO = new AttendanceDAO();
 * 
 * // Create a GymService instance GymService gymService = new
 * GymService(memberDAO, trainerDAO, classDAO, attendanceDAO);
 * 
 * // Example: Adding a new member Member newMember = new Member();
 * newMember.setFirstName("John"); newMember.setLastName("Doe");
 * newMember.setGender(Gender.MALE); newMember.setDateOfBirth(new Date(90, 4,
 * 15)); // Year starts from 1900, so 90 is 1990
 * newMember.setContactNumber("1234567890");
 * newMember.setEmail("john@example.com");
 * newMember.setAddress("123 Main St, City"); newMember.setRegistrationDate(new
 * Date()); // Assuming current date gymService.addMember(newMember);
 * 
 * // Example: Adding a new trainer Trainer newTrainer = new Trainer();
 * newTrainer.setFirstName("Emily"); newTrainer.setLastName("Smith");
 * newTrainer.setGender(Gender.FEMALE); newTrainer.setDateOfBirth(new Date(95,
 * 2, 10)); // Year starts from 1900, so 95 is 1995
 * newTrainer.setContactNumber("6392744799");
 * newTrainer.setEmail("shubham@gmail.com");
 * newTrainer.setAddress("456 Elm St, Town"); newTrainer.setHireDate(new
 * Date()); // Assuming current date gymService.addTrainer(newTrainer);
 * 
 * // Example: Retrieving all members List<Member> allMembers =
 * gymService.getAllMembers(); System.out.println("All Members:"); if
 * (allMembers != null) { // Add null check here for (Member member :
 * allMembers) { System.out.println("Member ID: " + member.getMemberId());
 * System.out.println("Name: " + member.getFirstName() + " " +
 * member.getLastName()); // Print other attributes as needed } } else {
 * System.out.println("No members found."); }
 * 
 * // Example: Retrieving all trainers List<Trainer> allTrainers =
 * gymService.getAllTrainers(); System.out.println("All Trainers:"); if
 * (allTrainers != null) { for (Trainer trainer : allTrainers) {
 * System.out.println("Trainer ID: " + trainer.getTrainerId());
 * System.out.println("Name: " + trainer.getFirstName() + " " +
 * trainer.getLastName()); // Print other attributes as needed } } else {
 * System.out.println("No trainers found."); }
 * 
 * List<Class> allClass = gymService.getAllClass();
 * System.out.println("All Classes:"); if (allTrainers != null) { for (Class
 * gymClass : allClass) { System.out.println("Class ID: " +
 * gymClass.getClassId()); System.out.println("Name: " +
 * gymClass.getClassName()); // Print other class attributes as needed } } else
 * { System.out.println("No Classes found."); }
 * 
 * 
 * List<Attendance> allAttendance = gymService.getAllAttendance();
 * System.out.println("All Attendance Records:"); if (allTrainers != null) { for
 * (Attendance attendance : allAttendance) {
 * System.out.println("Attendance ID: " + attendance.getAttendanceId());
 * System.out.println("Member ID: " + attendance.getMember().getMemberId());
 * System.out.println("Class ID: " + attendance.getGymClass().getClassId()); //
 * Print other attendance details as needed } } else {
 * System.out.println("No Attendance found."); } } }
 */