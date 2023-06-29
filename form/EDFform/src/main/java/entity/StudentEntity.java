package entity;

import jakarta.persistence.*;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.Collection;

@Entity
@Table(name = "student", schema = "edfDB", catalog = "")
public class StudentEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;
    @Basic
    @Column(name = "student_name")
    private String studentName;
    @Basic
    @Column(name = "student_vid")
    private String studentVid;
    @Basic
    @Column(name = "student_department")
    private String studentDepartment;
    @Basic
    @Column(name = "student_position")
    private String studentPosition;
    @Basic
    @Column(name = "student_start_date")
    private Date studentStartDate;
    @Basic
    @Column(name = "student_purpose")
    private String studentPurpose;
    @Basic
    @Column(name = "student_college_benefit")
    private String studentCollegeBenefit;
    @Basic
    @Column(name = "student_sign")
    private String studentSign;
    @Basic
    @Column(name = "student_sign_date")
    private Date studentSignDate;
    @Basic
    @Column(name = "student_email")
    private String studentEmail;
    @Basic
    @Column(name = "student_form_type")
    private Object studentFormType;
    @Basic
    @Column(name = "student_status")
    private Object studentStatus;
    @Basic
    @Column(name = "student_completed_time")
    private Timestamp studentCompletedTime;
    @OneToMany(mappedBy = "studentByStudentId")
    private Collection<CollegeEntity> collegesById;
    @OneToMany(mappedBy = "studentByStudentId")
    private Collection<EmployerEntity> employersById;
    @OneToMany(mappedBy = "studentByStudentId")
    private Collection<OdhrEntity> odhrsById;
    @OneToMany(mappedBy = "studentByStudentId")
    private Collection<SupervisorEntity> supervisorsById;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentVid() {
        return studentVid;
    }

    public void setStudentVid(String studentVid) {
        this.studentVid = studentVid;
    }

    public String getStudentDepartment() {
        return studentDepartment;
    }

    public void setStudentDepartment(String studentDepartment) {
        this.studentDepartment = studentDepartment;
    }

    public String getStudentPosition() {
        return studentPosition;
    }

    public void setStudentPosition(String studentPosition) {
        this.studentPosition = studentPosition;
    }

    public Date getStudentStartDate() {
        return studentStartDate;
    }

    public void setStudentStartDate(Date studentStartDate) {
        this.studentStartDate = studentStartDate;
    }

    public String getStudentPurpose() {
        return studentPurpose;
    }

    public void setStudentPurpose(String studentPurpose) {
        this.studentPurpose = studentPurpose;
    }

    public String getStudentCollegeBenefit() {
        return studentCollegeBenefit;
    }

    public void setStudentCollegeBenefit(String studentCollegeBenefit) {
        this.studentCollegeBenefit = studentCollegeBenefit;
    }

    public String getStudentSign() {
        return studentSign;
    }

    public void setStudentSign(String studentSign) {
        this.studentSign = studentSign;
    }

    public Date getStudentSignDate() {
        return studentSignDate;
    }

    public void setStudentSignDate(Date studentSignDate) {
        this.studentSignDate = studentSignDate;
    }

    public String getStudentEmail() {
        return studentEmail;
    }

    public void setStudentEmail(String studentEmail) {
        this.studentEmail = studentEmail;
    }

    public Object getStudentFormType() {
        return studentFormType;
    }

    public void setStudentFormType(Object studentFormType) {
        this.studentFormType = studentFormType;
    }

    public Object getStudentStatus() {
        return studentStatus;
    }

    public void setStudentStatus(Object studentStatus) {
        this.studentStatus = studentStatus;
    }

    public Timestamp getStudentCompletedTime() {
        return studentCompletedTime;
    }

    public void setStudentCompletedTime(Timestamp studentCompletedTime) {
        this.studentCompletedTime = studentCompletedTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        StudentEntity that = (StudentEntity) o;

        if (id != that.id) return false;
        if (studentName != null ? !studentName.equals(that.studentName) : that.studentName != null) return false;
        if (studentVid != null ? !studentVid.equals(that.studentVid) : that.studentVid != null) return false;
        if (studentDepartment != null ? !studentDepartment.equals(that.studentDepartment) : that.studentDepartment != null)
            return false;
        if (studentPosition != null ? !studentPosition.equals(that.studentPosition) : that.studentPosition != null)
            return false;
        if (studentStartDate != null ? !studentStartDate.equals(that.studentStartDate) : that.studentStartDate != null)
            return false;
        if (studentPurpose != null ? !studentPurpose.equals(that.studentPurpose) : that.studentPurpose != null)
            return false;
        if (studentCollegeBenefit != null ? !studentCollegeBenefit.equals(that.studentCollegeBenefit) : that.studentCollegeBenefit != null)
            return false;
        if (studentSign != null ? !studentSign.equals(that.studentSign) : that.studentSign != null) return false;
        if (studentSignDate != null ? !studentSignDate.equals(that.studentSignDate) : that.studentSignDate != null)
            return false;
        if (studentEmail != null ? !studentEmail.equals(that.studentEmail) : that.studentEmail != null) return false;
        if (studentFormType != null ? !studentFormType.equals(that.studentFormType) : that.studentFormType != null)
            return false;
        if (studentStatus != null ? !studentStatus.equals(that.studentStatus) : that.studentStatus != null)
            return false;
        if (studentCompletedTime != null ? !studentCompletedTime.equals(that.studentCompletedTime) : that.studentCompletedTime != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (studentName != null ? studentName.hashCode() : 0);
        result = 31 * result + (studentVid != null ? studentVid.hashCode() : 0);
        result = 31 * result + (studentDepartment != null ? studentDepartment.hashCode() : 0);
        result = 31 * result + (studentPosition != null ? studentPosition.hashCode() : 0);
        result = 31 * result + (studentStartDate != null ? studentStartDate.hashCode() : 0);
        result = 31 * result + (studentPurpose != null ? studentPurpose.hashCode() : 0);
        result = 31 * result + (studentCollegeBenefit != null ? studentCollegeBenefit.hashCode() : 0);
        result = 31 * result + (studentSign != null ? studentSign.hashCode() : 0);
        result = 31 * result + (studentSignDate != null ? studentSignDate.hashCode() : 0);
        result = 31 * result + (studentEmail != null ? studentEmail.hashCode() : 0);
        result = 31 * result + (studentFormType != null ? studentFormType.hashCode() : 0);
        result = 31 * result + (studentStatus != null ? studentStatus.hashCode() : 0);
        result = 31 * result + (studentCompletedTime != null ? studentCompletedTime.hashCode() : 0);
        return result;
    }

    public Collection<CollegeEntity> getCollegesById() {
        return collegesById;
    }

    public void setCollegesById(Collection<CollegeEntity> collegesById) {
        this.collegesById = collegesById;
    }

    public Collection<EmployerEntity> getEmployersById() {
        return employersById;
    }

    public void setEmployersById(Collection<EmployerEntity> employersById) {
        this.employersById = employersById;
    }

    public Collection<OdhrEntity> getOdhrsById() {
        return odhrsById;
    }

    public void setOdhrsById(Collection<OdhrEntity> odhrsById) {
        this.odhrsById = odhrsById;
    }

    public Collection<SupervisorEntity> getSupervisorsById() {
        return supervisorsById;
    }

    public void setSupervisorsById(Collection<SupervisorEntity> supervisorsById) {
        this.supervisorsById = supervisorsById;
    }
}
