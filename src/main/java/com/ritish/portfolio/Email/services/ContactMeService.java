package com.ritish.portfolio.Email.services;

import com.ritish.portfolio.Email.dto.ContactMeDto;
import com.ritish.portfolio.Email.dto.GenericResponse;

public interface ContactMeService {
    GenericResponse sendMail(ContactMeDto contactMeDto);
}
