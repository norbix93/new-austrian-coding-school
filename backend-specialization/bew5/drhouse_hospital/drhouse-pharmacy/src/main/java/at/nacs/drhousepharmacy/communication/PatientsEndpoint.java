package at.nacs.drhousepharmacy.communication;

import at.nacs.drhousepharmacy.controller.Apothecary;
import at.nacs.drhousepharmacy.persistence.Patient;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/patients")
public class PatientsEndpoint {
    private final Apothecary apothecary;

    @PostMapping
    public Patient post(@RequestBody Patient patient) {
        return apothecary.provideMedicament(patient);
    }
}
