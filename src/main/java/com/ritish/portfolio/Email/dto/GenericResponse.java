package com.ritish.portfolio.Email.dto;

import lombok.*;

@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GenericResponse {
    private int response_code;
    private String message;
}
