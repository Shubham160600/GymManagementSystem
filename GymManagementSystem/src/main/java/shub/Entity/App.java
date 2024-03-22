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
        // Assuming the constructor for Attendance class takes member ID, class ID, and
        // the current date
        Attendance newAttendance = new Attendance(1, 1, new Date());
        attendanceService.markAttendance(newAttendance);

        // Example usage of PaymentService
        // Assuming the constructor for Payment class takes member ID, payment amount,
        // and payment date
        Payment newPayment = new Payment(1, 50.00, new Date());
        paymentService.makePayment(newPayment);

        // Close Hibernate session factory
        sessionFactory.close();
    }
}