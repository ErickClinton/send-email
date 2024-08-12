package com.erick.sendemail.sendemail.email;

import com.erick.sendemail.sendemail.email.entity.EmailEntity;
import jakarta.mail.MessagingException;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/email")
public class EmailController {

    private final EmailService emailService;

    public EmailController(EmailService emailService){
        this.emailService = emailService;
    }

    @PostMapping
    public void sendEmail(@RequestBody EmailEntity email) throws MessagingException {
        this.emailService.sendEmail(email);
    }
}
