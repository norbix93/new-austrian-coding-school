package at.nacs.drhousediagnoses.controller;

import at.nacs.drhousediagnoses.model.Patient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DrHouse {

    public void createDiagnosis(Patient patient) {
        patient.setDiagnosis("lupus");
    }
}
