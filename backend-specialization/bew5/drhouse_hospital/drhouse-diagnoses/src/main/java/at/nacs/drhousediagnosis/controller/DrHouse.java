package at.nacs.drhousediagnosis.controller;

import at.nacs.drhousediagnosis.model.Patient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DrHouse {

    public void createDiagnosis(Patient patient) {
        patient.setDiagnosis("lupus");
    }
}
