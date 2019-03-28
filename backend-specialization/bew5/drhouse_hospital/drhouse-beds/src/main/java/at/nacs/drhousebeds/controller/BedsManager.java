package at.nacs.drhousebeds.controller;

import at.nacs.drhousebeds.persistence.BedsRepository;
import at.nacs.drhousebeds.persistence.Patient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BedsManager {
    private final BedsRepository repository;
    private final Nurse nurse;

    Patient save(Patient patient) {
        nurse.provideTreatment(patient);
        return repository.save(patient);
    }
}
