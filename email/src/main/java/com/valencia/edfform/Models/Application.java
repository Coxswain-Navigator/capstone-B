package com.valencia.edfform.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.util.Date;

@Entity
public class Application {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int applicationId;
    private String studentName;

    private String studentVid;
    private String studentDepartment;
    private String studentPosition;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date studentStartDate;
    private String studentPurpose;
    private String studentCollegeBenefit;
    private String studentIndexNum;
    private String studentAccountNum;
    private String studentSign;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date studentSignDate;
    private String studentEmail;
    private StudentFormType studentFormType;
    private StudentStatus studentStatus;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date studentCompletedTime;
    private String supervisorName;
    private String supervisorExplain;
    private String supervisorSign;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date supervisorSignDate;
    private String supervisorEmail;
    private SupervisorStatus supervisorStatus;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date supervisorCompletedTime;
    private String odhrFunds;
    private String odhrEligibility;
    private String odhrComment;
    private String odhrSign;
    private String odhrName;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date odhrSignDate;
    private String odhrEmail;
    private ODHRStatus odhrStatus;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date odhrCompletedTime;
    private String employerTrainingTitle;
    private String employerHostOrg;
    private String employerLocation;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date employerLocationStartDate;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date employerLocationEndDate;
    private BigDecimal employerRegistrationCost;
    private String employerRegistrationPay;
    private String employerEmail;
    private EmployerStatus employerStatus;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date employerCompletedTime;
    private String collegeCourseName;
    private String collegeCourseNumber;
    private BigDecimal collegeCreditHours;
    private String collegeDegreeTitle;
    private String collegeName;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date collegeCourseStartDate;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date collegeCourseEndDate;
    private String collegePartOfDegree;
    private String collegeDegreeType;
    private String collegeTuitionType;
    private String collegeEmail;
    private CollegeStatus collegeStatus;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date collegeCompletedTime;
    private BigDecimal collegeTuitionCost;
    private String collegeFundsRequested;




    // Getters and Setters (you can generate these using your IDE or write manually)

    // Helper Enums
    public enum StudentFormType {
        EMPLOYER, COLLEGE
    }

    public enum StudentStatus {
        NOT_COMPLETED, COMPLETED
    }

    public enum SupervisorStatus {
        NOT_COMPLETED, COMPLETED
    }

    public enum ODHRStatus {
        NOT_COMPLETED, COMPLETED
    }

    public enum EmployerStatus {
        NOT_COMPLETED, COMPLETED
    }

    public enum CollegeStatus {
        NOT_COMPLETED, COMPLETED
    }

    public Application(){

    }

