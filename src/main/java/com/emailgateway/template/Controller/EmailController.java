package com.emailgateway.template.Controller;

import com.emailgateway.template.Modal.EmailModal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistration;

import javax.swing.*;

@CrossOrigin
@RestController
//@RequestMapping("/email")
public class EmailController {

    @Autowired
    private JavaMailSender javaMailSender;

    @PostMapping(value = "/send", headers = "content-type=application/x-www-form-urlencoded")
    public String SendEmail(
            @RequestParam("FirstName") String FirstName,
            @RequestParam("LastName") String LastName,
            @RequestParam("DOB") String DOB,
            @RequestParam("Gender") String Gender,
            @RequestParam("City") String City,
            @RequestParam("Tel_Number") String Tel_Number,
            @RequestParam("Email") String Email,
            @RequestParam("Profession") String Profession,
            @RequestParam("Skills") String Skills
    ){
        try{
            SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
            simpleMailMessage.setTo("madushanthmadu007@gmail.com");
            simpleMailMessage.setSubject("MEMBERSHIP REQUEST");

            EmailModal emailModal = new EmailModal(FirstName, LastName, DOB, Gender, City, Tel_Number, Email, Profession, Skills);
            simpleMailMessage.setText(emailModal.toString());//emailModal.getMessage()

            javaMailSender.send(simpleMailMessage);

            return "Success";
        }
        catch(Exception e){
            return "Failed";
        }
    }

//    @RequestMapping("/")
//    public ModelAndView welcome(){
//
//        ModelAndView model = new ModelAndView("/resources/static/");
//
//        return model;
//    }
}
