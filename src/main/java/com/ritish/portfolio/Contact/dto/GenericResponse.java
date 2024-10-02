package com.ritish.portfolio.Contact.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
public class GenericResponse {
    private int response_code;
    private String message;
}
