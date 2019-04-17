package at.nacs.drhouse_accountancy.logic;

import at.nacs.drhouse_accountancy.dto.PatientDTO;
import at.nacs.drhouse_accountancy.persistence.patient.Patient;
import at.nacs.drhouse_accountancy.persistence.patient.PatientRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PatientManager {

    private final PatientRepository patientRepository;

    private ModelMapper modelMapper = new ModelMapper();

    public Patient convertToPatient(PatientDTO patientDTO) {
        Patient patient = modelMapper.map(patientDTO, Patient.class);
        patient.setUuid(patientDTO.getId());
        return patient;
    }

    public Patient save(Patient patient) {
        patientRepository.save(patient);
        return patient;
    }
}
