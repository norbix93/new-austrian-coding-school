package at.nacs.drhousebeds.controller;

import at.nacs.drhousebeds.persistence.Patient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
@RequiredArgsConstructor
public class Nurse {

    private final Database database;

    public Patient provideTreatment(Patient patient) {
        Map<String, String> diseases = database.loadContent();
        String diagnosis = patient.getDiagnosis();
        String treatment = diseases.entrySet().stream()
                .filter(condition -> condition.getKey().equalsIgnoreCase(diagnosis))
                .map(cure -> cure.getValue())
                .findFirst()
                .orElse("Sorry, the treatment is not in our database. " +
                        "You have to see Dr. House again.");
        patient.setTreatment(treatment);
        return patient;
    }
}
