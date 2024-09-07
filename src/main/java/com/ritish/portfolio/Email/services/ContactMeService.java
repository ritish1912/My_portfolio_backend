package com.ritish.portfolio.Email.services;

import com.ritish.portfolio.Email.dto.ContactMeDto;

public interface ContactMeService {
    void sendMail(ContactMeDto contactMeDto);
}
