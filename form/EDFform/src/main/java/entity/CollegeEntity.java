package entity;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Timestamp;

@Entity
@Table(name = "college", schema = "edfDB", catalog = "")
public class CollegeEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;
    @Basic
    @Column(name = "college_course_name")
    private String collegeCourseName;
    @Basic
    @Column(name = "college_course_number")
    private String collegeCourseNumber;
    @Basic
    @Column(name = "college_credit_hours")
    private BigDecimal collegeCreditHours;
    @Basic
    @Column(name = "college_degree_title")
    private String collegeDegreeTitle;
    @Basic
    @Column(name = "college_name")
    private String collegeName;
    @Basic
    @Column(name = "college_coursestart_date")
    private Date collegeCoursestartDate;
    @Basic
    @Column(name = "college_courseend_date")
    private Date collegeCourseendDate;
    @Basic
    @Column(name = "college_partof_degree")
    private Byte collegePartofDegree;
    @Basic
    @Column(name = "college_degree_type")
    private Byte collegeDegreeType;
    @Basic
    @Column(name = "college_tuition_type")
    private Byte collegeTuitionType;
    @Basic
    @Column(name = "college_email")
    private String collegeEmail;
    @Basic
    @Column(name = "college_status")
    private Object collegeStatus;
    @Basic
    @Column(name = "college_completed_time")
    private Timestamp collegeCompletedTime;
    @Basic
    @Column(name = "student_id")
    private Integer studentId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCollegeCourseName() {
        return collegeCourseName;
    }

    public void setCollegeCourseName(String collegeCourseName) {
        this.collegeCourseName = collegeCourseName;
    }

    public String getCollegeCourseNumber() {
        return collegeCourseNumber;
    }

    public void setCollegeCourseNumber(String collegeCourseNumber) {
        this.collegeCourseNumber = collegeCourseNumber;
    }

    public BigDecimal getCollegeCreditHours() {
        return collegeCreditHours;
    }

    public void setCollegeCreditHours(BigDecimal collegeCreditHours) {
        this.collegeCreditHours = collegeCreditHours;
    }

    public String getCollegeDegreeTitle() {
        return collegeDegreeTitle;
    }

    public void setCollegeDegreeTitle(String collegeDegreeTitle) {
        this.collegeDegreeTitle = collegeDegreeTitle;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public Date getCollegeCoursestartDate() {
        return collegeCoursestartDate;
    }

    public void setCollegeCoursestartDate(Date collegeCoursestartDate) {
        this.collegeCoursestartDate = collegeCoursestartDate;
    }

    public Date getCollegeCourseendDate() {
        return collegeCourseendDate;
    }

    public void setCollegeCourseendDate(Date collegeCourseendDate) {
        this.collegeCourseendDate = collegeCourseendDate;
    }

    public Byte getCollegePartofDegree() {
        return collegePartofDegree;
    }

    public void setCollegePartofDegree(Byte collegePartofDegree) {
        this.collegePartofDegree = collegePartofDegree;
    }

    public Byte getCollegeDegreeType() {
        return collegeDegreeType;
    }

    public void setCollegeDegreeType(Byte collegeDegreeType) {
        this.collegeDegreeType = collegeDegreeType;
    }

    public Byte getCollegeTuitionType() {
        return collegeTuitionType;
    }

    public void setCollegeTuitionType(Byte collegeTuitionType) {
        this.collegeTuitionType = collegeTuitionType;
    }

    public String getCollegeEmail() {
        return collegeEmail;
    }

    public void setCollegeEmail(String collegeEmail) {
        this.collegeEmail = collegeEmail;
    }

    public Object getCollegeStatus() {
        return collegeStatus;
    }

    public void setCollegeStatus(Object collegeStatus) {
        this.collegeStatus = collegeStatus;
    }

    public Timestamp getCollegeCompletedTime() {
        return collegeCompletedTime;
    }

    public void setCollegeCompletedTime(Timestamp collegeCompletedTime) {
        this.collegeCompletedTime = collegeCompletedTime;
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

        CollegeEntity that = (CollegeEntity) o;

        if (id != that.id) return false;
        if (collegeCourseName != null ? !collegeCourseName.equals(that.collegeCourseName) : that.collegeCourseName != null)
            return false;
        if (collegeCourseNumber != null ? !collegeCourseNumber.equals(that.collegeCourseNumber) : that.collegeCourseNumber != null)
            return false;
        if (collegeCreditHours != null ? !collegeCreditHours.equals(that.collegeCreditHours) : that.collegeCreditHours != null)
            return false;
        if (collegeDegreeTitle != null ? !collegeDegreeTitle.equals(that.collegeDegreeTitle) : that.collegeDegreeTitle != null)
            return false;
        if (collegeName != null ? !collegeName.equals(that.collegeName) : that.collegeName != null) return false;
        if (collegeCoursestartDate != null ? !collegeCoursestartDate.equals(that.collegeCoursestartDate) : that.collegeCoursestartDate != null)
            return false;
        if (collegeCourseendDate != null ? !collegeCourseendDate.equals(that.collegeCourseendDate) : that.collegeCourseendDate != null)
            return false;
        if (collegePartofDegree != null ? !collegePartofDegree.equals(that.collegePartofDegree) : that.collegePartofDegree != null)
            return false;
        if (collegeDegreeType != null ? !collegeDegreeType.equals(that.collegeDegreeType) : that.collegeDegreeType != null)
            return false;
        if (collegeTuitionType != null ? !collegeTuitionType.equals(that.collegeTuitionType) : that.collegeTuitionType != null)
            return false;
        if (collegeEmail != null ? !collegeEmail.equals(that.collegeEmail) : that.collegeEmail != null) return false;
        if (collegeStatus != null ? !collegeStatus.equals(that.collegeStatus) : that.collegeStatus != null)
            return false;
        if (collegeCompletedTime != null ? !collegeCompletedTime.equals(that.collegeCompletedTime) : that.collegeCompletedTime != null)
            return false;
        if (studentId != null ? !studentId.equals(that.studentId) : that.studentId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (collegeCourseName != null ? collegeCourseName.hashCode() : 0);
        result = 31 * result + (collegeCourseNumber != null ? collegeCourseNumber.hashCode() : 0);
        result = 31 * result + (collegeCreditHours != null ? collegeCreditHours.hashCode() : 0);
        result = 31 * result + (collegeDegreeTitle != null ? collegeDegreeTitle.hashCode() : 0);
        result = 31 * result + (collegeName != null ? collegeName.hashCode() : 0);
        result = 31 * result + (collegeCoursestartDate != null ? collegeCoursestartDate.hashCode() : 0);
        result = 31 * result + (collegeCourseendDate != null ? collegeCourseendDate.hashCode() : 0);
        result = 31 * result + (collegePartofDegree != null ? collegePartofDegree.hashCode() : 0);
        result = 31 * result + (collegeDegreeType != null ? collegeDegreeType.hashCode() : 0);
        result = 31 * result + (collegeTuitionType != null ? collegeTuitionType.hashCode() : 0);
        result = 31 * result + (collegeEmail != null ? collegeEmail.hashCode() : 0);
        result = 31 * result + (collegeStatus != null ? collegeStatus.hashCode() : 0);
        result = 31 * result + (collegeCompletedTime != null ? collegeCompletedTime.hashCode() : 0);
        result = 31 * result + (studentId != null ? studentId.hashCode() : 0);
        return result;
    }
}
