package shub.Service;

import java.util.Date;
import java.util.List;

import shub.DAO.AttendanceDAO;
import shub.DAO.ClassDAO;
import shub.DAO.MemberDAO;
import shub.DAO.TrainerDAO;
import shub.Model.Attendance;
import shub.Model.Class;
import shub.Model.Member;
import shub.Model.Trainer;

public class GymService {
    private MemberDAO memberDAO;
    private TrainerDAO trainerDAO;
    private ClassDAO classDAO;
    private AttendanceDAO attendanceDAO;

    public GymService(MemberDAO memberDAO, TrainerDAO trainerDAO, ClassDAO classDAO, AttendanceDAO attendanceDAO) {
        this.memberDAO = memberDAO;
        this.trainerDAO = trainerDAO;
        this.classDAO = classDAO;
        this.attendanceDAO = attendanceDAO;
    }

    public MemberDAO getMemberDAO() {
        return memberDAO;
    }

    public void setMemberDAO(MemberDAO memberDAO) {
        this.memberDAO = memberDAO;
    }

    public TrainerDAO getTrainerDAO() {
        return trainerDAO;
    }

    public void setTrainerDAO(TrainerDAO trainerDAO) {
        this.trainerDAO = trainerDAO;
    }

    public ClassDAO getClassDAO() {
        return classDAO;
    }

    public void setClassDAO(ClassDAO classDAO) {
        this.classDAO = classDAO;
    }

    public AttendanceDAO getAttendanceDAO() {
        return attendanceDAO;
    }

    public void setAttendanceDAO(AttendanceDAO attendanceDAO) {
        this.attendanceDAO = attendanceDAO;
    }

    public void addMember(Member member) {
        memberDAO.addMember(member);
    }

    public void updateMember(Member member) {
        memberDAO.updateMember(member);
    }

    public void deleteMember(int memberId) {
        memberDAO.deleteMember(memberId);
    }

    public void addTrainer(Trainer newTrainer) {
        trainerDAO.addTrainer(newTrainer);
    }

    public void updateTrainer(Trainer trainer) {
        trainerDAO.updateTrainer(trainer);
    }

    public void deleteTrainer(int trainerId) {
        trainerDAO.deleteTrainer(trainerId);
    }

    public void updateClass(Class gymClass) {
        classDAO.updateClass(gymClass);
    }

    public void deleteClass(int classId) {
        classDAO.deleteClass(classId);
    }

    public void markAttendance(int memberId, int classId, Date date) {
        attendanceDAO.addAttendance(memberId, classId, date);
    }

    public void exit() {
        System.exit(0); // Exit the program with status code 0
    }

    public List<Trainer> getAllTrainers() {
        return trainerDAO.getAllTrainers();
    }

    public List<Member> getAllMembers() {
        return memberDAO.getAllMembers();
    }

    public List<Class> getAllClasses() {
        return classDAO.getAllClass();
    }

    public List<Attendance> getAllAttendance() {
        return attendanceDAO.getAllAttendance();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    public List<Class> getAllClass() {
        // TODO Auto-generated method stub
        return null;
    }
}
