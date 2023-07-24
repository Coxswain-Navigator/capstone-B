package com.valencia.edfform.Services;

import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.MimeMailMessage;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import org.springframework.mail.javamail.JavaMailSender;

import java.util.logging.Logger;

@Service
public class EmailSenderService {
    @Autowired
    private JavaMailSender mailSender;

    public void sendEmail(String toEmail, String subject, String body){
        MimeMessage message = mailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(message, "utf-8");

        try{
            helper.setFrom("edfsystem.valencia@gmail.com");
            helper.setTo(toEmail);
            helper.setText(body, true);
            helper.setSubject(subject);

            mailSender.send(message);
        }
        catch (MessagingException ex){
            System.out.println(ex);
        }

    }

}
