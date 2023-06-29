package entity;

import jakarta.persistence.*;

import java.sql.Date;
import java.sql.Timestamp;

@Entity
@Table(name = "supervisor", schema = "edfDB", catalog = "")
public class SupervisorEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;
    @Basic
    @Column(name = "supervisor_name")
    private String supervisorName;
    @Basic
    @Column(name = "supervisor_explain")
    private String supervisorExplain;
    @Basic
    @Column(name = "supervisor_sign")
    private String supervisorSign;
    @Basic
    @Column(name = "supervisor_sign_date")
    private Date supervisorSignDate;
    @Basic
    @Column(name = "supervisor_email")
    private String supervisorEmail;
    @Basic
    @Column(name = "supervisor_status")
    private Object supervisorStatus;
    @Basic
    @Column(name = "supervisor_completed_time")
    private Timestamp supervisorCompletedTime;
    @Basic
    @Column(name = "student_id")
    private Integer studentId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSupervisorName() {
        return supervisorName;
    }

    public void setSupervisorName(String supervisorName) {
        this.supervisorName = supervisorName;
    }

    public String getSupervisorExplain() {
        return supervisorExplain;
    }

    public void setSupervisorExplain(String supervisorExplain) {
        this.supervisorExplain = supervisorExplain;
    }

    public String getSupervisorSign() {
        return supervisorSign;
    }

    public void setSupervisorSign(String supervisorSign) {
        this.supervisorSign = supervisorSign;
    }

    public Date getSupervisorSignDate() {
        return supervisorSignDate;
    }

    public void setSupervisorSignDate(Date supervisorSignDate) {
        this.supervisorSignDate = supervisorSignDate;
    }

    public String getSupervisorEmail() {
        return supervisorEmail;
    }

    public void setSupervisorEmail(String supervisorEmail) {
        this.supervisorEmail = supervisorEmail;
    }

    public Object getSupervisorStatus() {
        return supervisorStatus;
    }

    public void setSupervisorStatus(Object supervisorStatus) {
        this.supervisorStatus = supervisorStatus;
    }

    public Timestamp getSupervisorCompletedTime() {
        return supervisorCompletedTime;
    }

    public void setSupervisorCompletedTime(Timestamp supervisorCompletedTime) {
        this.supervisorCompletedTime = supervisorCompletedTime;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SupervisorEntity that = (SupervisorEntity) o;

        if (id != that.id) return false;
        if (supervisorName != null ? !supervisorName.equals(that.supervisorName) : that.supervisorName != null)
            return false;
        if (supervisorExplain != null ? !supervisorExplain.equals(that.supervisorExplain) : that.supervisorExplain != null)
            return false;
        if (supervisorSign != null ? !supervisorSign.equals(that.supervisorSign) : that.supervisorSign != null)
            return false;
        if (supervisorSignDate != null ? !supervisorSignDate.equals(that.supervisorSignDate) : that.supervisorSignDate != null)
            return false;
        if (supervisorEmail != null ? !supervisorEmail.equals(that.supervisorEmail) : that.supervisorEmail != null)
            return false;
        if (supervisorStatus != null ? !supervisorStatus.equals(that.supervisorStatus) : that.supervisorStatus != null)
            return false;
        if (supervisorCompletedTime != null ? !supervisorCompletedTime.equals(that.supervisorCompletedTime) : that.supervisorCompletedTime != null)
            return false;
        if (studentId != null ? !studentId.equals(that.studentId) : that.studentId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (supervisorName != null ? supervisorName.hashCode() : 0);
        result = 31 * result + (supervisorExplain != null ? supervisorExplain.hashCode() : 0);
        result = 31 * result + (supervisorSign != null ? supervisorSign.hashCode() : 0);
        result = 31 * result + (supervisorSignDate != null ? supervisorSignDate.hashCode() : 0);
        result = 31 * result + (supervisorEmail != null ? supervisorEmail.hashCode() : 0);
        result = 31 * result + (supervisorStatus != null ? supervisorStatus.hashCode() : 0);
        result = 31 * result + (supervisorCompletedTime != null ? supervisorCompletedTime.hashCode() : 0);
        result = 31 * result + (studentId != null ? studentId.hashCode() : 0);
        return result;
    }
}
