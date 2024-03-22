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