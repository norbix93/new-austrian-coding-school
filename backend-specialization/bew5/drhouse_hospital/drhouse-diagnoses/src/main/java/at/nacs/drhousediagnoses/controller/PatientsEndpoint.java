package at.nacs.drhousediagnoses.controller;

import at.nacs.drhousediagnoses.model.Patient;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/patients")
@RequiredArgsConstructor
public class PatientsEndpoint {
    private final DrHouse drHouse;

    @PostMapping
    public Patient forward(@RequestBody Patient patient) {
        drHouse.createDiagnosis(patient);
        return patient;
    }
}
