package shub.Model;

import java.time.LocalDate;
import java.util.Date;

public class Attendance {
    private int attendanceId;
    private Member member;
    private shub.Model.Class attendanceClass;
    private LocalDate attendanceDate;

    // Generate Constructor using Fields

    /**
     * @param attendanceId
     * @param member
     * @param attendanceClass
     * @param attendanceDate
     */

    public Attendance(int attendanceId, Member member, Class attendanceClass, LocalDate attendanceDate) {
        super();
        this.attendanceId = attendanceId;
        this.member = member;
        this.attendanceClass = attendanceClass;
        this.attendanceDate = attendanceDate;
    }

    // Generate Constructors from Superclass

    /**
     * 
     */
    public Attendance() {
        super();
        // TODO Auto-generated constructor stub
    }

    public Attendance(int i, int j, Date date) {
        // TODO Auto-generated constructor stub
    }

    // Getter methods
    public int getAttendanceId() {
        return attendanceId;
    }

    public Member getMember() {
        return member;
    }

    public shub.Model.Class getAttendanceClass() {
        return attendanceClass;
    }

    public LocalDate getAttendanceDate() {
        return attendanceDate;
    }

    // Setter methods
    public void setAttendanceId(int attendanceId) {
        this.attendanceId = attendanceId;
    }

    public void setMember(Member member) {
        this.member = member;
    }

    public void setAttendanceClass(shub.Model.Class attendanceClass) {
        this.attendanceClass = attendanceClass;
    }

    public void setAttendanceDate(LocalDate attendanceDate) {
        this.attendanceDate = attendanceDate;
    }
}
