package com.ritish.portfolio.Email.serviceImpl;

import com.ritish.portfolio.Email.dto.ContactMeDto;
import com.ritish.portfolio.Email.dto.GenericResponse;
import com.ritish.portfolio.Email.services.ContactMeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;


@Service
public class ContactMeServiceImpl implements ContactMeService {

    @Autowired
    private JavaMailSender javaMailSender;
    @Override
    public GenericResponse sendMail(ContactMeDto contactMeDto) {
        try{
            SimpleMailMessage message = new SimpleMailMessage();
            message.setFrom("ritishintern@gmail.com");
            message.setTo("ritishintern@gmail.com");
            message.setSubject("Message from " + contactMeDto.getName());
            message.setText(contactMeDto.getMessage() + "====> By " + contactMeDto.getEmail());

            javaMailSender.send(message);


            return GenericResponse.builder().response_code(1).message("Mail sent successfully").build();
        } catch (Exception e)
        {
            e.printStackTrace();
            return GenericResponse.builder().response_code(0).message(e.getLocalizedMessage()).build();

        }
    }
}
