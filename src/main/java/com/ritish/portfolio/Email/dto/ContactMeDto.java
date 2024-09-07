package com.ritish.portfolio.Email.dto;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ContactMeDto {

    private String name;
    private String email;
    private String message;

    @Override
    public String toString() {
        return "ContactMeDto{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
