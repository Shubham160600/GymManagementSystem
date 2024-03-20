package shub.DAO;

import java.util.Date;
import java.util.List;
import shub.Model.Attendance;

public interface AttendanceDAO {
    void markAttendance(Attendance attendance);
    void updateAttendance(Attendance attendance);
    void deleteAttendance(int attendanceId);
    void exitAttendance(int attendanceId);
    Attendance getAttendanceById(int attendanceId);
    List<Attendance> getAllAttendances();
     // New method declaration
	void addAttendance(int memberId, int classId, Date date);
}
    
}
