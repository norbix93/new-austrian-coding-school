package at.nacs.drhouseadmission.controller;

import at.nacs.drhouseadmission.model.Patient;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/patients")
@RequiredArgsConstructor
public class PatientsEndpoint {
    private final Admission admission;

    @PostMapping
    public Patient generateID(@RequestBody Patient patient) {
        admission.admit(patient);
        return patient;
    }
}
