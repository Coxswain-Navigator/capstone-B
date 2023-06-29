<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <title>EDF Form</title>
    <link rel="stylesheet" href="css/site.css">
</head>

<body>
<header>
    <nav>
        <a href="https://valenciacollege.edu/">Valencia College</a>
    </nav>
</header>
<main>
    <h1>REQUEST FOR EMPLOYEE DEVELOPMENT FUNDS</h1>

    <form action="" method="POST">
        <fieldset>
            <legend>1. Employee Information</legend>
            <div>
                <label for="studentName">Name:</label>
                <input type="text" id="studentName" name="studentName">
            </div>
            <div>
                <label for="studentVid">Employee VID:</label>
                <input type="text" id="studentVid" name="studentVid">
            </div>
            <div>
                <label for="studentDepartment">Department:</label>
                <input type="text" id="studentDepartment" name="studentDepartment">
            </div>
            <div>
                <label for="studentPosition">Position:</label>
                <input type="text" id="studentPosition" name="studentPosition">
            </div>
            <div>
                <label for="studentStartDate">Start date of Full-Time Employment:</label>
                <input type="date" id="studentStartDate" name="studentStartDate">
            </div>
            <div>
                <%--@declare id="budget"--%><label for="budget">Budget information:</label>
                <div>
                    <label for="index">Index:</label>
                    <!-- The following field is something that should be editable by an admin not the applicant -->
                    <input type="text" id="index" name="index">
                </div>
                <div>
                    <label for="account">Account #:</label>
                    <!-- The following field is something that should be editable by an admin not the applicant -->
                    <input type="text" id="account" name="account">
                </div>
            </div>
            <p>
                Complete Section 2 or 3, then complete sections 4 and 5.
            </p>
        </fieldset>

        <fieldset>
            <legend>2. Academic Information (Use this section for external college or university courses)</legend>
            <div>
                <label for="collegeCourseName">Course name:</label>
                <input type="text" id="collegeCourseName" name="collegeCourseName">
            </div>
            <div>
                <label for="collegeCourseNumber">Course number:</label>
                <input type="text" id="collegeCourseNumber" name="collegeCourseNumber">
            </div>
            <div>
                <label for="collegeCreditHours">Credit Hours:</label>
                <input type="text" id="collegeCreditHours" name="collegeCreditHours">
            </div>
            <div>
                <label for="collegeDegreeTitle">Title of degree/certificate program:</label>
                <input type="text" id="collegeDegreeTitle" name="collegeDegreeTitle">
            </div>
            <div>
                <label for="collegeName">College/University:</label>
                <input type="text" id="collegeName" name="collegeName">
            </div>
            <div>
                <label for="courseDates">Course dates:</label>
                <div>
                    <label for="collegeCoursestartDate">Start:</label>
                    <input type="date" id="collegeCoursestartDate" name="collegeCoursestartDate">
                </div>
                <div>
                    <label for="collegeCourseendDate">End:</label>
                    <input type="date" id="collegeCourseendDate" name="collegeCourseendDate">
                </div>
            </div>
            <div>
                <p>
                    Is this course part of a degree program?
                </p>
                <input type="radio" id="collegePartofDegreeYes" name="collegePartofDegree" value="yes">
                <label for="collegePartofDegreeYes">Yes</label>
                <input type="radio" id="collegePartofDegreeNo" name="collegePartofDegree" value="no">
                <label for="collegePartofDegreeNo">No</label>
            </div>
            <div>
                <p>
                    If yes, check the degree type that applies.
                </p>
                <input type="radio" id="doctorate" name="collegeDegreeType" value="doctorate">
                <label for="doctorate">Doctorate</label>
                <input type="radio" id="masters" name="collegeDegreeType" value="masters">
                <label for="masters">Master's</label>
                <input type="radio" id="bachelors" name="collegeDegreeType" value="bachelors">
                <label for="bachelors">Bachelors</label>
                <input type="radio" id="associates" name="collegeDegreeType" value="associates">
                <label for="associates">Associates</label>
            </div>
            <div>
                <div>
                    <label for="collegeTuitionCost">Total cost of tuition:</label>
                    <input type="text" id="collegeTuitionCost" name="collegeTuitionCost">
                </div>
                <div>
                    <p>
                        Employee Development Funds Requested?
                    </p>
                    <input type="radio" id="collegeFundsRequestedYes" name="collegeFundsRequested" value="yes">
                    <label for="collegeFundsRequestedYes">Yes</label>
                    <input type="radio" id="collegeFundsRequestedNo" name="collegeFundsRequested" value="no">
                    <label for="collegeFundsRequestedNo">No</label>
                </div>
            </div>
            <p>
                (Employee Development funds will not cover books, application fees or tuition already funded by other
                sources. Funds are
                limited to $1,100 per fiscal year.)
            </p>
            <p>
                How will tuition be paid for? (Check one option)
            </p>
            <input type="radio" id="valenciaPaysDirectly" name="collegeTuitionType" value="valenciaPaysDirectly">
            <label for="valenciaPaysDirectly">Valencia pays institution directly</label>
            <input type="radio" id="valenciaReimburses" name="CollegeTuitionType" value="valenciaReimburses">
            <label for="valenciaReimburses">Valencia reimburses employee for out of pocket tuition cost</label>
            <p>
                If you selected “Valencia pays institution directly,” submit a check request form along with this
                application. Payee will be your institution. Include printout of your tuition invoice and class schedule.
                If
                you selected “Valencia reimburses employee for out of pocket cost,” please submit a check request
                form with this application. Payee will be yourself. Include your paid receipt and class schedule.
            </p>
        </fieldset>

        <fieldset>
            <legend>3. Conference/ Workshop/ Seminar/ Training Course Information</legend>
            <div>
                <label for="employerTrainingTitle">Title:</label>
                <input type="text" id="employerTrainingTitle" name="employerTrainingTitle">
            </div>
            <div>
                <label for="employerHostOrg">Host organization (if applicable):</label>
                <input type="text" id="employerHostOrg" name="employerHostOrg">
            </div>
            <div>
                <label for="employerLocation">Location:</label>
                <input type="text" id="employerLocation" name="employerLocation">
            </div>
            <div>
                <label for="trainingDates">Dates:</label>
                <div>
                    <label for="employerLocationstartDate">Start:</label>
                    <input type="date" id="employerLocationstartDate" name="employerLocationstartDate">
                </div>
                <div>
                    <label for="employerLocationendDate">End:</label>
                    <input type="date" id="employerLocationendDate" name="employerLocationendDate">
                </div>
            </div>
            <div>
                <label for="employerRegistrationCost">Cost of Registration:</label>
                <input type="text" id="employerRegistrationCost" name="employerRegistrationCost">
            </div>
            <div>
                <p>
                    How will the registration be paid for
                </p>
                <input type="radio" id="pCard" name="employerRegistrationPay" value="pCard">
                <label for="pCard">P-Card</label>
                <input type="radio" id="checkRequest" name="employerRegistrationPay" value="checkRequest">
                <label for="checkRequest">Check Request</label>
                <input type="radio" id="journalEntry" name="employerRegistrationPay" value="journalEntry">
                <label for="journalEntry">Journal Entry (only for internal conferences hosted by Valencia College)</label>
                <input type="radio" id="travelerPay" name="employerRegistrationPay" value="travelerPay">
                <label for="travelerPay">Traveler to Pay (employee will be reimbursed on per diem after the conference.)</label>
            </div>
        </fieldset>

        <div>
            <label for="studentPurpose">4. Purpose (Why are you taking this course or attending this conference?)</label>
            <textarea id="studentPurpose" name="studentPurpose" rows="4" cols="100"></textarea>
        </div>

        <div>
            <label for="studentCollegeBenefit">5. Benefit to the College (How will this course or conference aid you in your job or
                future
                professional position?)</label>
            <textarea id="studentCollegeBenefit" name="studentCollegeBenefit" rows="4" cols="100"></textarea>
        </div>

        <div>
            <div>
                <label for="studentSign">Employee Signature:</label>
                <input type="text" id="studentSign" name="studentSign">
            </div>

            <div>
                <label for="studentSignDate">Date:</label>
                <input type="date" id="studentSignDate" name="studentSignDate">
            </div>
        </div>

        <fieldset>
            <legend>Supervisor Approval:</legend>
            <p>
                I,

                <label for="supervisorName"></label>
                <input type="text" id="supervisorName" name="supervisorName">

                (print name) acknowledge that this development
                opportunity is approved for the following reasons: (include how the course work or conference will
                improve the applicant’s effectiveness and any other reasons for approval).
            </p>
            <p>
                (This section is required.)
            </p>
            <div>
                <label for="supervisorExplain"></label>
                <textarea id="supervisorExplain" name="supervisorExplain" rows="4" cols="100"></textarea>
            </div>
            <p>
                I also acknowledge that should there be insufficient funds available in the employee’s EDF balance,
                my department budget may be billed for the balance due.
            </p>
            <div>
                <div>
                    <label for="supervisorSign">Supervisor Signature:</label>
                    <input type="text" id="supervisorSign" name="supervisorSign">
                </div>
                <div>
                    <label for="supervisorSignDate">Date:</label>
                    <input type="date" id="supervisorSignDate" name="supervisorSignDate">
                </div>
            </div>
        </fieldset>

        <ul>
            <li>This form must be completed and submitted within the fiscal year in which the course/
                conference/workshop began.</li>
            <li>To expedite processing and avoid delays email to: employeedevelopment@valenciacollege.edu;
                alternatively, you can interoffice hard copies to Employee Development, Mail Code 4-36.</li>
            <li>For assistance or to check your employee development balance email:
                employeedevelopment@valenciacollege.edu.</li>
            <li>Employees may be required to submit documentation of successful completion of the
                development experience or class.</li>
            <li>Employeesshouldmaintain records/institution transcripts, of course,completion for a
                minimum of two years from the start date of the course.</li>
            <li>If you would like to keep a record of this development opportunity, you may add it to your
                Valencia EDGE transcript. Log into the EDGE and click on the “My Learning” channel.
                Click “Your Transcript.” Then click “options” and select “Add External Training.”
                Complete the information about your development experience and click submit. Once
                your course or conference is complete, you can go back and click the “Mark
                Complete” button on your transcript.</li>
        </ul>

        <fieldset>
            <legend>
                ELIGIBILITY VERIFICATION – ODHR USE ONLY
            </legend>
            <div>
                <input type="radio" id="odhrFundsYes" name="odhrFunds" value="yes">
                <label for="odhrFundsYes">Funds available</label>
                <input type="radio" id="odhrFundsNo" name="odhrFunds" value="no">
                <label for="odhrFundsNo">Funds not available</label>
            </div>
            <p>
                If employee or development opportunity not eligible, select reason:
            </p>
            <div>
                <input type="radio" id="ineligibleExpense" name="odhrEligibility" value="ineligibleExpense">
                <label for="ineligibleExpense">Ineligible expense</label>
                <input type="radio" id="unaccreditedInstitution" name="odhrEligibility" value="unaccreditedInstitution">
                <label for="unaccreditedInstitution">Unaccredited institution</label>
                <input type="radio" id="insufficientFunds" name="odhrEligibility" value="insufficientFunds">
                <label for="insufficientFunds">Insufficient EDF Funds</label>
                <input type="radio" id="other" name="odhrEligibility" value="other">
                <label for="other">Other</label>
            </div>
            <div>
                <label for="odhrComment">Comment:</label>
                <textarea id="odhrComment" name="odhrComment" rows="4" cols="100"></textarea>
            </div>
            <div>
                <div>
                    <label for="odhrSign">ODHR Signature:</label>
                    <input type="text" id="odhrSign" name="odhrSign">
                </div>
                <div>
                    <label for="odhrName">Print Name:</label>
                    <input type="text" id="odhrName" name="odhrName">
                </div>
                <div>
                    <label for="odhrSignDate">Date:</label>
                    <input type="date" id="odhrSignDate" name="odhrSignDate">
                </div>
            </div>
        </fieldset>

        <h2>Instructions</h2>
        <ul>
            <li>
                STEP 1: COMPLETE EMPLOYEE INFORMATION
                <ul>
                    <li>Employee’s Name, VID, Department, Position and Start Date of full-time employment.</li>
                </ul>
            </li>
            <li>
                STEPS 2+3: COMPLETE COURSE INFORMATION OR CONFERENCE INFORMATION
                <div>
                    <p>
                        For Conference Information:
                    </p>
                    <p>
                        Complete all information
                    </p>
                    <ul>
                        <li>
                            P-card: Check this option if you are using a P-Card for the registration. Proof of payment must
                            be included with your paperwork.
                        </li>
                        <li>
                            Check Request: Check this option if you are requesting a physical check to pay for the
                            registration
                            fees. The check will be issued to the vendor.A completed Check Request form (which can be found
                            in Atlas under Valencia Forms)must be attached, listing the vendor’s name and vendor VID#.If you
                            pay for the registration fee in advance using personal funds, a check request can be submitted
                            with a payment receipt to be reimbursed for registration expenses.
                        </li>
                        <li>
                            Journal Entry: Check this option if you are attending a conference hosted by Valencia College.
                        </li>
                        <li>
                            Traveler to Pay: Check this option if you are using personal funds to cover the cost of
                            registration. You must submit a per diem (which can be found in Atlas under Valencia Forms)
                            after the conference
                            to be reimbursed. You must provide a receipt.
                        </li>
                        <li>
                            Submit agenda and complete Authorization toTravel form forall conferences.
                        </li>
                    </ul>
                </div>
            </li>
            <li>
                STEPS 4+5: COMPLETE PURPOSE AND BENEFIT TO COLLEGE
                <ul>
                    <li>
                        Purpose - Why are you taking this course or attending this conference?
                    </li>
                    <li>
                        Benefitto College-How will this course or conference aid you in your job or future professional
                        position?
                    </li>
                </ul>
            </li>
            <li>
                STEP 6: EMPLOYEE SIGNATURE AND DATE FORM
            </li>
            <li>
                STEP 7: DIRECT SUPERVISOR PRINTED NAME, LIST REASONS FOR APPROVAL, SIGN AND DATE FORM
                <ul>
                    <li>
                        Supervisor must list how course work or conference will improve the employee’s effectiveness and
                        any other reason for approval. This section is required.
                    </li>
                </ul>
            </li>
            <li>
                STEP 8: SEND THE COMPLETED FORM AND ALL SUPPORTING DOCUMENTS TO YOUR EMPLOYEE DEVELOPMENT.
            </li>
        </ul>

        <h2>Additional Resources</h2>
        <ul>
            <li>
                <!-- The current link on the form is broken -->
                <a href="">Employee, Dependent and Program Development Funds Policy</a>
            </li>
            <li>
                <a
                        href="https://valenciacollege.edu/employees/human-resources/documents/faq-employee-dependent-and-program-development-funds.pdf">Employee,
                    Dependent and Program Development Funds FAQs</a>
            </li>
            <li>
                Accounts Payable Contact Information
                <ul>
                    <li>
                        <a
                                href="https://valenciacollege.edu/employees/accounts-payable/">valenciacollege.edu/accounts-payable/</a>
                    </li>
                    <li>
                        Email: Accountspayable@valenciacollege.edu
                    </li>
                </ul>
            </li>
        </ul>
        <div>
            <button type="submit">Submit Form</button>
        </div>
    </form>

</main>
<footer>
    This form is a demo for a new Employee Development Funds application process for Valencia College.
    Created by: Natasha Phyle, Nicolo Perrelli, Adam Hunt, Craig Mackey, Mariele Felipe Pinheiro Rosa, Fernando
    Jiminez, Alex Visco
</footer>
</body>


</html>