    public Application(int applicationId, String studentName, String studentVid, String studentDepartment, String studentPosition, Date studentStartDate, String studentPurpose, String studentCollegeBenefit, String studentIndexNum, String studentAccountNum, String studentSign, Date studentSignDate, String studentEmail, StudentFormType studentFormType, StudentStatus studentStatus, Date studentCompletedTime, String supervisorName, String supervisorExplain, String supervisorSign, Date supervisorSignDate, String supervisorEmail, SupervisorStatus supervisorStatus, Date supervisorCompletedTime, String odhrFunds, String odhrEligibility, String odhrComment, String odhrSign, String odhrName, Date odhrSignDate, String odhrEmail, ODHRStatus odhrStatus, Date odhrCompletedTime, String employerTrainingTitle, String employerHostOrg, String employerLocation, Date employerLocationStartDate, Date employerLocationEndDate, BigDecimal employerRegistrationCost, String employerRegistrationPay, String employerEmail, EmployerStatus employerStatus, Date employerCompletedTime, String collegeCourseName, String collegeCourseNumber, BigDecimal collegeCreditHours, String collegeDegreeTitle, String collegeName, Date collegeCourseStartDate, Date collegeCourseEndDate, String collegePartOfDegree, String collegeDegreeType, String collegeTuitionType, String collegeEmail, CollegeStatus collegeStatus, Date collegeCompletedTime, BigDecimal collegeTuitionCost, String collegeFundsRequested) {
        this.applicationId = applicationId;
        this.studentName = studentName;
        this.studentVid = studentVid;
        this.studentDepartment = studentDepartment;
        this.studentPosition = studentPosition;
        this.studentStartDate = studentStartDate;
        this.studentPurpose = studentPurpose;
        this.studentCollegeBenefit = studentCollegeBenefit;
        this.studentIndexNum = studentIndexNum;
        this.studentAccountNum = studentAccountNum;
        this.studentSign = studentSign;
        this.studentSignDate = studentSignDate;
        this.studentEmail = studentEmail;
        this.studentFormType = studentFormType;
        this.studentStatus = studentStatus;
        this.studentCompletedTime = studentCompletedTime;
        this.supervisorName = supervisorName;
        this.supervisorExplain = supervisorExplain;
        this.supervisorSign = supervisorSign;
        this.supervisorSignDate = supervisorSignDate;
        this.supervisorEmail = supervisorEmail;
        this.supervisorStatus = supervisorStatus;
        this.supervisorCompletedTime = supervisorCompletedTime;
        this.odhrFunds = odhrFunds;
        this.odhrEligibility = odhrEligibility;
        this.odhrComment = odhrComment;
        this.odhrSign = odhrSign;
        this.odhrName = odhrName;
        this.odhrSignDate = odhrSignDate;
        this.odhrEmail = odhrEmail;
        this.odhrStatus = odhrStatus;
        this.odhrCompletedTime = odhrCompletedTime;
        this.employerTrainingTitle = employerTrainingTitle;
        this.employerHostOrg = employerHostOrg;
        this.employerLocation = employerLocation;
        this.employerLocationStartDate = employerLocationStartDate;
        this.employerLocationEndDate = employerLocationEndDate;
        this.employerRegistrationCost = employerRegistrationCost;
        this.employerRegistrationPay = employerRegistrationPay;
        this.employerEmail = employerEmail;
        this.employerStatus = employerStatus;
        this.employerCompletedTime = employerCompletedTime;
        this.collegeCourseName = collegeCourseName;
        this.collegeCourseNumber = collegeCourseNumber;
        this.collegeCreditHours = collegeCreditHours;
        this.collegeDegreeTitle = collegeDegreeTitle;
        this.collegeName = collegeName;
        this.collegeCourseStartDate = collegeCourseStartDate;
        this.collegeCourseEndDate = collegeCourseEndDate;
        this.collegePartOfDegree = collegePartOfDegree;
        this.collegeDegreeType = collegeDegreeType;
        this.collegeTuitionType = collegeTuitionType;
        this.collegeEmail = collegeEmail;
        this.collegeStatus = collegeStatus;
        this.collegeCompletedTime = collegeCompletedTime;
        this.collegeTuitionCost = collegeTuitionCost;
        this.collegeFundsRequested = collegeFundsRequested;
    }

