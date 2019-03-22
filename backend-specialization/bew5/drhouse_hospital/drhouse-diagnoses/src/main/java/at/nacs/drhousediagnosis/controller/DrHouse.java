package at.nacs.drhousediagnosis.controller;

import at.nacs.drhousediagnosis.model.Patient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
@RequiredArgsConstructor
public class DrHouse {

    private final Database database;

    public String createDiagnosis(Patient patient) {
        Map<String, String> diseases = database.loadContent();
        String symptoms = patient.getSymptoms();
        return diseases.entrySet().stream()
                .filter(symptom -> symptom.getKey().equalsIgnoreCase(symptoms))
                .map(symptom -> symptom.getValue())
                .findFirst()
                .orElse("Lupus");
    }
}
