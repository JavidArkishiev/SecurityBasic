package com.example.securtiynew.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.Size;

public record RegisterRequest(
        @Email
        String email,
        @Size(min = 4)
        String password
) {

}
