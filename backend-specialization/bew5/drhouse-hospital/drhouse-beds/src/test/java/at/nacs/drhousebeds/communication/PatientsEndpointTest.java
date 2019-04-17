package at.nacs.drhousebeds.communication;

import at.nacs.drhousebeds.controller.Nurse;
import at.nacs.drhousebeds.persistence.Patient;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.mock.mockito.SpyBean;
import org.springframework.boot.test.web.client.TestRestTemplate;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.verify;
import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.*;

@SpringBootTest(webEnvironment = RANDOM_PORT)
class PatientsEndpointTest {

    @Autowired
    TestRestTemplate restTemplate;

    @MockBean
    AccountancyClient client;

    @SpyBean
    Nurse nurse;

    @Test
    void post() {
        String url = "/patients";
        Patient patient = Patient.builder()
                .id("123")
                .name("Norbert")
                .treatment("Sorry, the treatment is not in our database. " +
                        "You have to see Dr. House again.")
                .build();
        Patient actual = restTemplate.postForObject(url, patient, Patient.class);
        String id = actual.getId();

        verify(nurse).provideTreatment(patient);
        assertThat(actual).isNotNull();
        assertThat(actual.getId()).isNotBlank();
        assertThat(actual.getId()).isEqualTo(id);
    }
}