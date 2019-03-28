package at.nacs.drhousepharmacy.controller;

import at.nacs.drhousepharmacy.persistence.Patient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
@RequiredArgsConstructor
public class Apothecary {

    private final Database database;
    private final PharmacyManager manager;

    public Patient provideMedicament(Patient patient) {
        Map<String, String> diseases = database.loadContent();
        String diagnosis = patient.getDiagnosis();
        String medicine = diseases.entrySet().stream()
                .filter(condition -> condition.getKey().equalsIgnoreCase(diagnosis))
                .map(cure -> cure.getValue())
                .findFirst()
                .orElse("Sorry, the medicine is not in our database. " +
                        "You have to see Dr. House again.");
        patient.setMedicine(medicine);
        return manager.save(patient);
    }
}
