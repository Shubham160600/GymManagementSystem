package shub.Service;


import java.util.Date;
import java.util.List;
import shub.Model.Attendance;
import shub.Model.Class;
import shub.Model.Member;
import shub.Model.Trainer;

public interface GymServiceImpl {
    void addMember(Member member);
    List<Member> getAllMembers();
    void addTrainer(Trainer trainer);
    List<Trainer> getAllTrainers();
    List<Attendance> getAllAttendance();
    void updateMember(Member member);
    void deleteMember(int memberId);
    void updateTrainer(Trainer trainer);
    void deleteTrainer(int trainerId);
    void updateClass(Class gymClass);
    void deleteClass(int classId);
    void addAttendance(int memberId, int classId, Date date);
}

//import java.util.List;
//
//import shub.Model.Attendance;
//import shub.Model.Class;
//import shub.Model.Member;
//import shub.Model.Trainer;
////import shub.Model.MembersServices;
////import shub.Model.Payment;
////import shub.Model.Service;
//
//
//
//public interface GymServiceImpl {
//    void addMember(Member member);
//    void updateMember(Member member);
//    void deleteMember(int memberId);
//    Member getMemberById(int memberId);
//    List<Member> getAllMembers();
//    
//    void addTrainer(Trainer trainer);
//    void updateTrainer(Trainer trainer);
//    void deleteTrainer(int trainerId);
//    Trainer getTrainerById(int trainerId);
//    List<Trainer> getAllTrainer();
//    
//    void addClass(Class gymClass);
//    void updateClass(Class gymClass);
//    void deleteClass(Long classId);
//    Class getClassById(Long classId);
//    List<Class> getAllClasses();
//    
//	void addAttendance(Attendance attendance);
//    void updateAttendance(Attendance attendance);
//    void deleteAttendance(Long attendanceId);
//    Attendance getAttendanceById(Long attendanceId);
//    List<Attendance> getAllAttendances();
//}



    // Other methods
//	void addAttendance(Attendance attendance);
//	Class getClassById(int classId);
//	void updateAttendance(Attendance attendance);
//	void deleteClass(int classId);
//	void deleteAttendance(int attendanceId);
//	Attendance getAttendanceById(int attendanceId);
//	Payment getPaymentById(int paymentId);
//	void deleteMemberService(int memberId, int serviceId);
//	void addMemberService(MembersServices membersServices);
//	Service getServiceById(int serviceId);
//	void deleteService(int serviceId);
//	void addService(Service service);
//	void updateService(Service service);
//	void deletePayment(int paymentId);
//	void updateClass(Class classes);
//	void addPayment(Payment payment);
//	void updatePayment(Payment payment);
//	void addClass(Class classes);


/*
 * import javax.persistence.Entity; import javax.persistence.GeneratedValue;
 * import javax.persistence.GenerationType; import javax.persistence.Id;
 * 
 * @Entity public class GymService {
 * 
 * @Id
 * 
 * @GeneratedValue(strategy = GenerationType.IDENTITY) private Long id;
 * 
 * // Add other attributes for MemberService as needed
 * 
 * // Constructors, getters, setters, toString, etc. }
 */