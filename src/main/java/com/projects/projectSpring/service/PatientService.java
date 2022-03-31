package com.projects.projectSpring.service;

import com.projects.projectSpring.model.Patient;
import com.projects.projectSpring.request.PatientRequest;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class PatientService {

    public Patient createPatient(PatientRequest patientRequest){
     Patient patient = new Patient(
             UUID.randomUUID(),
             patientRequest.getName(),
             patientRequest.getDoctorName(),
             patientRequest.getEmail(),
             patientRequest.getPhoneNumber(),
             patientRequest.getSenha()
     );

     return patient;
    }
}
