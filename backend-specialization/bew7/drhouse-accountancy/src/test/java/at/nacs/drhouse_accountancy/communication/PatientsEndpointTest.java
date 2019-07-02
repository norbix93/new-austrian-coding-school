package at.nacs.drhouse_accountancy.communication;

import at.nacs.drhouse_accountancy.dto.PatientDTO;
import at.nacs.drhouse_accountancy.logic.Accountant;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.web.client.TestRestTemplate;

import static org.mockito.Mockito.verify;
import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.RANDOM_PORT;

@SpringBootTest(webEnvironment = RANDOM_PORT)
class PatientsEndpointTest {

    @Autowired
    TestRestTemplate restTemplate;

    @MockBean
    Accountant accountant;

    String url = "/patients";

    PatientDTO patientDTO;

    @Test
    void post() {
        patientDTO = PatientDTO.builder()
                .id("123")
                .name("Nikola")
                .build();

        restTemplate.postForObject(url, patientDTO, PatientDTO.class);
        verify(accountant).invoice(patientDTO);
    }
}