package com.projects.projectSpring.response;

import com.projects.projectSpring.model.Patient;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
public class PatientResponse {

    private UUID id;
    private String name;
    private String email;
    private String doctorName;
    private String phoneNumber;

    public PatientResponse(Patient patient){
        this.id = patient.getId();
        this.name = patient.getName();
        this.email = patient.getEmail();
        this.doctorName = patient.getDoctorName();
        this.phoneNumber = patient.getPhoneNumber();
    }
}
