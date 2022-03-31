package com.projects.projectSpring.request;

import lombok.Getter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Getter
public class PatientRequest {

    @NotEmpty @NotNull @Size(min=2)
    private String name;
    private String email;
    @NotEmpty @NotNull @Size(min=2)
    private String doctorName;
    @NotBlank @NotNull @Size(min=8)
    private String phoneNumber;
    @NotBlank @NotNull @Size(min=5)
    private String senha;
}
