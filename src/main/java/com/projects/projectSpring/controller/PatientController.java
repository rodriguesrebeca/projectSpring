package com.projects.projectSpring.controller;

import com.projects.projectSpring.model.Patient;
import com.projects.projectSpring.request.PatientRequest;
import com.projects.projectSpring.response.PatientResponse;
import com.projects.projectSpring.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;
import java.util.UUID;

@RestController
@RequestMapping("/patient")
public class PatientController {

    @Autowired
    PatientService patientService;


    public ResponseEntity<PatientResponse> createPatient(
            @RequestBody @Valid PatientRequest patientRequest,
            UriComponentsBuilder uriComponentsBuilder){

        Patient patient = patientService.createPatient(patientRequest);

        URI uri = uriComponentsBuilder.path("/patient/{id}").buildAndExpand(patient.getId()).toUri();
        return ResponseEntity.created(uri).body(new PatientResponse(patient));
    }


    public Patient getPatient(){
        Patient patient = new Patient(UUID.randomUUID(),
                "Rebeca", "rebecarodrigues", "Maria",
                "123456789", "124567");
        return patient;
    }
}
