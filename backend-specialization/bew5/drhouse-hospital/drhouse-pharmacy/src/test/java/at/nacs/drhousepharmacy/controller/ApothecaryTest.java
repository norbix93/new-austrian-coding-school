package at.nacs.drhousepharmacy.controller;

import at.nacs.drhousepharmacy.communication.AccountancyClient;
import at.nacs.drhousepharmacy.persistence.Patient;
import at.nacs.drhousepharmacy.persistence.PharmacyRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.*;

@SpringBootTest(webEnvironment = NONE)
class ApothecaryTest {

    @Autowired
    Apothecary apothecary;

    @Autowired
    PharmacyRepository repository;

    @MockBean
    AccountancyClient client;

    @BeforeEach
    void before() {
        repository.deleteAll();
    }

    @Test
    void provideMedicament() {
        Patient patient = Patient.builder()
                .name("Norbert")
                .diagnosis("Chickenpox")
                .build();
        Patient actual = apothecary.provideMedicament(patient);
        assertThat(actual).isNotNull();
        assertThat(actual.getMedicine()).isEqualTo("Buy this cream at the pharmacy, please.");
        assertThat(actual.getMedicine()).isNotBlank();
    }
}