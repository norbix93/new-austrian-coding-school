package at.nacs.drhousebeds.communication;

import at.nacs.drhousebeds.controller.BedsManager;
import at.nacs.drhousebeds.controller.Nurse;
import at.nacs.drhousebeds.persistence.BedsRepository;
import at.nacs.drhousebeds.persistence.Patient;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.mock.mockito.SpyBean;
import org.springframework.boot.test.web.client.TestRestTemplate;

import static org.mockito.Mockito.*;
import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.*;

@SpringBootTest(webEnvironment = RANDOM_PORT)
class PatientsEndpointTest {

    @Autowired
    TestRestTemplate restTemplate;

    @MockBean
    BedsRepository repository;

    @MockBean
    AccountancyClient client;

    @SpyBean
    Nurse nurse;

    @Test
    void post() {
        String url = "/patients";
        Patient patient = Patient.builder()
                .name("Norbert")
                .build();
        restTemplate.getForObject(url, patient, Patient.class);
        verify(nurse).provideTreatment(patient);
    }
}