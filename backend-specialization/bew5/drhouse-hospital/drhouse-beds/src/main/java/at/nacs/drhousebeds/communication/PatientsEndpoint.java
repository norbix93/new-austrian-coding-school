package at.nacs.drhousebeds.communication;

import at.nacs.drhousebeds.controller.BedsManager;
import at.nacs.drhousebeds.controller.Nurse;
import at.nacs.drhousebeds.persistence.Patient;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/patients")
public class PatientsEndpoint {
    private final Nurse nurse;
    private final BedsManager manager;
    private final AccountancyClient client;

    @PostMapping
    public Patient post(@RequestBody Patient patient) {
        nurse.provideTreatment(patient);
        manager.save(patient);
        return client.send(patient);
    }
}
