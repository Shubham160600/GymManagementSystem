package shub.Service;

import java.util.List;

import shub.Model.Attendance;

public interface AttendanceService {
    void markAttendance(Attendance attendance);

    void updateAttendance(Attendance attendance);

    void deleteAttendance(int attendanceId);

    Attendance getAttendanceById(int attendanceId);

    List<Attendance> getAllAttendances();

    void exitAttendance(int attendanceId);
}