    public int getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(int applicationId) {
        this.applicationId = applicationId;
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

    public String getStudentIndexNum() {
        return studentIndexNum;
    }

    public void setStudentIndexNum(String studentIndexNum) {
        this.studentIndexNum = studentIndexNum;
    }

    public String getStudentAccountNum() {
        return studentAccountNum;
    }

    public void setStudentAccountNum(String studentAccountNum) {
        this.studentAccountNum = studentAccountNum;
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

    public StudentFormType getStudentFormType() {
        return studentFormType;
    }

    public void setStudentFormType(StudentFormType studentFormType) {
        this.studentFormType = studentFormType;
    }

    public StudentStatus getStudentStatus() {
        return studentStatus;
    }

    public void setStudentStatus(StudentStatus studentStatus) {
        this.studentStatus = studentStatus;
    }

    public Date getStudentCompletedTime() {
        return studentCompletedTime;
    }

    public void setStudentCompletedTime(Date studentCompletedTime) {
        this.studentCompletedTime = studentCompletedTime;
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

    public SupervisorStatus getSupervisorStatus() {
        return supervisorStatus;
    }

    public void setSupervisorStatus(SupervisorStatus supervisorStatus) {
        this.supervisorStatus = supervisorStatus;
    }

    public Date getSupervisorCompletedTime() {
        return supervisorCompletedTime;
    }

    public void setSupervisorCompletedTime(Date supervisorCompletedTime) {
        this.supervisorCompletedTime = supervisorCompletedTime;
    }

    public String getOdhrFunds() {
        return odhrFunds;
    }

    public void setOdhrFunds(String odhrFunds) {
        this.odhrFunds = odhrFunds;
    }

    public String getOdhrEligibility() {
        return odhrEligibility;
    }

    public void setOdhrEligibility(String odhrEligibility) {
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

    public ODHRStatus getOdhrStatus() {
        return odhrStatus;
    }

    public void setOdhrStatus(ODHRStatus odhrStatus) {
        this.odhrStatus = odhrStatus;
    }

    public Date getOdhrCompletedTime() {
        return odhrCompletedTime;
    }

    public void setOdhrCompletedTime(Date odhrCompletedTime) {
        this.odhrCompletedTime = odhrCompletedTime;
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

    public Date getEmployerLocationStartDate() {
        return employerLocationStartDate;
    }

    public void setEmployerLocationStartDate(Date employerLocationStartDate) {
        this.employerLocationStartDate = employerLocationStartDate;
    }

    public Date getEmployerLocationEndDate() {
        return employerLocationEndDate;
    }

    public void setEmployerLocationEndDate(Date employerLocationEndDate) {
        this.employerLocationEndDate = employerLocationEndDate;
    }

    public BigDecimal getEmployerRegistrationCost() {
        return employerRegistrationCost;
    }

    public void setEmployerRegistrationCost(BigDecimal employerRegistrationCost) {
        this.employerRegistrationCost = employerRegistrationCost;
    }

    public String getEmployerRegistrationPay() {
        return employerRegistrationPay;
    }

    public void setEmployerRegistrationPay(String employerRegistrationPay) {
        this.employerRegistrationPay = employerRegistrationPay;
    }

    public String getEmployerEmail() {
        return employerEmail;
    }

    public void setEmployerEmail(String employerEmail) {
        this.employerEmail = employerEmail;
    }

    public EmployerStatus getEmployerStatus() {
        return employerStatus;
    }

    public void setEmployerStatus(EmployerStatus employerStatus) {
        this.employerStatus = employerStatus;
    }

    public Date getEmployerCompletedTime() {
        return employerCompletedTime;
    }

    public void setEmployerCompletedTime(Date employerCompletedTime) {
        this.employerCompletedTime = employerCompletedTime;
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

    public Date getCollegeCourseStartDate() {
        return collegeCourseStartDate;
    }

    public void setCollegeCourseStartDate(Date collegeCourseStartDate) {
        this.collegeCourseStartDate = collegeCourseStartDate;
    }

    public Date getCollegeCourseEndDate() {
        return collegeCourseEndDate;
    }

    public void setCollegeCourseEndDate(Date collegeCourseEndDate) {
        this.collegeCourseEndDate = collegeCourseEndDate;
    }

    public String getCollegePartOfDegree() {
        return collegePartOfDegree;
    }

    public void setCollegePartOfDegree(String collegePartOfDegree) {
        this.collegePartOfDegree = collegePartOfDegree;
    }

    public String getCollegeDegreeType() {
        return collegeDegreeType;
    }

    public void setCollegeDegreeType(String collegeDegreeType) {
        this.collegeDegreeType = collegeDegreeType;
    }

    public String getCollegeTuitionType() {
        return collegeTuitionType;
    }

    public void setCollegeTuitionType(String collegeTuitionType) {
        this.collegeTuitionType = collegeTuitionType;
    }

    public String getCollegeEmail() {
        return collegeEmail;
    }

    public void setCollegeEmail(String collegeEmail) {
        this.collegeEmail = collegeEmail;
    }

    public CollegeStatus getCollegeStatus() {
        return collegeStatus;
    }

    public void setCollegeStatus(CollegeStatus collegeStatus) {
        this.collegeStatus = collegeStatus;
    }

    public Date getCollegeCompletedTime() {
        return collegeCompletedTime;
    }

    public void setCollegeCompletedTime(Date collegeCompletedTime) {
        this.collegeCompletedTime = collegeCompletedTime;
    }

    public BigDecimal getCollegeTuitionCost() {
        return collegeTuitionCost;
    }

    public void setCollegeTuitionCost(BigDecimal collegeTuitionCost) {
        this.collegeTuitionCost = collegeTuitionCost;
    }

    public String getCollegeFundsRequested() {
        return collegeFundsRequested;
    }

    public void setCollegeFundsRequested(String collegeFundsRequested) {
        this.collegeFundsRequested = collegeFundsRequested;
    }
}
