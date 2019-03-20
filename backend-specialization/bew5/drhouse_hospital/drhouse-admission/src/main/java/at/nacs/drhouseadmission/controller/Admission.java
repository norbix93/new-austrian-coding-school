package at.nacs.drhouseadmission.controller;

import at.nacs.drhouseadmission.model.Patient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class Admission {
    private final DiagnosisClient client;

    public Patient admit(Patient newPatient) {
        String ID = UUID.randomUUID().toString();
        newPatient.setId(ID);
        return client.send(newPatient);
    }
}
