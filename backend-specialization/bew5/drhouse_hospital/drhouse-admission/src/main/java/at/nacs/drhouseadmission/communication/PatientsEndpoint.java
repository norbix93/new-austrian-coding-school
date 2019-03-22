package at.nacs.drhouseadmission.communication;

import at.nacs.drhouseadmission.controller.Admission;
import at.nacs.drhouseadmission.model.Patient;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/patients")
@RequiredArgsConstructor
public class PatientsEndpoint {
    private final Admission admission;

    @PostMapping
    public Patient send(@RequestBody Patient patient) {
        admission.admit(patient);
        return patient;
    }
}
