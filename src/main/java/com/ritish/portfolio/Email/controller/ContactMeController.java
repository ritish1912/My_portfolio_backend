package com.ritish.portfolio.Email.controller;

import com.ritish.portfolio.Email.dto.ContactMeDto;
import com.ritish.portfolio.Email.dto.GenericResponse;
import com.ritish.portfolio.Email.services.ContactMeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class ContactMeController {

  @Autowired
  ContactMeService contactMeService;
  @PostMapping("sendMail")
  GenericResponse sendMail(@RequestBody ContactMeDto contactMeDto)
  {
    System.out.println(contactMeDto);
     contactMeService.sendMail(contactMeDto);
     return GenericResponse.builder().response_code(1).message("Thanks for reaching out! I’ll get back to you soon.").build();
  }

}
