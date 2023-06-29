package entity;

import jakarta.persistence.*;

import java.sql.Date;
import java.sql.Timestamp;

@Entity
@Table(name = "odhr", schema = "edfDB", catalog = "")
public class OdhrEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;
    @Basic
    @Column(name = "odhr_funds")
    private Byte odhrFunds;
    @Basic
    @Column(name = "odhr_eligibility")
    private Byte odhrEligibility;
    @Basic
    @Column(name = "odhr_comment")
    private String odhrComment;
    @Basic
    @Column(name = "odhr_sign")
    private String odhrSign;
    @Basic
    @Column(name = "odhr_name")
    private String odhrName;
    @Basic
    @Column(name = "odhr_sign_date")
    private Date odhrSignDate;
    @Basic
    @Column(name = "odhr_email")
    private String odhrEmail;
    @Basic
    @Column(name = "odhr_status")
    private Object odhrStatus;
    @Basic
    @Column(name = "odhr_completed_time")
    private Timestamp odhrCompletedTime;
    @Basic
    @Column(name = "student_id")
    private Integer studentId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Byte getOdhrFunds() {
        return odhrFunds;
    }

    public void setOdhrFunds(Byte odhrFunds) {
        this.odhrFunds = odhrFunds;
    }

    public Byte getOdhrEligibility() {
        return odhrEligibility;
    }

    public void setOdhrEligibility(Byte odhrEligibility) {
        this.odhrEligibility = odhrEligibility;
    }

    public String getOdhrComment() {
        return odhrComment;
    }

    public void setOdhrComment(String odhrComment) {
        this.odhrComment = odhrComment;
    }

    public String getOdhrSign() {
        return odhrSign;
    }

    public void setOdhrSign(String odhrSign) {
        this.odhrSign = odhrSign;
    }

    public String getOdhrName() {
        return odhrName;
    }

    public void setOdhrName(String odhrName) {
        this.odhrName = odhrName;
    }

    public Date getOdhrSignDate() {
        return odhrSignDate;
    }

    public void setOdhrSignDate(Date odhrSignDate) {
        this.odhrSignDate = odhrSignDate;
    }

    public String getOdhrEmail() {
        return odhrEmail;
    }

    public void setOdhrEmail(String odhrEmail) {
        this.odhrEmail = odhrEmail;
    }

    public Object getOdhrStatus() {
        return odhrStatus;
    }

    public void setOdhrStatus(Object odhrStatus) {
        this.odhrStatus = odhrStatus;
    }

    public Timestamp getOdhrCompletedTime() {
        return odhrCompletedTime;
    }

    public void setOdhrCompletedTime(Timestamp odhrCompletedTime) {
        this.odhrCompletedTime = odhrCompletedTime;
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

        OdhrEntity that = (OdhrEntity) o;

        if (id != that.id) return false;
        if (odhrFunds != null ? !odhrFunds.equals(that.odhrFunds) : that.odhrFunds != null) return false;
        if (odhrEligibility != null ? !odhrEligibility.equals(that.odhrEligibility) : that.odhrEligibility != null)
            return false;
        if (odhrComment != null ? !odhrComment.equals(that.odhrComment) : that.odhrComment != null) return false;
        if (odhrSign != null ? !odhrSign.equals(that.odhrSign) : that.odhrSign != null) return false;
        if (odhrName != null ? !odhrName.equals(that.odhrName) : that.odhrName != null) return false;
        if (odhrSignDate != null ? !odhrSignDate.equals(that.odhrSignDate) : that.odhrSignDate != null) return false;
        if (odhrEmail != null ? !odhrEmail.equals(that.odhrEmail) : that.odhrEmail != null) return false;
        if (odhrStatus != null ? !odhrStatus.equals(that.odhrStatus) : that.odhrStatus != null) return false;
        if (odhrCompletedTime != null ? !odhrCompletedTime.equals(that.odhrCompletedTime) : that.odhrCompletedTime != null)
            return false;
        if (studentId != null ? !studentId.equals(that.studentId) : that.studentId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (odhrFunds != null ? odhrFunds.hashCode() : 0);
        result = 31 * result + (odhrEligibility != null ? odhrEligibility.hashCode() : 0);
        result = 31 * result + (odhrComment != null ? odhrComment.hashCode() : 0);
        result = 31 * result + (odhrSign != null ? odhrSign.hashCode() : 0);
        result = 31 * result + (odhrName != null ? odhrName.hashCode() : 0);
        result = 31 * result + (odhrSignDate != null ? odhrSignDate.hashCode() : 0);
        result = 31 * result + (odhrEmail != null ? odhrEmail.hashCode() : 0);
        result = 31 * result + (odhrStatus != null ? odhrStatus.hashCode() : 0);
        result = 31 * result + (odhrCompletedTime != null ? odhrCompletedTime.hashCode() : 0);
        result = 31 * result + (studentId != null ? studentId.hashCode() : 0);
        return result;
    }
}
