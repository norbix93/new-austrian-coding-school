package at.nacs.drhousepharmacy.controller;

import at.nacs.drhousepharmacy.persistence.PharmacyRepository;
import at.nacs.drhousepharmacy.persistence.Patient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PharmacyManager {
    private final PharmacyRepository repository;

    public Patient save(Patient patient) {
        return repository.save(patient);
    }
}
