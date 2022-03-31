package com.projects.projectSpring.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
public class Patient {

    private UUID id;
    private String name;
    private String email;
    private String doctorName;
    private String phoneNumber;
    private String password;
}
