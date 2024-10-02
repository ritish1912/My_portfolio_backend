package com.ritish.portfolio.Contact.services;

import com.ritish.portfolio.Contact.dto.ContactMeDto;

public interface ContactMeService {
    void sendMail(ContactMeDto contactMeDto);
}
