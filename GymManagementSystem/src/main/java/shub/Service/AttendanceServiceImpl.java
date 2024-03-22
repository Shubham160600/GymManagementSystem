package shub.Service;

import java.util.List;

import shub.DAO.AttendanceDAO;
import shub.Model.Attendance;

public class AttendanceServiceImpl implements AttendanceService {
    private AttendanceDAO attendanceDAO;

    public AttendanceServiceImpl(AttendanceDAO attendanceDAO) {
        this.attendanceDAO = attendanceDAO;
    }

    @Override
    public void markAttendance(Attendance attendance) {
        attendanceDAO.markAttendance(attendance);
    }

    @Override
    public void updateAttendance(Attendance attendance) {
        attendanceDAO.updateAttendance(attendance);
    }

    @Override
    public void deleteAttendance(int attendanceId) {
        attendanceDAO.deleteAttendance(attendanceId);
    }

    @Override
    public void exitAttendance(int attendanceId) {
        attendanceDAO.exitAttendance(attendanceId);
    }

    @Override
    public Attendance getAttendanceById(int attendanceId) {
        return attendanceDAO.getAttendanceById(attendanceId);
    }

    @Override
    public List<Attendance> getAllAttendances() {
        return attendanceDAO.getAllAttendances();
    }
}
