import com.itextpdf.forms.PdfAcroForm;
import com.itextpdf.forms.fields.PdfFormField;
import com.itextpdf.forms.fields.PdfTextFormField;
import com.itextpdf.kernel.color.Color;
import com.itextpdf.kernel.geom.PageSize;
import com.itextpdf.kernel.geom.Rectangle;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfReader;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.kernel.pdf.canvas.PdfCanvas;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.AreaBreak;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Text;

import java.io.FileNotFoundException;
import java.io.IOException;

public class GeneratePDF {

    public static void main(String[] args) throws IOException {
        String pdf = createPdf();
        String destination = "edf_form_edited.pdf"; // Destination for edited form

        manipulatePdf(pdf, destination);
    }
    private static String createPdf() throws FileNotFoundException {
        String path = "edf_form.pdf";

        PdfWriter pdfWriter = new PdfWriter(path);
        PdfDocument pdfDocument = new PdfDocument(pdfWriter);
        pdfDocument.setDefaultPageSize(PageSize.A4);
        Document doc = new Document(pdfDocument);

        Paragraph placeholder = new Paragraph("");
        doc.add(placeholder);

        doc.close();

        return path;
    }

    private static void manipulatePdf(String src, String destination) throws IOException {
        PdfReader reader = new PdfReader(src);
        PdfWriter writer = new PdfWriter(destination);
        PdfDocument pdf = new PdfDocument(reader, writer);
        Document doc = new Document(pdf);

        PdfAcroForm form = PdfAcroForm.getAcroForm(pdf, true);

        Paragraph oneSpace = new Paragraph("");

        doc.add(new Paragraph("REQUEST FOR EMPLOYEE DEVELOPMENT FUNDS"));

        // Section 1
        doc.add(new Paragraph("1. Employee Information"));
        doc.add(new Paragraph("Name:"));
        PdfFormField nameTF = PdfTextFormField.createText(
                        pdf, new Rectangle(75, 730, 200, 20), "text", "")
                .setFontSize(12);
        form.addField(nameTF);

        doc.add(new Paragraph("Employee VID:"));
        PdfFormField empVidTF = PdfTextFormField.createText(
                        pdf, new Rectangle(120, 705, 200, 20), "text", "")
                .setFontSize(12); // Change the x offset to empVid + 125 and y offset to same as nameTF when on one line
        form.addField(empVidTF);

        doc.add(new Paragraph("Department:"));
        PdfFormField deptTF = PdfTextFormField.createText(
                        pdf, new Rectangle(120, 680, 200, 20), "text", "")
                .setFontSize(12);
        form.addField(deptTF);

        doc.add(new Paragraph("Position:"));
        PdfFormField posTF = PdfTextFormField.createText(
                        pdf, new Rectangle(120, 655, 200, 20), "text", "")
                .setFontSize(12);
        form.addField(posTF);

        doc.add(new Paragraph("Start date of Full-Time Employment:"));
        PdfFormField startTF = PdfTextFormField.createText(
                        pdf, new Rectangle(230, 630, 200, 20), "text", "")
                .setFontSize(12);
        form.addField(startTF);

        doc.add(new Paragraph("Budget information:"));

        doc.add(new Paragraph("Invoice:"));
        PdfFormField invoiceTF = PdfTextFormField.createText(
                        pdf, new Rectangle(120, 580, 200, 20), "text", "")
                .setFontSize(12);
        form.addField(invoiceTF);

        doc.add(new Paragraph("Account #:"));
        PdfFormField accountTF = PdfTextFormField.createText(
                        pdf, new Rectangle(120, 555, 200, 20), "text", "")
                .setFontSize(12);
        form.addField(accountTF);

        doc.add(new Paragraph("Complete Section 2 or 3, then complete sections 4 and5.").setFontSize(10));


        // Section 2
        doc.add(new Paragraph("2. Academic Information (Use this section for external college or university courses"));

        doc.add(new Paragraph("Course name:").setFontSize(12));
        PdfFormField courseNameTF = PdfTextFormField.createText(
                        pdf, new Rectangle(120, 475, 200, 20), "text", "")
                .setFontSize(12);
        form.addField(courseNameTF);

        doc.add(new Paragraph("Course number:").setFontSize(12));
        PdfFormField courseNumTF = PdfTextFormField.createText(
                        pdf, new Rectangle(125, 450, 200, 20), "text", "")
                .setFontSize(12);
        form.addField(courseNumTF);

        doc.add(new Paragraph("Credit Hours:").setFontSize(12));
        PdfFormField creditHrTF = PdfTextFormField.createText(
                        pdf, new Rectangle(120, 423, 200, 20), "text", "")
                .setFontSize(12);
        form.addField(creditHrTF);

        doc.add(new Paragraph("Title of degree/certificate program:"));
        PdfFormField programTF = PdfTextFormField.createText(
                        pdf, new Rectangle(230, 395, 200, 20), "text", "")
                .setFontSize(12);
        form.addField(programTF);

        doc.add(new Paragraph("College/University:"));
        PdfFormField schoolTF = PdfTextFormField.createText(
                        pdf, new Rectangle(140, 370, 200, 20), "text", "")
                .setFontSize(12);
        form.addField(schoolTF);

        doc.add(new Paragraph("Course Dates:"));

        doc.add(new Paragraph("Start:"));
        PdfFormField courseStartTF = PdfTextFormField.createText(
                        pdf, new Rectangle(120, 320, 200, 20), "text", "")
                .setFontSize(12);
        form.addField(courseStartTF);

        doc.add(new Paragraph("End:"));
        PdfFormField courseEndTF = PdfTextFormField.createText(
                        pdf, new Rectangle(120, 290, 200, 20), "text", "")
                .setFontSize(12);
        form.addField(courseEndTF);

        // The checkboxes need to be horizontal

        Rectangle checkboxRect = new Rectangle(100, 250, 10, 10);
        PdfFormField yesToDegree = PdfFormField.createCheckBox(pdf, checkboxRect, "yes", "Yes")
                .setBorderColor(Color.BLUE)
                .setBorderWidth(2)
                .setFontSize(10);
        PdfFormField denyToDegree = PdfFormField.createCheckBox(pdf, checkboxRect.moveUp(-20), "no", "No")
                .setBorderColor(Color.BLUE)
                .setBorderWidth(2)
                .setFontSize(10);

        drawCheckboxSymbol(pdf, checkboxRect.getLeft(), checkboxRect.getBottom());
        Paragraph yesParagraph = new Paragraph().add(new Text("Yes")).setFixedPosition(120, 250, 50).setMargin(0);
        Paragraph noParagraph = new Paragraph().add(new Text("No")).setFixedPosition(120, 230, 50).setMargin(0);

        doc.add(new Paragraph("Is this course part of a degree program?")).setFontSize(10);
        doc.add(yesParagraph);
        form.addField(yesToDegree);
        doc.add(noParagraph);
        form.addField(denyToDegree);
        doc.add(oneSpace);
        doc.add(oneSpace);
        doc.add(oneSpace);
        doc.add(oneSpace);

        doc.add(new Paragraph("If yes, check the degree type that applies."));
        Rectangle degCheckboxRect = new Rectangle(100, 200, 10, 10);
        PdfFormField doctorateDegree = PdfFormField.createCheckBox(pdf, degCheckboxRect, "doctorate", "Doctorate")
                .setBorderColor(Color.BLUE)
                .setBorderWidth(2)
                .setFontSize(10);
        PdfFormField mastersDegree = PdfFormField.createCheckBox(pdf, degCheckboxRect.moveUp(-20), "masters", "Master's")
                .setBorderColor(Color.BLUE)
                .setBorderWidth(2)
                .setFontSize(10);
        PdfFormField bachelorsDegree = PdfFormField.createCheckBox(pdf, degCheckboxRect.moveUp(-20), "bachelors", "Bachelors")
                .setBorderColor(Color.BLUE)
                .setBorderWidth(2)
                .setFontSize(10);
        PdfFormField associatesDegree = PdfFormField.createCheckBox(pdf, degCheckboxRect.moveUp(-20), "associates", "Associates")
                .setBorderColor(Color.BLUE)
                .setBorderWidth(2)
                .setFontSize(10);

        drawCheckboxSymbol(pdf, degCheckboxRect.getLeft(), degCheckboxRect.getBottom());
        Paragraph doctoratePara = new Paragraph().add(new Text("Doctorate")).setFixedPosition(120, 200, 50).setMargin(0);
        Paragraph mastersPara = new Paragraph().add(new Text("Master's")).setFixedPosition(120, 180, 50).setMargin(0);
        Paragraph bachelorsPara = new Paragraph().add(new Text("Bachelors")).setFixedPosition(120, 160, 50).setMargin(0);
        Paragraph associatesPara = new Paragraph().add(new Text("Associates")).setFixedPosition(120, 140, 50).setMargin(0);

        doc.add(doctoratePara);
        doc.add(mastersPara);
        doc.add(bachelorsPara);
        doc.add(associatesPara);
        form.addField(doctorateDegree);
        form.addField(mastersDegree);
        form.addField(bachelorsDegree);
        form.addField(associatesDegree);
        doc.add(new AreaBreak());

        doc.add(new Paragraph("(Employee Development funds will not cover books, application fees or tuition already funded by other sources. Funds are" +
                "limited to $1,100 per fiscal year.)"));
        doc.add(new Paragraph("How will tuition be paid for? (Check one option)"));

        Rectangle paymentCheckboxRect = new Rectangle(100, 725, 10, 10);
        PdfFormField valDirect = PdfFormField.createCheckBox(pdf, paymentCheckboxRect, "valDirect", "Valencia")
                .setBorderColor(Color.BLUE)
                .setBorderWidth(2)
                .setFontSize(10);
        PdfFormField valReimburse = PdfFormField.createCheckBox(pdf, paymentCheckboxRect.moveUp(-20), "valReimburse", "Valencia reimburses employee for out of pocket tuition cost.")
                .setBorderColor(Color.BLUE)
                .setBorderWidth(2)
                .setFontSize(10);

        drawCheckboxSymbol(pdf, paymentCheckboxRect.getLeft(), paymentCheckboxRect.getBottom());
        Paragraph valDirectPara = new Paragraph().add(new Text("Valencia pays institution directly")).setFixedPosition(120, 720, 300).setMargin(0);
        Paragraph valReimbursePara = new Paragraph().add(new Text("Valencia reimburses employee for out of pocket tuition cost.")).setFixedPosition(120, 700, 300).setMargin(0);
        doc.add(valDirectPara);
        form.addField(valDirect);
        doc.add(valReimbursePara);
        form.addField(valReimburse);

        doc.add(oneSpace);
        doc.add(oneSpace);
        doc.add(oneSpace);
        doc.add(oneSpace);
        doc.add(oneSpace);
        doc.add(oneSpace);

        doc.add(new Paragraph("If you selected “Valencia pays institution directly,” submit a check request form along with this" +
                "application. Payee will be your institution. Include printout of your tuition invoice and class schedule. If" +
                "you selected “Valencia reimburses employee for out of pocket cost,” please submit a check request" +
                "form with this application. Payee will be yourself. Include your paid receipt and class schedule."));


        // Section 3
        doc.add(new Paragraph("3. Conference/ Workshop/ Seminar/ Training CourseInformation").setFontSize(12));

        doc.add(new Paragraph("Title:").setFontSize(12));
        PdfFormField courseTitleTF = PdfTextFormField.createText(
                        pdf, new Rectangle(120, 580, 200, 20), "text", "")
                .setFontSize(12);
        form.addField(courseTitleTF);

        doc.add(new Paragraph("Host organization (if applicable):").setFontSize(12));
        PdfFormField hostOrgTF = PdfTextFormField.createText(
                        pdf, new Rectangle(210, 555, 200, 20), "text", "")
                .setFontSize(12);
        form.addField(hostOrgTF);

        doc.add(new Paragraph("Location:").setFontSize(12));
        PdfFormField locationTF = PdfTextFormField.createText(
                        pdf, new Rectangle(120, 530, 200, 20), "text", "")
                .setFontSize(12);
        form.addField(locationTF);

        doc.add(new Paragraph("Dates:").setFontSize(12));

        doc.add(new Paragraph("Start:").setFontSize(12));
        PdfFormField courseDatesStartTF = PdfTextFormField.createText(
                        pdf, new Rectangle(120, 480, 200, 20), "text", "")
                .setFontSize(12);
        form.addField(courseDatesStartTF);

        doc.add(new Paragraph("End:").setFontSize(12));
        PdfFormField courseDatesEndTF = PdfTextFormField.createText(
                        pdf, new Rectangle(120, 450, 200, 20), "text", "")
                .setFontSize(12);
        form.addField(courseDatesEndTF);

        doc.add(new Paragraph("Cost of Registration:").setFontSize(12));
        PdfFormField regCostTF = PdfTextFormField.createText(
                        pdf, new Rectangle(150, 425, 200, 20), "text", "")
                .setFontSize(12);
        form.addField(regCostTF);

        doc.add(new Paragraph("How will the registration be paid for"));
        Rectangle regPayCheckboxRect = new Rectangle(100, 380, 10, 10);
        PdfFormField pCard = PdfFormField.createCheckBox(pdf, regPayCheckboxRect, "pCard", "P-Card")
                .setBorderColor(Color.BLUE)
                .setBorderWidth(2)
                .setFontSize(10);
        PdfFormField check = PdfFormField.createCheckBox(pdf, regPayCheckboxRect.moveUp(-20), "check", "Check Request")
                .setBorderColor(Color.BLUE)
                .setBorderWidth(2)
                .setFontSize(10);
        PdfFormField journalEntry = PdfFormField.createCheckBox(pdf, regPayCheckboxRect.moveUp(-20), "journalEntry", "Journal")
                .setBorderColor(Color.BLUE)
                .setBorderWidth(2)
                .setFontSize(10);
        PdfFormField traveler = PdfFormField.createCheckBox(pdf, regPayCheckboxRect.moveUp(-20), "traveler", "Traveler")
                .setBorderColor(Color.BLUE)
                .setBorderWidth(2)
                .setFontSize(10);

        Paragraph pCardPara = new Paragraph().add(new Text("P-Card")).setFixedPosition(120, 380, 200).setMargin(0);
        Paragraph checkPara = new Paragraph().add(new Text("Check Request")).setFixedPosition(120, 360, 200).setMargin(0);
        Paragraph journalEntryPara = new Paragraph().add(new Text("Journal Entry (only for internal conferences hosted by Valencia College)")).setFixedPosition(120, 340, 350).setMargin(0);
        Paragraph travelerPara = new Paragraph().add(new Text("Traveler to Pay (employee will be reimbursed on per diem after the conference.)")).setFixedPosition(120, 320, 400).setMargin(0);

        doc.add(pCardPara);
        form.addField(pCard);
        doc.add(checkPara);
        form.addField(check);
        doc.add(journalEntryPara);
        form.addField(journalEntry);
        doc.add(travelerPara);
        form.addField(traveler);

        doc.add(oneSpace);
        doc.add(oneSpace);
        doc.add(oneSpace);
        doc.add(oneSpace);
        doc.add(oneSpace);
        doc.add(oneSpace);
        doc.add(oneSpace);
        doc.add(oneSpace);
        doc.add(oneSpace);
        doc.add(oneSpace);

        doc.add(new Paragraph("4. Purpose (Why are you taking this course or attending this conference?)").setFontSize(12));
        Rectangle largeTextArea = new Rectangle(35, 235, 500, 60);
        PdfTextFormField purposeTF = PdfTextFormField.createMultilineText(pdf, largeTextArea, "purposeTF", "");
        form.addField(purposeTF);

        doc.add(oneSpace);
        doc.add(oneSpace);
        doc.add(oneSpace);
        doc.add(oneSpace);
        doc.add(oneSpace);
        doc.add(oneSpace);
        doc.add(oneSpace);

        doc.add(new Paragraph("5. Benefit to the College (How will this course or conference aid you in your job or future" +
                "professional position?)").setFontSize(12));
        PdfTextFormField benefitTF = PdfTextFormField.createMultilineText(pdf, largeTextArea.moveUp(-100), "purposeTF", "");
        form.addField(benefitTF);

        doc.add(oneSpace);
        doc.add(oneSpace);
        doc.add(oneSpace);
        doc.add(oneSpace);
        doc.add(oneSpace);
        doc.add(oneSpace);
        doc.add(oneSpace);

        doc.add(new Paragraph("Employee Signature").setFontSize(12));
        PdfFormField signatureTF = PdfTextFormField.createText(
                        pdf, new Rectangle(150, 110, 200, 20), "text", "")
                .setFontSize(12);
        form.addField(signatureTF);

        doc.add(new Paragraph("Date").setFontSize(12));
        PdfFormField signDateTF = PdfTextFormField.createText(
                        pdf, new Rectangle(150, 85, 200, 20), "text", "")
                .setFontSize(12);
        form.addField(signDateTF);
        // End of Page one


        doc.add(new AreaBreak());

        doc.add(new Paragraph("SUPERVISOR APPROVAL:"));
        Paragraph supAppPara = new Paragraph("I, ").setFontSize(12);

        supAppPara.add(" (print name) acknowledge that this development" +
                "opportunity is approved for the following reasons: (include how the course work or conference will" +
                "improve the applicant’s effectiveness and any other reasons for approval.").setFontSize(12);
        doc.add(supAppPara);
        doc.add(new Paragraph("(This section is required.)"));















        doc.close();
        reader.close();
        writer.close();

    }

    private static void drawCheckboxSymbol(PdfDocument pdfDocument, float x, float y) {
        PdfCanvas canvas = new PdfCanvas(pdfDocument.getFirstPage());
        canvas.setStrokeColor(Color.BLACK);
        canvas.setLineWidth(1);
        canvas.rectangle(x, y, 10, 10);
        canvas.stroke();
    }

}
