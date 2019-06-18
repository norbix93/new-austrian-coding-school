package at.nacs.drhousediagnosis.controller;

import at.nacs.drhousediagnosis.communication.BedsClient;
import at.nacs.drhousediagnosis.communication.PharmacyClient;
import at.nacs.drhousediagnosis.model.Patient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
@RequiredArgsConstructor
public class DrHouse {

    private final Database database;
    private final BedsClient bedsClient;
    private final PharmacyClient pharmacyClient;

    public Patient createDiagnosis(Patient patient) {
        Map<String, String> diseases = database.loadContent();
        String diagnosis = diseases.get(patient.getSymptoms());
        patient.setDiagnosis(diagnosis);
        if (patient.getDiagnosis().equalsIgnoreCase("Chickenpox")) {
            return bedsClient.send(patient);
        } else return pharmacyClient.send(patient);
    }
}
