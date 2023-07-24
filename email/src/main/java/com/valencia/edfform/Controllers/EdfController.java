package com.valencia.edfform.Controllers;


import com.valencia.edfform.Models.Application;
import com.valencia.edfform.Repository.ApplicationRepo;
import com.valencia.edfform.Services.EmailSenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
public class EdfController {

    @Autowired
    private ApplicationRepo applicationRepo;

    @Autowired
    private EmailSenderService emailSenderService;

    @GetMapping("/edf")
    public String Edf(Model model){
        model.addAttribute("currentRole", "STUDENT");

        model.addAttribute("application", new Application());
        return "edf";
    }

    @GetMapping("/supervisor/{id}")
    public String Supervisor(Model model, @PathVariable Long id){
        Optional<Application> app = applicationRepo.findById(id);
        model.addAttribute("currentRole", "SUPERVISOR");
        model.addAttribute("application", app);
        return "edf";
    }

    @GetMapping("/odhr/{id}")
    public String Odhr(Model model, @PathVariable Long id){
        Optional<Application> app = applicationRepo.findById(id);
        model.addAttribute("currentRole", "ODHR");
        model.addAttribute("application", app);
        return "edf";
    }

    @GetMapping("/approved/{id}")
    public String Approved(Model model, @PathVariable Long id){
        Optional<Application> app = applicationRepo.findById(id);
        model.addAttribute("currentRole", "APPROVED");
        model.addAttribute("application", app);
        return "edf";
    }

    @PostMapping("/submit")
    public String Submit(@ModelAttribute Application application, Model model, @RequestParam("currentRole") String currentRole){

        // Find old application and delete

        var existingApplication = applicationRepo.findByStudentVid(application.getStudentVid());
        if (existingApplication != null){
            applicationRepo.delete(existingApplication);
        }

        var a = applicationRepo.save(application);

        String supervisorEmail = "valenciac.professor@gmail.com";
        String odhrEmail = "valencia.humanr@gmail.com";
        String studentEmail = a.getStudentEmail();

        switch (currentRole){
            case "STUDENT":
                sendEmail(a, "supervisor", supervisorEmail);
                break;
            case "SUPERVISOR":
                sendEmail(a, "odhr", odhrEmail);
                break;
            case "ODHR":
                sendEmail(a, "approved", studentEmail);
                break;
        }

        model.addAttribute("application", application);
        return "success";

    }

    private void sendEmail(Application a, String role, String toEmail){
        String link = "http://localhost:8080/" + role + "/" + a.getApplicationId();

        String body = "";

        body += "<p> A new EDF application was submitted by "+a.getStudentName()+". Please verify and sign here: </p>";
        body += "<a href="+link+"> Click here to review the application. </a>";
        body += "<p> Thank you. -Valencia College </p>";

        emailSenderService.sendEmail(toEmail, "EDF APPLICATION", body);
    }


}
