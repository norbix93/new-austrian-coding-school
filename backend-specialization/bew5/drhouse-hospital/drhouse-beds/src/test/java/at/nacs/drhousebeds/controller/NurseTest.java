package at.nacs.drhousebeds.controller;

import at.nacs.drhousebeds.communication.AccountancyClient;
import at.nacs.drhousebeds.persistence.BedsRepository;
import at.nacs.drhousebeds.persistence.Patient;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.*;

@SpringBootTest(webEnvironment = NONE)
class NurseTest {

    @Autowired
    Nurse nurse;

    @Autowired
    BedsRepository repository;

    @MockBean
    AccountancyClient client;

    @BeforeEach
    void before() {
        repository.deleteAll();
    }

    @Test
    void provideTreatment() {
        Patient patient = Patient.builder()
                .name("Norbert")
                .diagnosis("Chickenpox")
                .build();
        Patient actual = nurse.provideTreatment(patient);
        assertThat(actual).isNotNull();
        assertThat(actual.getTreatment()).isEqualTo("Wait for the doctor to get the cream prescribed, please.");
        assertThat(actual.getTreatment()).isNotBlank();
    }
}