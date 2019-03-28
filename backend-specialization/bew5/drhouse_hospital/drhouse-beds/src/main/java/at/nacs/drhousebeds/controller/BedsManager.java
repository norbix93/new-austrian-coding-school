package at.nacs.drhousebeds.controller;

import at.nacs.drhousebeds.persistence.BedsRepository;
import at.nacs.drhousebeds.persistence.Patient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BedsManager {
    private final BedsRepository repository;

    public Patient save(Patient patient) {
        return repository.save(patient);
    }
}
