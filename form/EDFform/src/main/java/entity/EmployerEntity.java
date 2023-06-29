package entity;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Timestamp;

@Entity
@Table(name = "employer", schema = "edfDB", catalog = "")
public class EmployerEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;
    @Basic
    @Column(name = "employer_training_title")
    private String employerTrainingTitle;
    @Basic
    @Column(name = "employer_host_org")
    private String employerHostOrg;
    @Basic
    @Column(name = "employer_location")
    private String employerLocation;
    @Basic
    @Column(name = "employer_locationstart_date")
    private Date employerLocationstartDate;
    @Basic
    @Column(name = "employer_locationend_date")
    private Date employerLocationendDate;
    @Basic
    @Column(name = "employer_registration_cost")
    private BigDecimal employerRegistrationCost;
    @Basic
    @Column(name = "employer_registration_pay")
    private Byte employerRegistrationPay;
    @Basic
    @Column(name = "employer_email")
    private String employerEmail;
    @Basic
    @Column(name = "employer_status")
    private Object employerStatus;
    @Basic
    @Column(name = "employer_completed_time")
    private Timestamp employerCompletedTime;
    @Basic
    @Column(name = "student_id")
    private Integer studentId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmployerTrainingTitle() {
        return employerTrainingTitle;
    }

    public void setEmployerTrainingTitle(String employerTrainingTitle) {
        this.employerTrainingTitle = employerTrainingTitle;
    }

    public String getEmployerHostOrg() {
        return employerHostOrg;
    }

    public void setEmployerHostOrg(String employerHostOrg) {
        this.employerHostOrg = employerHostOrg;
    }

    public String getEmployerLocation() {
        return employerLocation;
    }

    public void setEmployerLocation(String employerLocation) {
        this.employerLocation = employerLocation;
    }

    public Date getEmployerLocationstartDate() {
        return employerLocationstartDate;
    }

    public void setEmployerLocationstartDate(Date employerLocationstartDate) {
        this.employerLocationstartDate = employerLocationstartDate;
    }

    public Date getEmployerLocationendDate() {
        return employerLocationendDate;
    }

    public void setEmployerLocationendDate(Date employerLocationendDate) {
        this.employerLocationendDate = employerLocationendDate;
    }

    public BigDecimal getEmployerRegistrationCost() {
        return employerRegistrationCost;
    }

    public void setEmployerRegistrationCost(BigDecimal employerRegistrationCost) {
        this.employerRegistrationCost = employerRegistrationCost;
    }

    public Byte getEmployerRegistrationPay() {
        return employerRegistrationPay;
    }

    public void setEmployerRegistrationPay(Byte employerRegistrationPay) {
        this.employerRegistrationPay = employerRegistrationPay;
    }

    public String getEmployerEmail() {
        return employerEmail;
    }

    public void setEmployerEmail(String employerEmail) {
        this.employerEmail = employerEmail;
    }

    public Object getEmployerStatus() {
        return employerStatus;
    }

    public void setEmployerStatus(Object employerStatus) {
        this.employerStatus = employerStatus;
    }

    public Timestamp getEmployerCompletedTime() {
        return employerCompletedTime;
    }

    public void setEmployerCompletedTime(Timestamp employerCompletedTime) {
        this.employerCompletedTime = employerCompletedTime;
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

        EmployerEntity that = (EmployerEntity) o;

        if (id != that.id) return false;
        if (employerTrainingTitle != null ? !employerTrainingTitle.equals(that.employerTrainingTitle) : that.employerTrainingTitle != null)
            return false;
        if (employerHostOrg != null ? !employerHostOrg.equals(that.employerHostOrg) : that.employerHostOrg != null)
            return false;
        if (employerLocation != null ? !employerLocation.equals(that.employerLocation) : that.employerLocation != null)
            return false;
        if (employerLocationstartDate != null ? !employerLocationstartDate.equals(that.employerLocationstartDate) : that.employerLocationstartDate != null)
            return false;
        if (employerLocationendDate != null ? !employerLocationendDate.equals(that.employerLocationendDate) : that.employerLocationendDate != null)
            return false;
        if (employerRegistrationCost != null ? !employerRegistrationCost.equals(that.employerRegistrationCost) : that.employerRegistrationCost != null)
            return false;
        if (employerRegistrationPay != null ? !employerRegistrationPay.equals(that.employerRegistrationPay) : that.employerRegistrationPay != null)
            return false;
        if (employerEmail != null ? !employerEmail.equals(that.employerEmail) : that.employerEmail != null)
            return false;
        if (employerStatus != null ? !employerStatus.equals(that.employerStatus) : that.employerStatus != null)
            return false;
        if (employerCompletedTime != null ? !employerCompletedTime.equals(that.employerCompletedTime) : that.employerCompletedTime != null)
            return false;
        if (studentId != null ? !studentId.equals(that.studentId) : that.studentId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (employerTrainingTitle != null ? employerTrainingTitle.hashCode() : 0);
        result = 31 * result + (employerHostOrg != null ? employerHostOrg.hashCode() : 0);
        result = 31 * result + (employerLocation != null ? employerLocation.hashCode() : 0);
        result = 31 * result + (employerLocationstartDate != null ? employerLocationstartDate.hashCode() : 0);
        result = 31 * result + (employerLocationendDate != null ? employerLocationendDate.hashCode() : 0);
        result = 31 * result + (employerRegistrationCost != null ? employerRegistrationCost.hashCode() : 0);
        result = 31 * result + (employerRegistrationPay != null ? employerRegistrationPay.hashCode() : 0);
        result = 31 * result + (employerEmail != null ? employerEmail.hashCode() : 0);
        result = 31 * result + (employerStatus != null ? employerStatus.hashCode() : 0);
        result = 31 * result + (employerCompletedTime != null ? employerCompletedTime.hashCode() : 0);
        result = 31 * result + (studentId != null ? studentId.hashCode() : 0);
        return result;
    }
}
