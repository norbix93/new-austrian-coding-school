package at.nacs.drhousebeds.controller;

import at.nacs.drhousebeds.configuration.BedsConfiguration;
import at.nacs.drhousebeds.persistence.Disease;
import at.nacs.drhousebeds.persistence.Patient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
@RequiredArgsConstructor
public class Nurse {

    private final Database database;

    String provideTreatment(Patient patient) {
        Map<String, String> diseases = database.loadContent();
        String diagnosis = patient.getDiagnosis();
        return diseases.entrySet().stream()
                .filter(condition -> condition.getKey().equalsIgnoreCase(diagnosis))
                .map(treatment -> treatment.getValue())
                .findFirst()
                .orElse("Sorry, the treatment is not in our database.");
    }
}
