package at.nacs.drhouse_accountancy.persistence.patient;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PatientRepository extends JpaRepository<Patient, Long> {

    Optional<Patient> findOneByUuid(String uuid);

    Optional<Patient> findOneByName(String name);
}
