package at.nacs.drhouseadmission.communication;

import at.nacs.drhouseadmission.model.Patient;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequiredArgsConstructor
public class DiagnosisClient {

    private final RestTemplate restTemplate;

    @Value("${diagnosis.port}")
    private String diagnosisUrl;

    public Patient send(Patient patient) {
        return restTemplate.postForObject(diagnosisUrl, patient, Patient.class);
    }
}
