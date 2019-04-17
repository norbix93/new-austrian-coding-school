package at.nacs.drhousebeds.communication;

import at.nacs.drhousebeds.controller.BedsManager;
import at.nacs.drhousebeds.controller.Nurse;
import at.nacs.drhousebeds.persistence.Patient;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/patients")
public class PatientsEndpoint {
    private final Nurse nurse;
    private final BedsManager manager;

    @PostMapping
    public Patient post(@RequestBody Patient patient) {
        nurse.provideTreatment(patient);
        return manager.save(patient);
    }
}
