package com.Kaala_dev.HSM.dto;


import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data

public class LoginRequest {

    @NotBlank(message="email is not blank")
    private String email;
    @NotBlank(message="password is required")
    private String password;
}
